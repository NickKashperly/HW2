package fabric;

// Абстрактный класс Animal
public abstract class Animal {
    public abstract void makeSound();
}

// Подкласс Dog (собака)
public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Собака лает");
    }
}

// Подкласс Cat (кошка)
public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Кошка мяукает");
    }
}