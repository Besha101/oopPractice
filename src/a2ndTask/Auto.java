package a2ndTask;

public abstract class Auto {

    int horsePower;
    String nameOfCar;

    public Auto(int horsePower){

        this.horsePower=horsePower;

    }

    public Auto(String nameOfCar){

        this.nameOfCar=nameOfCar;

    }

    public Auto(int horsePower,String nameOfCar){

        this.horsePower=horsePower;
        this.nameOfCar=nameOfCar;

    }


    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getNameOfCar() {
        return nameOfCar;
    }

    public void setNameOfCar(String nameOfCar) {
        this.nameOfCar = nameOfCar;
    }

    public void printDescription(){
        System.out.println(nameOfCar+", Horse Power: "+horsePower);
    }

}
