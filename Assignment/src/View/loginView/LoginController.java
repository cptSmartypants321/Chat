package View.loginView;

import Server.Message;
import Server.SocketClient;
import Server.User;
import View.FriendsViewHandler;
import View.LoginViewHandler;
import View.ViewHandler;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
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
    private SocketClient socketClient;

    public void init(LoginViewModel vm,SocketClient socketClient)
    {
        viewModel = vm;
        this.socketClient=socketClient;

        username.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if(event.getCode() == KeyCode.ENTER){
                    try {
                        onLogin();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });

    }



    public void onLogin() throws Exception {

        ViewHandler viewHandler = null;
        assert false;
        viewHandler.openViewFriendslistView();

        User temp=new User(username.getText());
        socketClient.setUser(temp);

        Stage stage =(Stage) login.getScene().getWindow();

        stage.close();



        user = new User(username.getText());
        System.out.println(user.getUsername());






    }


}
