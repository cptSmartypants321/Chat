package Server.Both;

import java.util.ArrayList;

public class UserList {
    private ArrayList<String> username;

    public UserList(){
        username=new ArrayList<String>();
    }

    public ArrayList<String> getUserList() {
      return username;
    }

    public void addUsername(String username) {
      this.username.add(username);
    }
    public void removeUser(String username)
    {
        this.username.remove(username);
    }
}
