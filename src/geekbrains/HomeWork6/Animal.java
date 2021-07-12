package geekbrains.HomeWork6;

public class Animal {

    protected String name;
    protected String color;
    protected int distance;
    int sumAnimal = 0;

    Animal (String name, String color){
        this.name = name;
        this.color = color;
        sumAnimal = sumAnimal + 1;
    }

      void run (int distance){
        System.out.println(name + " пробежал(а) " + distance + " метров");
    }

     void swim (int distance){
        System.out.println(name + " проплыл(а) " + distance + " метров");
    }

}
