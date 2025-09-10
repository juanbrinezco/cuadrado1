package org.example;

public class circulo {
    private double radio;

    public circulo() {
        this.radio = 5.0;
    }

    public double areaC() {
        return 3.14 * radio * radio;
    }
    public double perimetroC() {
        return 2 * 3.14 * radio;
    }
}