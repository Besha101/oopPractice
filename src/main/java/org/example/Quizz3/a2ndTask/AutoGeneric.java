package org.example.Quizz3.a2ndTask;

public class AutoGeneric <car> extends Auto{

    private car golf;

    public AutoGeneric(car golf,int horsePower, String nameOfCar){
        super(horsePower,nameOfCar);
        this.golf=golf;
    }

    public car getGolf() {
        return golf;
    }

    public void setGolf(car golf) {
        this.golf = golf;
    }

    @Override
    public void printDescription(){
        System.out.println("GOLF -- "+golf+nameOfCar+", Horse Power: "+horsePower);
    }

}
