package geekbrains.HomeWork6;

public class Dog extends Animal{

    Dog (String name, String color) {
        super(name, color);
    }

    @Override
    void run (int distance){
        if (distance > 500){
            System.out.println("Собаки не бегают больше 500 метров");
        } else
        System.out.println(name + " пробежал(а) " + distance + " метров");
    }

    @Override
    void swim(int distance){
        if (distance > 10){
            System.out.println("Собаки не плавают больше 10 метров");
        } else
        System.out.println(name + " проплыл(а) " + distance + " метров");
    }

}
