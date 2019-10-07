

import View.FriendsViewHandler;
import javafx.application.Application;
import javafx.stage.Stage;
import model.ModelFactory;
import viewModel.FriendsListViewModelFactory;


public class StartFriends extends Application
{
    @Override
    public void start (Stage stage) throws Exception
    {
        ModelFactory mf = new ModelFactory();
        FriendsListViewModelFactory vfm = new FriendsListViewModelFactory(mf);
        FriendsViewHandler friendsViewHandler = new FriendsViewHandler(stage,vfm);


        friendsViewHandler.start();

    }
}
