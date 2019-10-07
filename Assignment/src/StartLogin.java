import View.ChatViewHandler;
import View.LoginViewHandler;
import javafx.application.Application;
import javafx.stage.Stage;
import model.Model;
import model.ModelFactory;
import viewModel.ViewModelFactory;
import viewModel.chatViewModelFactory;

public class StartLogin extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        ModelFactory mf = new ModelFactory();
        ViewModelFactory vfm = new ViewModelFactory(mf);
        LoginViewHandler viewHandler = new LoginViewHandler(stage,vfm);
        viewHandler.start();
    }


}
