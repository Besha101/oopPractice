package a2ndTask;

public class Main {

    public static void main(String[] args) {

        Mercedes mercedes=new Mercedes(450,"Benz");
        Audi audi=new Audi(300,"A6");
        AutoGeneric autoGeneric=new AutoGeneric<>("golf",800,"Golf5");

        mercedes.printDescription();
        audi.printDescription();
        autoGeneric.printDescription();

    }

}
