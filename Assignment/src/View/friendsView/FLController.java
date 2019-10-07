package View.friendsView;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import viewModel.FriendsListViewModel;
import viewModel.FriendsListViewModelFactory;

import javax.swing.text.html.ListView;

public class FLController
{
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

    public FLController(Stage stage, FriendsListViewModelFactory modelFactory){
    }

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


}
