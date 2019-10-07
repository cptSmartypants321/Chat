package View;

import View.friendslistView.FLController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import viewModel.FriendsListViewModel;
import viewModel.FriendsListViewModelFactory;

import java.io.IOException;

public class FriendsViewHandler
{
    private Stage stage;
    private FriendsListViewModelFactory friendsListViewModelFactory;
    private FriendsListViewModel friendsListViewModel;

    public FriendsViewHandler(Stage stage, FriendsListViewModelFactory friendsListViewModelFactory)
    {
        this.stage = stage;
        this.friendsListViewModelFactory = friendsListViewModelFactory;
    }

    public void start() throws Exception
    {
        openView("Friendslist");
    }

    public void openView (String viewToOpen) throws IOException
    {
        Scene scene = null;
        FXMLLoader loader = new FXMLLoader();
        Parent root  = null;

        loader.setLocation(getClass().getResource("friendslistView/Friendslist.fxml"));
        root = loader.load();

        FLController view = loader.getController();
        view.init(friendsListViewModelFactory.getFriendsListViewModel());
        stage.setTitle("Friends list");

        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
