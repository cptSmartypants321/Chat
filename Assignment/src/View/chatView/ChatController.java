package View.chatView;

import View.MemeViewHandler;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import model.ModelFactory;
import viewModel.MemeViewModelFactory;
import viewModel.chatViewModel;

public class ChatController {


    @FXML
    private TextArea Conversation;
    @FXML
    private TextField textField;
    @FXML
    private CheckBox lightCheckBox;
    @FXML
    private CheckBox darkCheckBox;
    @FXML
    private Button sendButton;
    @FXML
    private Button MemeButton;
    @FXML
    private Label TimeLabel;

    private chatViewModel viewModel;

    public void init(chatViewModel vm) {
        viewModel = vm;
        TimeLabel.textProperty().bind(viewModel.getTimeStamp());


        vm.getText().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                Conversation.appendText(newValue);

            }
        });

        textField.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if(event.getCode() == KeyCode.ENTER){
                    onSendButton();
                }
            }
        });

    }

    public void updateFields() {
        String[] data = new String[2];
        //Conversation

    }




    public void onSendButton() {
        Conversation.appendText("\n" + viewModel.getTimeStamp().getValue() + ": " + textField.getText());
        textField.clear();


    }
    public void sendMeme(String url)
    {
        Conversation.appendText(url);
    }


    public void onMemeButton(ActionEvent actionEvent) throws Exception {

        ModelFactory mf = new ModelFactory();
        MemeViewModelFactory vfm = new MemeViewModelFactory(mf);
        MemeViewHandler viewHandler = new MemeViewHandler(null,vfm);

        viewHandler.start();
    }
}
