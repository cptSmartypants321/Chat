package View.friendsView;


import Server.UserList;
import View.ChatViewHandler;
import View.LoginViewHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import model.ModelFactory;
import viewModel.FriendsListViewModel;
import viewModel.FriendsListViewModelFactory;
import viewModel.ChatViewModelFactory;

import javax.swing.text.html.ListView;
import java.util.ArrayList;

public class FriendsController
{
    private ArrayList<UserList> userList;

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
        ChatViewModelFactory vfm = new ChatViewModelFactory(mf);
        ChatViewHandler viewHandler = new ChatViewHandler(null,vfm);

        viewHandler.start();



    }
}
