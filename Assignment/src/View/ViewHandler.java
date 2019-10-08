package View;

import View.chatView.ChatController;
import View.friendsView.FriendsController;
import View.loginView.LoginController;
import View.memeView.MemeController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import viewModel.ViewModelFactories;

import java.io.IOException;

public class ViewHandler {

    private Stage stage;
    private ViewModelFactories viewModelFactory;


    public ViewHandler(Stage stage, ViewModelFactories viewModelFactory) {
        this.stage = stage;
        this.viewModelFactory = viewModelFactory;
    }


    public void openViewChatView() throws IOException {
        Scene scene = null;
        FXMLLoader loader = new FXMLLoader();
        Parent root = null;
        Stage s = new Stage();

        loader.setLocation(getClass().getResource("chatView/Chat.fxml"));

        root = loader.load();
        ChatController view = loader.getController();
        view.init(viewModelFactory.getChatViewModel());
        s.setTitle("Chat");


        scene = new Scene(root);
        s.setScene(scene);
        s.show();
    }

    public void openViewLoginView() throws IOException {
        Scene scene = null;
        FXMLLoader loader = new FXMLLoader();
        Parent root = null;
        Stage s = new Stage();

        loader.setLocation(getClass().getResource("loginView/login.fxml"));

        root = loader.load();
        LoginController view = loader.getController();
        view.init(viewModelFactory.getLViewModel());
        s.setTitle("Login");


        scene = new Scene(root);
        s.setScene(scene);
        s.show();

    }

    public void openViewFriendslistView() throws IOException {
        Scene scene = null;
        FXMLLoader loader = new FXMLLoader();
        Parent root = null;
        Stage s = new Stage();

        loader.setLocation(getClass().getResource("friendsView/friends.fxml"));

        root = loader.load();
        FriendsController view = loader.getController();
        view.init(viewModelFactory.getFLViewModel());
        s.setTitle("FriendsList");


        scene = new Scene(root);
        s.setScene(scene);
        s.show();
    }

    public void openViewMemeView() throws IOException {
        Scene scene = null;
        FXMLLoader loader = new FXMLLoader();
        Parent root = null;
        Stage s = new Stage();

        loader.setLocation(getClass().getResource("memeView/MemeView.fxml"));

        root = loader.load();
        MemeController view = loader.getController();
        view.init(viewModelFactory.getMViewModel());
        s.setTitle("Meme");


        scene = new Scene(root);
        s.setScene(scene);
        s.show();
    }
}

