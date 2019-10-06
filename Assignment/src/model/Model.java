package model;

import Server.Client;
import javafx.beans.property.SimpleStringProperty;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Model implements ModelInterface{

    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private String timeStamp;
    private String text;
    private String userName;


    private void calTimeStamp() {
        SimpleDateFormat sdfDate = new SimpleDateFormat("HH:mm:ss");
        Date now = new Date();
        String strDate = sdfDate.format(now);
        System.out.println(strDate);
        timeStamp= strDate;
    }

    public String[] getData(){
        String[] data = new String[2];
        data[0] = timeStamp;
        data[1] = text;
        return data;
    }

    public void UpdateData(){
        calTimeStamp();
        String[] data = new String[2];
        data[0] = timeStamp;
        data[1] = text;

        changeSupport.firePropertyChange("data", null, data);
    }

    // ServerConnection

    public void setClient(Client client){
        //?
    }

    public void sendMessage(String message){

    }
    public void ReceiveMessage(){

    }

    @Override
    public void addPropertyChangeListener(String name, PropertyChangeListener listener) {
        if(name == null){
            changeSupport.addPropertyChangeListener(listener);
        } else {
            changeSupport.addPropertyChangeListener(name, listener);
        }
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    @Override
    public void removePropertyChangeListener(String name, PropertyChangeListener listener) {
        if(name == null){
            changeSupport.removePropertyChangeListener(listener);
        } else {
            changeSupport.removePropertyChangeListener(name, listener);
        }
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
    changeSupport.removePropertyChangeListener(listener);
    }
}
