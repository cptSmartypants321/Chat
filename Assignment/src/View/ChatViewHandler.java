package View;

import View.chatView.ChatController;
import View.loginView.LoginController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import viewModel.ChatViewModelFactory;

import java.io.IOException;

public class ChatViewHandler {
    private Stage stage;
    private ChatViewModelFactory viewModelFactory;


    public ChatViewHandler(Stage stage, ChatViewModelFactory viewModelFactory){
        this.stage = stage;
        this.viewModelFactory = viewModelFactory;
    }

    public void start() throws  Exception{
        openView("");
    }

    public void openView(String viewToOpen) throws IOException{
        Scene scene = null;
        FXMLLoader loader = new FXMLLoader();
        Parent root = null;
        Stage s = new Stage();

            loader.setLocation(getClass().getResource("chatView/Chat.fxml"));

            root = loader.load();
            ChatController view = loader.getController();
            view.init(viewModelFactory.getViewModel());
        s.setTitle("Chat");


        scene = new Scene(root);
        s.setScene(scene);
        s.show();
    }
}
