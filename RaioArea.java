//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

import java.util.Scanner;

public class RaioArea {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        double ray, area;

        System.out.print("Iforme o valor do raio para cálculo de area do circulo: ");
        ray = read.nextDouble();

        area = Math.PI*(ray*ray);

        System.out.print("A área do circulo é: "+area);

    }
}
