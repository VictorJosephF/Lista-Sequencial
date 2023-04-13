//Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.

import java.util.Scanner;

public class ConvertFahren {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        float fahrenheit, celsius;
        System.out.print("Insira a temperatura em fahrenheit para converte-la: ");
        fahrenheit = read.nextFloat();

        celsius = 5 * ((fahrenheit-32) / 9);

        System.out.print("A temperatura em graus celsius é: "+ celsius);
    }

}

//signed by VictorJosephF
