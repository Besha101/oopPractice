package a3rdTask;

public class Tiger implements AnimalInterface{

    private String name;
    private int kg;

    public Tiger(String name){
        this.name=name;
    }

    public Tiger(int kg){
        this.kg=kg;
    }

    public Tiger(String name, int kg){
        this.name=name;
        this.kg=kg;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getKg(){
        return kg;
    }

    public void setKg(int kg){
        this.kg=kg;
    }


    public String saySomething(){
        return "mjau";
    }

}
