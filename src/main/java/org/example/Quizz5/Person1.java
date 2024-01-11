package org.example.Quizz5;

 class Person1 {


     private String firstName;
     private String lastName;

     private int age;
     private int height;

     private Person1(Person1Builder builder) {
         this.firstName = builder.firstName;
         this.lastName = builder.lastName;
         this.age = builder.age;
         this.height = builder.height;
     }

     public String getFirstName() {
         return firstName;
     }

     public String getLastName() {
         return lastName;
     }

     public int getAge() {
         return age;
     }

     public int getHeight() {
         return height;
     }

     public static class Person1Builder{

         private String firstName;
         private String lastName;

         private int age;
         private int height;

         public Person1Builder(String firstName, String lastName) {
             this.firstName = firstName;
             this.lastName = lastName;
         }

         public Person1Builder(){

         }

         public Person1Builder(String firstName) {
             this.firstName = firstName;
         }






         public Person1Builder setAge(int age){
             this.age=age;
             return this;
         }

         public Person1Builder setHeight(int height){
             this.height=height;
             return this;
         }

         public Person1 build() {
             return new Person1(this);
         }



     }
 }

class BuilderTest1 {
    public static void main(String[] args) {
        Person becir = new Person.PersonBuilder("Becir", "Isakovic")
                .setAge(150)
                .setHeight(180)
                .build();
        System.out.println(becir.getFirstName());
        System.out.println(becir.getLastName());
    }
}
