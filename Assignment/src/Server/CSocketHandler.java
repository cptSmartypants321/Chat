package Server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CSocketHandler implements Runnable {
    private ObjectOutputStream outToServer;
    private ObjectInputStream inFromServer;
    private SocketClient client;

    public CSocketHandler (ObjectOutputStream outToServer,
        ObjectInputStream inFromServer, SocketClient _client){
        client = _client;
        this.outToServer = outToServer;
        this.inFromServer = inFromServer;
    }
    @Override
    public void run() {
        while (true) {
            client.sendMessage("");
        }
    }
}
