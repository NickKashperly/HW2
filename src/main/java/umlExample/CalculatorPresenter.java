package umlExample;
import java.util.Observer;

// Интерфейс для View
interface CalculatorView {
    void setObserver(ViewObserver observer);
    void updateResult(double result);
    void clearScreen();
}

// Интерфейс для Observer
interface ViewObserver {
    void onCalculate(String operation, double a, double b);
    void onClear();
}

// Класс для Presenter
public class CalculatorPresenter implements ViewObserver {
    private CalculatorView calculatorView;
    private CalculatorModel calculatorModel;

    public void onCalculate(String operation, double a, double b) {
        double result = 0;
        switch (operation) {
            case "add":
                result = calculatorModel.add(a, b);
                break;
            case "subtract":
                result = calculatorModel.subtract(a, b);
                break;
            case "multiply":
                result = calculatorModel.multiply(a, b);
                break;
            case "divide":
                result = calculatorModel.divide(a, b);
                break;
        }
        calculatorView.updateResult(result);
    }

    public void onClear() {
        calculatorView.clearScreen();
    }
}

// Класс для Model
class CalculatorModel {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }
}

// Главный класс программы
public class MainProgram {
    public static void main(String[] args) {
        // Инициализация объектов и установка связей
        CalculatorPresenter presenter = new CalculatorPresenter();
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorViewImpl(); // Предположим, что CalculatorViewImpl реализует CalculatorView

        presenter.calculatorView = view;
        presenter.calculatorModel = model;
        view.setObserver(presenter);

        // Далее идёт логика работы программы
    }
}