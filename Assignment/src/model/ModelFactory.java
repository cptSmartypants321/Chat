package model;

public class ModelFactory {
    private Model model;

    public ModelFactory() {
    }

    public Model getModel(){
        if(model == null){
            model = new Model();
        }
        return model;
    }
}
