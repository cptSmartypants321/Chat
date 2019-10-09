package Server.Both;

import java.util.ArrayList;

public class UserList {
    private ArrayList<User> userList;

    public UserList()
    {
        userList= new ArrayList<>();
    }
    public void addUser(User user)
    {
        if(!(userList.contains(user)))
        {
            userList.add(user);
        }
    }

    public User getUser(String username) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getUsername().equals(username))
            {
                 return userList.get(i);
            }
        }
        return null;
    }

    public ArrayList<User> getUsers()
        {
            return userList;
        }


}
