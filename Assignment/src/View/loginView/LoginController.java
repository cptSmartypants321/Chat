package View.loginView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import viewModel.login.LoginViewModel;
import viewmodel.login.LoginViewModel;

public class LoginController {


    @FXML TextField username;

    @FXML Button login;


    private LoginViewModel viewModel;

    public void init(LoginViewModel vm)
    {
        viewModel = vm;



    }


    public void onLogin(ActionEvent actionEvent) {


    }
}
