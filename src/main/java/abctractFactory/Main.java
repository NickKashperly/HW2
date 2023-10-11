package abctractFactory;

// Интерфейс для создания семейства животных
interface AnimalFactory {
    Lion createLion();
    Duck createDuck();
}

// Класс Lion (лев)
class Lion {
    public void roar() {
        System.out.println("Lion roars!");
    }
}

// Класс Duck (утка)
class Duck {
    public void quack() {
        System.out.println("Duck quacks!");
    }
}

// Конкретная фабрика для африканских животных
class AfricanAnimalFactory implements AnimalFactory {
    @Override
    public Lion createLion() {
        return new Lion();
    }

    @Override
    public Duck createDuck() {
        return new Duck();
    }
}

// Конкретная фабрика для азиатских животных
class AsianAnimalFactory implements AnimalFactory {
    @Override
    public Lion createLion() {
        return new Lion();
    }

    @Override
    public Duck createDuck() {
        return new Duck();
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем фабрику для африканских животных
        AnimalFactory africanFactory = new AfricanAnimalFactory();

        // Создаем африканского льва и африканскую утку
        Lion africanLion = africanFactory.createLion();
        Duck africanDuck = africanFactory.createDuck();

        // Выводим звуки африканских животных
        africanLion.roar(); // Вывод: Lion roars!
        africanDuck.quack(); // Вывод: Duck quacks!

        // Создаем фабрику для азиатских животных
        AnimalFactory asianFactory = new AsianAnimalFactory();

        // Создаем азиатского льва и азиатскую утку
        Lion asianLion = asianFactory.createLion();
        Duck asianDuck = asianFactory.createDuck();

        // Выводим звуки азиатских животных
        asianLion.roar(); // Вывод: Lion roars!
        asianDuck.quack(); // Вывод: Duck quacks!
    }
}