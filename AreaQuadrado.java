//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        float square, DoubleArea;
        System.out.print("Digite o comprimento de um dos lados de um quadrado: ");
        square = read.nextFloat();
        DoubleArea = (square*square)*2;

        System.out.print("O dobro da área deste quadrado é: "+DoubleArea);
    }
}

//signed by VictorJosephF
