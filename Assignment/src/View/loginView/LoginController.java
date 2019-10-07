package View.loginView;

import Server.Client;
import Server.Message;
import Server.User;
import View.ChatViewHandler;
import View.FriendsViewHandler;
import View.LoginViewHandler;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;
import model.ModelFactory;
import viewModel.FriendsListViewModelFactory;
import viewModel.LoginViewModel;
import viewModel.ViewModelFactory;
import viewModel.chatViewModelFactory;



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
