package View;

import View.friendsView.FriendsController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import viewModel.FriendsListViewModelFactory;

import java.io.IOException;

public class FriendsViewHandler
{
    private Stage localStage;

    private FriendsListViewModelFactory friendsListViewModelFactory;

    public FriendsViewHandler(Stage localStage, FriendsListViewModelFactory friendsListViewModelFactory)
    {
        this.localStage = localStage;
        this.friendsListViewModelFactory = friendsListViewModelFactory;
    }

    public void start() throws Exception
    {
        openView("");
    }

    public void openView(String viewToOpen) throws IOException {
        Scene scene = null;
        FXMLLoader loader = new FXMLLoader();
        Parent root = null;
        localStage = new Stage();

        loader.setLocation(getClass().getResource("friendsView/friends.fxml"));

        root = loader.load();
        FriendsController view = loader.getController();
        view.init(friendsListViewModelFactory.getFriendsListViewModel());
        localStage.setTitle("Friends");


        scene = new Scene(root);
        localStage.setScene(scene);
        localStage.show();
    }
}
