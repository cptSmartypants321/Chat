package viewModel;

import model.ModelFactory;

public class ViewModelFactories {
    private ChatViewModel viewModel;
    private FriendsListViewModel FLViewModel;
    private LoginViewModel LViewModel;
    private MemeViewModel MViewModel;

    public ViewModelFactories(ModelFactory modelFactory){
        viewModel = new ChatViewModel(modelFactory.getModel());
        FLViewModel = new FriendsListViewModel(modelFactory.getModel());
        LViewModel  = new LoginViewModel(modelFactory.getModel());
        MViewModel = new MemeViewModel(modelFactory.getModel());

    }

    public ChatViewModel getChatViewModel(){
        return viewModel;
    }

    public FriendsListViewModel getFLViewModel(){
        return FLViewModel;
    }

    public LoginViewModel getLViewModel(){
        return LViewModel;
    }

    public MemeViewModel getMViewModel(){
        return MViewModel;
    }
}
