package org.figura.impl;

import lombok.Data;
import org.figura.Figura;

@Data
public abstract class Triangulo extends Figura
{
    protected double base;
    protected double altura;

    @Override
    public double area(){
        return base * altura;

    }
}

