//Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

import java.util.Scanner;

public class MostrarNumero {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int number;
        System.out.print("Iforme um numero: ");
        number =read.nextInt();
        System.out.print("O numero informado foi: "+ number);

    }

}
