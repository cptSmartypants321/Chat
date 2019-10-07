package Server;

import javafx.scene.control.TextField;

import java.io.Serializable;

public class Message implements Serializable {

    private String username;
    private String messageBody;

    public Message(String id, String messageBody)
    {
        this.username = id;
        this.messageBody = messageBody;
    }


    public String getUsername(){
        return username;
    }

    public void setUsername (TextField username) {
        this.username = username.getText();
    }

    public String getBody() {
        return messageBody;
    }

    public String toString (){
        return "Username=" + username + ", \"" + messageBody + "\"";
    }

}
