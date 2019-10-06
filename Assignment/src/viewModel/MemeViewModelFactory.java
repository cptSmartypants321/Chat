package viewModel;

import model.ModelFactory;

public class MemeViewModelFactory {
    private MemeViewModel meme;

    public MemeViewModelFactory(ModelFactory model)
    {
        meme=new MemeViewModel(model.getModel());
    }

    public MemeViewModel getMemeViewModel(){return meme;}

}
