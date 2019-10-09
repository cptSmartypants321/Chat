package Server.Both;

import java.io.Serializable;

public class Request implements Serializable {
    private MyEnum action;
    private String id;
    private String message;

    public Request(String id, String message) {
        this.id = id;
        this.message = message;
    }
    public String getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public MyEnum getAction() {
        return action;
    }

    public void setAction(String temp) {
       if(temp.equals("log in")){
           action=MyEnum.LOG_IN;
       }
       if(temp.equals("mesage"))
       {
           action=MyEnum.MESSAGE;
       }

    }

}
