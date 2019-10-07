

import View.FriendsViewHandler;
import javafx.application.Application;
import javafx.stage.Stage;
import model.ModelFactory;
import viewModel.FriendsListViewModelFactory;

import java.util.Random;

public class FriendsApp extends Application
{
    @Override
    public void start (Stage stage) throws Exception
    {
        ModelFactory mf = new ModelFactory();
        FriendsListViewModelFactory viewModelFactory = new FriendsListViewModelFactory(mf);
        FriendsViewHandler viewHandler = new FriendsViewHandler(stage, viewModelFactory);
        viewHandler.start();
    }
}
