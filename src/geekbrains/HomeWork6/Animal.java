package geekbrains.HomeWork6;

public class Animal {

    protected String name;
    protected String color;
    protected int distance;

    Animal (String name, String color){
        this.name = name;
        this.color = color;
    }

      void run (int distance){
        System.out.println(name + " пробежал(а) " + distance + " метров");
    }

     void swim (int distance){
        System.out.println(name + " проплыл(а) " + distance + " метров");
    }
}
