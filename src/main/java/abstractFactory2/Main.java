package abstractFactory2;

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

// Класс AfricanLion (африканский лев)
class AfricanLion extends Lion {
    public void hunt() {
        System.out.println("African Lion hunts for prey!");
    }
}

// Класс AsianLion (азиатский лев)
class AsianLion extends Lion {
    public void performTrick() {
        System.out.println("Asian Lion performs a trick!");
    }
}

// Конкретная фабрика для африканских животных
class AfricanAnimalFactory implements AnimalFactory {
    @Override
    public Lion createLion() {
        return new AfricanLion();
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
        return new AsianLion();
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

        // Выводим звуки и действия африканских животных
        africanLion.roar(); // Вывод: Lion roars!
        ((AfricanLion) africanLion).hunt(); // Вывод: African Lion hunts for prey!
        africanDuck.quack(); // Вывод: Duck quacks!

        // Создаем фабрику для азиатских животных
        AnimalFactory asianFactory = new AsianAnimalFactory();

        // Создаем азиатского льва и азиатскую утку
        Lion asianLion = asianFactory.createLion();
        Duck asianDuck = asianFactory.createDuck();

        // Выводим звуки и действия азиатских животных
        asianLion.roar(); // Вывод: Lion roars!
        ((AsianLion) asianLion).performTrick(); // Вывод: Asian Lion performs a trick!
        asianDuck.quack(); // Вывод: Duck quacks!
    }
}
