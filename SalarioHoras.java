//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
// Calcule e mostre o total do seu salário    no referido mês.

import java.util.Scanner;

public class SalarioHoras {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        float workedHours, valueHours, wage;

        System.out.print("Insira o valor que você ganhar por hora: ");
        valueHours = read.nextFloat();
        System.out.print("Insira quantas horas foram trabalhadas neste mês: ");
        workedHours = read.nextFloat();

        wage = workedHours*valueHours;

        System.out.print("O valor do salario deste mês foi de: "+ wage);
    }
}

//signed by VictorJosephF
