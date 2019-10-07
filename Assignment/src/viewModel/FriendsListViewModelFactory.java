package viewModel;

import model.ModelFactory;

public class FriendsListViewModelFactory
{
    private FriendsListViewModel friendsListViewModel;

    public FriendsListViewModelFactory (ModelFactory model)
    {
        friendsListViewModel = new FriendsListViewModel(model.getModel());
    }

    public FriendsListViewModel getFriendsListViewModel()
    {
        return friendsListViewModel;
    }
}
