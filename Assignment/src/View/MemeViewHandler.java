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
        openView("Meme");
    }
    public void openView(String viewToOpen) throws IOException {
        Scene scene=null;
        FXMLLoader loader=new FXMLLoader();
        Parent root=null;

        loader.setLocation(getClass().getResource("View.memeView."+viewToOpen+".fxml"));
        root=loader.load();
        MemeController memeController=loader.getController();
        memeController.init(meme.getMemeViewModel());
        stage.setTitle("Meme");
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void close()
    {
        stage.close();
    }

}
