package View.loginView;

import View.ChatViewHandler;
import View.LoginViewHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import viewModel.login.LoginViewModel;


public class LoginController {


    private ChatViewHandler chatViewHandler;
    private LoginViewHandler loginViewHandler;
    @FXML TextField username;

    @FXML Button login;


    private LoginViewModel viewModel;

    public void init(LoginViewModel vm)
    {
        viewModel = vm;



    }


    public void onLogin(ActionEvent actionEvent) throws Exception {
            chatViewHandler.start();
            loginViewHandler.close();

    }
}
