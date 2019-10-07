package View;

import View.loginView.LoginController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import viewModel.ViewModelFactory;

import java.io.IOException;

public class LoginViewHandler {


    private Stage localStage;
    private ViewModelFactory viewModelFactory;

    public LoginViewHandler(Stage stage, ViewModelFactory viewModelFactory) {
        this.localStage = stage;
        this.viewModelFactory = viewModelFactory;
    }

    public void start() throws Exception {
        openView("Login");

    }

    public void close()
    {
        localStage.close();
    }

    public void openView(String viewToOpen) throws IOException {
        Scene scene = null;
        FXMLLoader loader = new FXMLLoader();
        Parent root = null;


        if ("Login".equals(viewToOpen)){
            loader.setLocation(getClass().getResource("loginView/login.fxml"));
            root = loader.load();
            LoginController view = loader.getController();
            view.init(viewModelFactory.getLoginViewModel());
            localStage.setTitle("Login");
        }

        scene = new Scene(root);
        localStage.setScene(scene);
        localStage.show();
    }
}
