package viewModel;

import View.friendslistView.FLController;
import javafx.beans.property.StringProperty;
import model.Model;


import javax.swing.text.html.ListView;
import java.beans.PropertyChangeEvent;

public class FriendsListViewModel {

    private Model dataModel;
    private StringProperty lastMessage;
    private FLController views;

    public FriendsListViewModel (Model dataModel)
    {
        this.dataModel = dataModel;
        dataModel.addPropertyChangeListener("NewMessage", evt -> newMessage(evt));
    }

    public void newMessage(PropertyChangeEvent evt) {

        String message = (String) evt.getNewValue();
        lastMessage.setValue(message);
    }

    public void setFriendsButton()
    {

    }

    public void setGroupButton()
    {

    }

    public void setGroup()
    {

    }


}
