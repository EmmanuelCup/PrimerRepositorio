package org.figura;

import lombok.Data;

@Data
public abstract class Figura {

    public abstract double perimetro();
    public abstract double area();

    public void imprimir(){

        System.out.println("Figura");
    }
}
