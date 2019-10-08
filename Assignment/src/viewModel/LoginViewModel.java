package viewModel;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import model.Model;

public class LoginViewModel {

    private Model model;
    private StringProperty userName;

    public LoginViewModel(Model model){
        this.model = model;

    }

    public StringProperty getUsername(){
        return userName;

    }
}
