//Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.

import java.util.Scanner;

public class ConvertCelsius {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        float fahrenheit, celsius;
        System.out.print("Insira a temperatura em graus celsius para converte-la: ");
        celsius = read.nextFloat();

        fahrenheit = 32 +(celsius*9/5);

        System.out.print("A temperatura em graus Fahrenheit é: "+ fahrenheit);
    }
}
//signed by VictorJosephF
