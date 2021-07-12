package geekbrains.HomeWork6;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Пушистик", "пепельный");
        Cat cat1 = new Cat("Мику", "серая");
        Dog dog = new Dog("Лорд", "чёрный");
        Dog dog1 = new Dog("Рика", "рыжая");

        dog1.run(800);
        dog1.swim(20);
        cat.run(300);
        cat1.swim(30);
        dog.run(400);
        dog.swim(5);
        cat1.run(150);
        cat.swim(2);

    }
}
