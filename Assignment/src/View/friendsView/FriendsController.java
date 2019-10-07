package View.friendsView;


import Server.UserList;
import View.ChatViewHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import model.ModelFactory;
import viewModel.FriendsListViewModel;
import viewModel.FriendsListViewModelFactory;
import viewModel.chatViewModelFactory;

import javax.swing.text.html.ListView;

public class FriendsController
{

    private UserList users;
    @FXML
    Button startFriend;
    @FXML
    Button startGroup;
    @FXML
    Button createGroup;

    @FXML
    ListView friendsList;
    @FXML
    ListView groupList;

    private FriendsListViewModel viewModel;

    public void init(FriendsListViewModel viewModel)
    {
        this.viewModel = viewModel;
    }

    public void setStartFriend(FriendsListViewModel viewModel)
    {
        startFriend.getText().equals(users.toString());
    }

    public void setStartGroup(FriendsListViewModel viewModel)
    {

    }

    public void setCreateGroup()
    {

    }

    public void setFriendsList()
    {

    }


    public void OnChat(ActionEvent actionEvent) throws Exception {

        ModelFactory mf = new ModelFactory();
        chatViewModelFactory vfm = new chatViewModelFactory(mf);
        ChatViewHandler viewHandler = new ChatViewHandler(null,vfm);

        viewHandler.start();
    }
}
