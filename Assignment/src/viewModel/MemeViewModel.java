package viewModel;

import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import model.Model;

import java.beans.PropertyChangeEvent;

public class MemeViewModel {
    private Model model;
    private StringProperty text ;
    public MemeViewModel(Model model)
    {
        this.model=model;
        text=new SimpleStringProperty();
        model.addPropertyChangeListener("meme",evt -> LoadMeme(evt));
    }

    public void LoadMeme(PropertyChangeEvent evt)
    {
        Platform.runLater(() -> {
            String[] updatedData=(String[]) evt.getNewValue();
            text.setValue(updatedData[1]);
        });
    }
}
