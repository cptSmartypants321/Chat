package View.memeView;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import viewModel.MemeViewModel;

public class MemeViewSendController {
    @FXML
    ImageView imageViewSend;


    private MemeViewModel viewModel;

    public void init(MemeViewModel viewModel)
    {
        this.viewModel=viewModel;
    }

    public void sendMeme(Image image)
    {
        imageViewSend.setImage(image);
    }
    public void setImage(ImageView imageView)
    {
        imageViewSend.setImage(imageView.getImage());
    }
}
