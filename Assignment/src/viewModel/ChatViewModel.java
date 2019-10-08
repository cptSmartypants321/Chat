package viewModel;


import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import model.Model;

import java.beans.PropertyChangeEvent;

public class ChatViewModel {
    private StringProperty text;
    private StringProperty timeStamp;
    private Model model;

    public ChatViewModel(Model model){
        this.model = model;
        text = new SimpleStringProperty();
        timeStamp = new SimpleStringProperty();
        model.addPropertyChangeListener("data", evt -> UpdateData(evt));

    }

    public void UpdateData(PropertyChangeEvent evt){
        Platform.runLater(() -> {

            String[] updatedData = (String[]) evt.getNewValue();
            text.setValue(updatedData[1]);
            timeStamp.setValue(updatedData[0]);
        });
    }

    public StringProperty getText(){
        return text;
    }

    public StringProperty getTimeStamp(){

        return timeStamp;

    }
}
