package org.example;

import org.figura.Figura;
import org.figura.impl.Cuadrado;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Figura figura = new Cuadrado();
        Cuadrado cuadrado = new Cuadrado();


        System.out.println(figura.area());
        System.out.println(figura.perimetro());

        cuadrado.setLado(5);

        System.out.println(cuadrado.area());
        System.out.println(cuadrado.perimetro());
    }
}