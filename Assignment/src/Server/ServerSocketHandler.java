package Server;

import Server.Both.Request;
import Server.Both.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerSocketHandler implements Runnable{
    private Socket socket;

    private Server server;
    public ServerSocketHandler(Socket socket, String id, Server server) {
        this.socket=socket;
        this.server=server;
    }

    @Override
    public void run() {
        try {
            ObjectOutputStream outFromServer = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inFromClient =new ObjectInputStream(socket.getInputStream());
            while(true)
            {
                Request login=(Request)inFromClient.readObject();
                if(login.getAction().name().equals("log in"))
                {
                    server.getUserList().addUser(new User(login.getId()));
                }

            }



        }
        catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    }
