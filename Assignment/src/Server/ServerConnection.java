package Server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerConnection {

    private Socket clientSocket;

    private ConnectionPool connPool;

    ObjectOutputStream outToClient;
    ObjectInputStream inFromClient;

    public ServerConnection(java.net.Socket connectionSocket, ConnectionPool cp)
    {
        clientSocket = connectionSocket;
        connPool = cp;

        try {
            outToClient = new ObjectOutputStream(clientSocket.getOutputStream());
            inFromClient = new ObjectInputStream(clientSocket.getInputStream());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public void run (){
        try {
            while (true) {
                Message message = (Message) inFromClient.readObject();
                System.out.println("Message from client: " + message);

                Message replyMessage = new Message(message.getId(), message.getBody().toUpperCase());

                connPool.broadCastMessage(replyMessage.getBody());
            }
        }
        catch (Exception e) { }


    }

    public ObjectOutputStream getOutputStream() {
        return outToClient;
    }
}
