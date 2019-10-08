package Server;

import Server.Both.UserList;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
private UserList userList;
    private String id;

    public static void main(String[] args) {


        Server server=new Server();
        server.startServer();

    }

    private void startServer() {
        try {
            ServerSocket welcomeSocket=new ServerSocket(2910);
            System.out.println("Server started");
                userList=new UserList();

            while(true){
                Socket socket=welcomeSocket.accept();
                System.out.println("Client Connected");
                ServerSocketHandler ssh=new ServerSocketHandler(socket,id,this);
                (new Thread(ssh)).start();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public UserList getUserList()
    {
        return userList;
    }
}
