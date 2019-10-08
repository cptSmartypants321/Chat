package Server;


import View.loginView.LoginController;
import model.Model;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient implements Client {
    private User user;

    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        try {
            Socket socket=new Socket("localhost",5600);

            // Client is input then output
            ObjectInputStream inFromServer = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outToServer = new ObjectOutputStream(socket.getOutputStream());



            while (true)
            {
                outToServer.writeObject(user);



            }



        }



        catch (IOException e) {
            e.printStackTrace();
        }



    }

    @Override
    public void sendMessage(String message) {

    }
    @Override
    public void setUser(User user)
    {
        this.user=user;
    }
}
