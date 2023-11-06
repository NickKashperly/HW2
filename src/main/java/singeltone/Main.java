package singeltone;

public class Main {
    public static void main(String[] args) {
        // Получаем экземпляр Singleton

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        // Вызываем методы
        singleton1.doSomething();
        singleton.doSomething();
    }
}