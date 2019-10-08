package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    private UserList userList;

    public static void main(String[] args) {
        System.out.println("Server starting....");
        int count=0;
        try{
            ServerSocket welcomeSocket=new ServerSocket(5600);
            ConnectionPool connectionPool=new ConnectionPool();
            while(true)
            {
                System.out.println("Waiting for client....");
                Socket connSocket=welcomeSocket.accept();
                ServerConnection serverConnection=new ServerConnection(connSocket,connectionPool);

                new Thread(serverConnection,"Communication"+count).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void setUser(User user)
    {
        userList.addUser(user);
    }

}
