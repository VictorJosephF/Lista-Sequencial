//Faça um Programa que peça dois números e imprima a soma.

import java.util.Scanner;

public class SomarNumeros {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int number1, number2, sum;

        System.out.print("DIgite um numero: ");
        number1 = read.nextInt();
        System.out.print("Digite um numero: ");
        number2 = read.nextInt();

        sum =  number1 + number2;

        System.out.print("A soma dos numeros é: "+ sum);

    }
}

//signed by VictorJosephF
