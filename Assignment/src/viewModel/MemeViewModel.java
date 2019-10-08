package viewModel;

import View.memeView.MemeViewSendController;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.image.ImageView;
import model.Model;

public class MemeViewModel {
    private Model model;
    private StringProperty text ;
    private MemeViewSendController memeViewSendController;

    public MemeViewModel(Model model,MemeViewSendController memeViewSendController)
    {
        this.memeViewSendController=memeViewSendController;
        this.model=model;
        text=new SimpleStringProperty();

    }

    public Model getModel() {
        return model;
    }

    public void UpdateMeme(ImageView imageView)
    {
        memeViewSendController.setImage(imageView);
    }

}
