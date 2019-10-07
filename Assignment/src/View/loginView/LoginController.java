package View.loginView;

import Server.Client;
import Server.Message;
import View.ChatViewHandler;
import View.LoginViewHandler;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.ModelFactory;
import viewModel.chatViewModelFactory;
import viewModel.login.LoginViewModel;


public class LoginController{


    private ChatViewHandler chatViewHandler;
    private LoginViewHandler loginViewHandler;
    private Message message;
    @FXML TextField username;

    @FXML Button login;


    private LoginViewModel viewModel;

    public void init(LoginViewModel vm)
    {
        viewModel = vm;



    }


    public void onLogin(ActionEvent actionEvent) throws Exception {
        ModelFactory mf = new ModelFactory();
        chatViewModelFactory cvfm = new chatViewModelFactory(mf);
        Stage stage = null;
        ChatViewHandler viewHandler = new ChatViewHandler(null,cvfm);
            viewHandler.start();





    }
}
