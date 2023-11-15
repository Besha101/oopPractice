package a4thTask;

public class Main {

    public static void main(String[] args) {
        Tiger tiger=new Tiger(300,13);
        Wolf wolf=new Wolf(150,4);
        Bird bird=new Bird(7,1,"Kolibri");

        System.out.println(tiger.saySomething());
        System.out.println(wolf.saySomething());
        System.out.println(bird.saySomething());
    }
}
