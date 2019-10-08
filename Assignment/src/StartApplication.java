import View.ViewHandler;
import javafx.application.Application;
import javafx.stage.Stage;
import model.Model;
import model.ModelFactory;
import viewModel.ViewModelFactories;


public class StartApplication extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        ModelFactory mf = new ModelFactory();
        ViewModelFactories vfm = new ViewModelFactories(mf);
        ViewHandler viewHandler = new ViewHandler(stage,vfm);

        viewHandler.openViewLoginView();

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
