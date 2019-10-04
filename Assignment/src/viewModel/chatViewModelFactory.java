package viewModel;


import model.ModelFactory;

public class chatViewModelFactory {
    private chatViewModel viewModel;

    public chatViewModelFactory(ModelFactory modelFactory){
        viewModel = new chatViewModel(modelFactory.getModel());

    }

    public chatViewModel getViewModel(){
        return viewModel;
    }
}
