package viewModel;


import model.ModelFactory;

public class ChatViewModelFactory {

    private ChatViewModel viewModel;

    public ChatViewModelFactory(ModelFactory modelFactory){
        viewModel = new ChatViewModel(modelFactory.getModel());

    }

    public ChatViewModel getViewModel(){
        return viewModel;
    }
}
