import View.LoginViewHandler;
import javafx.application.Application;
import javafx.stage.Stage;
import model.Model;
import model.ModelFactory;
import viewModel.ViewModelFactory;


public class StartApplication extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        ModelFactory mf = new ModelFactory();
        ViewModelFactory vfm = new ViewModelFactory(mf);
        LoginViewHandler loginViewHandler = new LoginViewHandler(stage,vfm);


        loginViewHandler.start();
        runAutoUpdate((Model) mf.getModel());



    }
    private void runAutoUpdate(Model model) {
        Thread thread = new Thread(() -> {
            while (true){
                model.UpdateData();
                try{
                    Thread.sleep(2000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        thread.setDaemon(true);
        thread.start();
    }
}
