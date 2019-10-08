package View.loginView;

import Server.Message;
import Server.User;
import View.FriendsViewHandler;
import View.LoginViewHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.ModelFactory;
import viewModel.FriendsListViewModelFactory;
import viewModel.LoginViewModel;

import javax.swing.*;


public class LoginController{

    private Message message;
    @FXML TextField username;

    @FXML Button login;

    private LoginViewHandler viewHandler;
    private LoginViewModel viewModel;
    private User user;

    public void init(LoginViewModel vm)
    {
        viewModel = vm;



    }


    public void onLogin(ActionEvent actionEvent) throws Exception {
        ModelFactory mf = new ModelFactory();
        FriendsListViewModelFactory vfm = new FriendsListViewModelFactory(mf);
        FriendsViewHandler friendsViewHandler = new FriendsViewHandler(null,vfm);


        Stage stage =(Stage) login.getScene().getWindow();

        stage.close();

        friendsViewHandler.start();




    }


}
