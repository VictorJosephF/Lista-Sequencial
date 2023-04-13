//Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
//Para homens: (72.7*h) - 58
//Para mulheres: (62.1*h) - 44.7

import java.util.Scanner;
public class Quest13 {
    public static void main(String[] args){
         Scanner read = new Scanner(System.in);
         double height, weight, weightWoman;
         boolean man;
         System.out.print("Insira sua altura para saber seu peso ideal: ");
         height = read.nextDouble();
         System.out.print("Você e homem? se sim digite true se não digite false: ");
         man = read.nextBoolean();
        weight = (72.7 * height)-58;
        weightWoman = (62.1*height)-48;
        if(man == true){

            System.out.print("O peso ideal para um homem dessa altura é: "+weight);

        }
        else{
            System.out.print("O peso ideal para uma mulher desse peso é: "+ weightWoman);
        }
    }
}

//signed by VictorJosephF
