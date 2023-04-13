//Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
//o produto do dobro do primeiro com metade do segundo .
//a soma do triplo do primeiro com o terceiro.
//o terceiro elevado ao cubo.

import java.util.Scanner;


public class Quest11 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int number1, number2;
        float number3;
        System.out.print("Digite um numero inteiro: ");
        number1 = read.nextInt();
        System.out.print("Digite um numero inteiro: ");
        number2 = read.nextInt();
        System.out.print("Digite um numero real: ");
        number3 = read.nextFloat();

         System.out.println("O produto do dobro do primeiro com metade do segundo: "+ ((number1*2)*(2/number2)));
         System.out.println("A soma do triplo do primeiro com o terceiro: "+((number1*3)+number3));
         System.out.println("O terceiro elevado ao cubo: "+(number3*number3*number3));



        
    }

}
//signed by VictorJosephF
