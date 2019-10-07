package viewModel;

import model.ModelFactory;
import viewModel.login.LoginViewModel;


public class ViewModelFactory {


    private LoginViewModel loginViewModel;

    public ViewModelFactory(ModelFactory modelFactory) {
        loginViewModel = new LoginViewModel(modelFactory.getModel());

    }

    public LoginViewModel getLoginViewModel() {
        return loginViewModel;
    }


}
