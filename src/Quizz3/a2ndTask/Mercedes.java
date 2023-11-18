package Quizz3.a2ndTask;

public class Mercedes extends Auto{

    public Mercedes(int horsePower,String nameOfCar){

        super(horsePower, nameOfCar);

    }

    @Override
    public void printDescription(){
        System.out.println("MERCEDES -- "+nameOfCar+", Horse Power: "+horsePower);
    }


}
