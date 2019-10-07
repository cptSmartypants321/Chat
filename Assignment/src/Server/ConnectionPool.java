package Server;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {


    private List<ServerConnection> conns = new ArrayList<>();

    public ConnectionPool() {
    }

    public void addConnection(ServerConnection conn) {
        conns.add(conn);
    }


    public List<ServerConnection> getConnections() {
        return conns;
    }

    public void broadCastMessage(String m) {
        System.out.println("Broadcast to " + conns.size() + " clients");

        for (ServerConnection sc : conns) {
            ObjectOutputStream outToClient = sc.getOutputStream();
            try {
                outToClient.writeObject(new Message(m));
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
