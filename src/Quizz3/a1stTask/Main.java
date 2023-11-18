package Quizz3.a1stTask;

public class Main {
    public static void main(String[] args) {

        Dog dog=new Dog("Alic",20);
        Cat cat=new Cat(15);

        System.out.println(cat.animalSound());
        System.out.println(dog.animalSound());

    }
}