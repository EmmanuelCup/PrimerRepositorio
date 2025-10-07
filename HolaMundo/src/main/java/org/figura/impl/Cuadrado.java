package org.figura.impl;

import lombok.Data;
import org.figura.Figura;

@Data
public class Cuadrado extends Figura {

    private double lado;
    @Override
    public double perimetro() {
        return lado * 4;
    }

    @Override
    public double area() {
        return lado * lado;
    }
}
