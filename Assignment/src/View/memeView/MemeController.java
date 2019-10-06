package View.memeView;

import View.chatView.ChatController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
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
    private ChatController chat;
    public MemeController(){}
public void init(MemeViewModel viewModel)
{
    this.model=model;

}
public void onPress()
{
    if(imageView1.isPressed())
    {
        chat.sendMeme("https://pics.me.me/ah-see-you-re-a-man-of-culture-as-well-17311219.png");
    }
    if(imageView2.isPressed())
    {
        chat.sendMeme("https://i.kym-cdn.com/entries/icons/original/000/021/807/4d7.png");
    }
    if(imageView3.isPressed())
    {
        chat.sendMeme("https://i.kym-cdn.com/entries/icons/mobile/000/023/897/inhalegull.jpg");
    }
    if(imageView4.isPressed())
    {
        chat.sendMeme("https://i.kym-cdn.com/entries/icons/original/000/022/940/mockingspongebobbb.jpg");
    }
    if(imageView5.isPressed())
    {
        chat.sendMeme("https://i.kym-cdn.com/entries/icons/original/000/023/987/overcome.jpg");
    }
    if(imageView6.isPressed())
    {
        chat.sendMeme("https://i.kym-cdn.com/entries/icons/mobile/000/022/138/ollesafeee.jpg");
    }
    if(imageView7.isPressed())
    {
        chat.sendMeme("https://i.kym-cdn.com/photos/images/newsfeed/000/358/751/9e2.jpg");
    }
    if(imageView8.isPressed())
    {
        chat.sendMeme("https://i.kym-cdn.com/entries/icons/original/000/023/021/e02e5ffb5f980cd8262cf7f0ae00a4a9_press-x-to-doubt-memes-memesuper-la-noire-doubt-meme_419-238.png");
    }
    if(imageView9.isPressed())
    {
        chat.sendMeme("https://i.kym-cdn.com/entries/icons/original/000/022/978/yNlQWRM.jpg");
    }
}

public void setCancelButton (){

}


}
