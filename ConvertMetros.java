//Faça um Programa que converta metros para centímetros.

import java.util.Scanner;
public class ConvertMetros {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        double meter, cemtmeter;

        System.out.print("Insira um valor em metro para converter em cemtímentros: ");
        meter = read.nextDouble();

        cemtmeter = meter * 100.0;
        System.out.print("O valor em cemtímetros é: "+ cemtmeter);

        }
    }

//signed by VictorJosephF
