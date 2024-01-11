package org.example.Quizz5;

public class Animal {

    private String name;
    private int age;
    private boolean isVaccinated;

    private Animal(AnimalBuilder builder){
        this.name=builder.name;
        this.age=builder.age;
        this.isVaccinated=builder.isVaccinated;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getIsVaccinated() {
        return isVaccinated;
    }


    public static class AnimalBuilder{
        private String name;
        private int age;
        private boolean isVaccinated;

        public AnimalBuilder(String name) {
            this.name = name;
        }

        public AnimalBuilder(){}


        public AnimalBuilder setAge(int age){
            this.age=age;
            return this;
        }

        public AnimalBuilder setIsVaccinated(boolean isVaccinated){
            this.isVaccinated=isVaccinated;
            return this;
        }

        public Animal build(){
            return new Animal(this);
        }
    }
}

class AnimalBuilderTester {
    public static void main(String[] args) {
        Animal elephant = new Animal.AnimalBuilder("Slon")
                .setAge(55)
                .setIsVaccinated(true)
                .build();
        System.out.println(elephant.getIsVaccinated());
    }
}
