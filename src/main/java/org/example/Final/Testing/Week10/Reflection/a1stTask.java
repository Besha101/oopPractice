package org.example.Final.Testing.Week10.Reflection;

import java.lang.reflect.Field;

class a1stTask {
    public static void main(String[] args) throws IllegalAccessException {
        Cat myCat=new Cat("Cicko",12);
        Field[] catFields=myCat.getClass().getDeclaredFields();


        for (Field f:catFields){
            if (f.getName().equals("name")){
                f.setAccessible(true);
                f.set(myCat,"Micko Cicko");
            }
            System.out.println(myCat.getName());

        }
    }
}

class Cat{
    private final String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void thisIsPublicStaticMethod(){
        System.out.println("I'm public and static");
    }

    public void meow(){
        System.out.println("meow");
    }

    public void saySomething(String something){
        System.out.println("I said something ---- ".concat(something));
    }

    private void heyThisIsPrivate(){
        System.out.println("How did you call this?");
    }



}
