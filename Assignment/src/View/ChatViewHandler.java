package View;

import View.chatView.ChatController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import viewModel.chatViewModelFactory;

import java.io.IOException;

public class ChatViewHandler {
    private Stage stage;
    private chatViewModelFactory viewModelFactory;


    public ChatViewHandler(Stage stage, chatViewModelFactory viewModelFactory){
        this.stage = stage;
        this.viewModelFactory = viewModelFactory;
    }

    public void start() throws  Exception{
        openView("Chat");
    }

    public void openView(String viewToOpen) throws IOException{
        Scene scene = null;
        FXMLLoader loader = new FXMLLoader();
        Parent root = null;
        Stage s = new Stage();

            loader.setLocation(getClass().getResource("chatView/Chat.fxml"));
            root = loader.load();
            ChatController chat = loader.getController();
            chat.init(viewModelFactory.getViewModel());
            s.setTitle("Chat");


        scene = new Scene(root);
        s.setScene(scene);
        s.show();
    }
}
