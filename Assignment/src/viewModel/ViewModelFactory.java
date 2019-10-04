package viewModel;

import viewmodel.login.LoginViewModel;

public class ViewModelFactory {


    private LoginViewModel loginViewModel;

    public ViewModelFactory(ModelFactory modelFactory) {
        loginViewModel = new LoginViewModel(modelFactory.getDataModel());

    }

    public LoginViewModel getTextChartViewModel() {
        return loginViewModel;
    }


}
