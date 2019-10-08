package Server;

import viewModel.ViewModelFactories;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

    private ViewModelFactories viewModelFactories;
    public static void main(String[] args) {
        Client client=new Client();
        client.runClient();
    }

    private void runClient() {
        try {
            Socket socket = new Socket("localhost", 2910);
            ClientSocketHandler csh=new ClientSocketHandler(socket,this);
            (new Thread(csh)).start();
            while(true)
            {

            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void setViewModelFactories(ViewModelFactories mf)
    {
        this.viewModelFactories=mf;
    }

    public ViewModelFactories getViewModelFactories() {
        return viewModelFactories;
    }
}
