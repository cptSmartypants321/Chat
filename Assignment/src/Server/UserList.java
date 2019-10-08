package Server;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class UserList {

    private ArrayList<User> users ;

    public UserList ()
    {
        users =  new ArrayList<User>();
    }
    public void addUser(User user)
    {
        users.add(user);
    }
    public User getUser(String username) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(username)) {
                return users.get(i);
            }

        }
        return null;
    }
    public void removeUser(String username)
    {
       User temp= getUser(username);
       users.remove(temp);
    }
    public ArrayList<User> getAllUsers()
    {
        ArrayList<User> temp=new ArrayList<User>();
        for(int i =0;i<users.size();i++)
        {
            temp.add(users.get(i));
        }
        return temp;
    }




}
