package Calculet;

interface Operation {
    double execute(double a, double b);
}

class Addition implements Operation {
    public double execute(double a, double b) {
        return a + b;
    }
}

class Subtraction implements Operation {
    public double execute(double a, double b) {
        return a - b;
    }
}