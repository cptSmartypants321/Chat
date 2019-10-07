package View;

import View.memeView.MemeController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import viewModel.MemeViewModel;
import viewModel.MemeViewModelFactory;

import java.io.IOException;

public class MemeViewHandler {
    private Stage stage;
    private MemeViewModelFactory meme;

    public MemeViewHandler(Stage stage, MemeViewModelFactory meme)
    {
        this.stage=stage;
        this.meme=meme;
    }

    public void start() throws Exception{
        openView("");
    }
    public void openView(String viewToOpen) throws IOException {
        Scene scene = null;
        FXMLLoader loader = new FXMLLoader();
        Parent root = null;
        Stage localStage = new Stage();

        loader.setLocation(getClass().getResource("memeView/MemeView.fxml"));

        root = loader.load();
        MemeController view = loader.getController();
        view.init(meme.getMemeViewModel());
        localStage.setTitle("Friends");


        scene = new Scene(root);
        localStage.setScene(scene);
        localStage.show();
    }
    public void close()
    {
        stage.close();
    }

}
