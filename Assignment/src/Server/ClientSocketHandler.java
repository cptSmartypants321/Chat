package Server;

import Server.Both.Request;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientSocketHandler implements Runnable {
    private Socket socket;
    private Client client;
    private ObjectInputStream inFromServer;
    private ObjectOutputStream outToServer;
    private String username;
    public ClientSocketHandler(Socket socket,Client client) {
        this.socket=socket;
        this.client=client;
        try {
            inFromServer=new ObjectInputStream(socket.getInputStream());
            outToServer=new ObjectOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void run() {
        try{

            int id=(int)inFromServer.readObject();
            String username=client.getViewModelFactories().getLViewModel().getUsername().getName();
            Request login=new Request(username,"");
            login.setAction("log in");
            outToServer.writeObject(login);
            while(true)
            {
//                String rec=client.getViewModelFactories().getFLViewModel().getFreind();
//            Request recipient=new Request("",)

            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


}
