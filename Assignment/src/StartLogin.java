import View.ChatViewHandler;
import View.LoginViewHandler;
import View.loginView.LoginController;
import javafx.application.Application;
import javafx.event.ActionEvent;
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
        LoginViewHandler loginViewHandler = new LoginViewHandler(stage,vfm);


        loginViewHandler.start();




    }
    private void runAutoUpdate(Model model) {
        Thread thread = new Thread(() -> {
            while (true){
                model.UpdateData();
                try{
                    Thread.sleep(200);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

    }
}
