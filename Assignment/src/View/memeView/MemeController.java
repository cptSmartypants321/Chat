package View.memeView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import viewModel.MemeViewModel;


public class MemeController {
    @FXML
    ImageView imageView1;
    @FXML
    ImageView imageView2;
    @FXML
    ImageView imageView3;
    @FXML
    ImageView imageView4;
    @FXML
    ImageView imageView5;
    @FXML
    ImageView imageView6;
    @FXML
    ImageView imageView7;
    @FXML
    ImageView imageView8;
    @FXML
    ImageView imageView9;

    @FXML
    Button cancelButton;


    private MemeViewModel model;
    private MemeViewSendController sendController;

public void init(MemeViewModel viewModel)
{
    this.model=viewModel;

}
public void onPress()
{
    if(imageView1.isPressed())
    {
        model.getModel().UpdateMeme();

    }
    if(imageView2.isPressed())
    {
        Image image=imageView2.getImage();
        sendController.sendMeme(image);
    }
    if(imageView3.isPressed()) {
        Image image=imageView3.getImage();
        sendController.sendMeme(image);
    }
    if(imageView4.isPressed())
    {
        Image image=imageView4.getImage();
        sendController.sendMeme(image);
    }
    if(imageView5.isPressed())
    {
        Image image=imageView5.getImage();
        sendController.sendMeme(image);
    }
    if(imageView6.isPressed())
    {
        Image image=imageView6.getImage();
        sendController.sendMeme(image);
    }
    if(imageView7.isPressed())
    {
        Image image=imageView7.getImage();
        sendController.sendMeme(image);
    }
    if(imageView8.isPressed())
    {
        Image image=imageView8.getImage();
        sendController.sendMeme(image);
    }
    if(imageView9.isPressed())
    {
        Image image=imageView9.getImage();
        sendController.sendMeme(image);
    }
}


    public void onCancelButton(ActionEvent actionEvent) {

    }
}
