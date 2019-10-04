package View;

import View.loginView.LoginController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewHandler {


    //private Stage stage;
    private ViewModelFactory viewModelFactory;

    public ViewHandler(Stage stage, ViewModelFactory viewModelFactory) {
        // this.stage = stage;
        this.viewModelFactory = viewModelFactory;
    }

    public void start() throws Exception {
        openView("Login");

    }

    public void openView(String viewToOpen) throws IOException {
        Scene scene = null;
        FXMLLoader loader = new FXMLLoader();
        Parent root = null;
        Stage localStage = new Stage();


        if ("Login".equals(viewToOpen)){
            loader.setLocation(getClass().getResource("viewmodel/login/viewmodel.login.fxml"));
            root = loader.load();
            LoginController view = loader.getController();
            view.init(1);
            localStage.setTitle("Login");
        }

        scene = new Scene(root);
        localStage.setScene(scene);
        localStage.show();
    }
}
