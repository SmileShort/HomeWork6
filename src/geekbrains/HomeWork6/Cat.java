package geekbrains.HomeWork6;

public class Cat extends Animal{

    Cat (String name, String color) {
        super(name, color);
    }


    @Override
     void run (int distance){
        if (distance > 200){
            System.out.println("Коты не бегают больше 200 метров");
        } else
        System.out.println(name + " пробежал(а) " + distance + " метров");
    }

    @Override
    void swim(int distance){
        System.out.println("Коты/кошки не умеют плавать!!!");
    }

}
