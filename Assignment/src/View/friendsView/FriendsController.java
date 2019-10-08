package View.friendsView;


import Server.UserList;
import View.ViewHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import model.ModelFactory;
import viewModel.FriendsListViewModel;
import viewModel.ViewModelFactories;

import java.util.ArrayList;

public class FriendsController
{

    private ArrayList<UserList> userList;

    private Server.Both.UserList user;
    @FXML
    Button startFriend;

    @FXML ListView friendsList;

    private FriendsListViewModel viewModel;

    public void init(FriendsListViewModel viewModel)
    {
        this.viewModel = viewModel;
    }

//   public void setFriendsList(ServerV1.Both.UserList temp)
//   {
//       for(int i=0;i<temp.getUserList().size();i++)
//       {
////           friendsList.setItems();
//       }
//   }
//    public String  getfriend()
//    {
//        (String)friendsList.getEditingIndex()
//    }


    public void OnChat(ActionEvent actionEvent) throws Exception {



        ModelFactory mf = new ModelFactory();
        ViewModelFactories vfm = new ViewModelFactories(mf);
        ViewHandler viewHandler = new ViewHandler(null,vfm);

        viewHandler.openViewChatView();




    }
}
