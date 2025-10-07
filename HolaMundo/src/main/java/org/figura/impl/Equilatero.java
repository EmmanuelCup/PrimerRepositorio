package org.figura.impl;
import jdk.jfr.DataAmount;
import lombok.Data;
import org.figura.Figura;

@Data
public class Equilatero extends Triangulo {
    protected double base;
    protected double altura;

    @Override
    public double perimetro(){
        return base * 3;
}


}

