package View.loginView;

import Server.Message;
import Server.SocketClient;
import Server.User;
import View.ViewHandler;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import model.ModelFactory;
import viewModel.LoginViewModel;
import viewModel.ViewModelFactories;


public class LoginController{

    private Message message;
    @FXML TextField username;

    @FXML Button login;

    private LoginViewModel viewModel;
    private User user;
    private SocketClient socketClient;

    public void init(LoginViewModel vm)
    {
        viewModel = vm;



    }



    public void onLogin() throws Exception {
        ModelFactory mf = new ModelFactory();
        ViewModelFactories vfm = new ViewModelFactories(mf);
        ViewHandler friendsViewHandler = new ViewHandler(null,vfm);


        Stage stage =(Stage) login.getScene().getWindow();

        stage.close();

        friendsViewHandler.openViewFriendslistView();



    }


}
