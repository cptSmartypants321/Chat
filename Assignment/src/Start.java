
import View.ChatViewHandler;
import javafx.application.Application;
import javafx.stage.Stage;
import model.Model;
import model.ModelFactory;
import viewModel.chatViewModelFactory;

public class Start extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        ModelFactory mf = new ModelFactory();
        chatViewModelFactory vfm = new chatViewModelFactory(mf);
        ChatViewHandler viewHandler = new ChatViewHandler(stage,vfm);
        viewHandler.start();
        runAutoUpdate((Model) mf.getModel());
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
thread.setDaemon(true);
thread.start();
    }
}
