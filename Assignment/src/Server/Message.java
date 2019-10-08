package Server;

import javafx.scene.control.TextField;

import java.io.Serializable;

public class Message implements Serializable {

    private User username;
    private String messageBody;

    public Message(User username, String messageBody)
    {
        this.username = username;
        this.messageBody = messageBody;
    }



    public String getBody() {
        return messageBody;
    }
    public User getUser()
    {
        return username;
    }

    public String toString (){
        return "Username=" + username.toString() + ", \n" + messageBody + "\n";
    }

}
