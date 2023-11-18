package Quizz3.a2ndTask;

public class Audi extends Auto{


    public Audi(int horsePower,String nameOfCar){
        super(horsePower, nameOfCar);
    }

    @Override
    public void printDescription(){
        System.out.println("AUDI -- "+nameOfCar+", Horse Power: "+horsePower);
    }

}
