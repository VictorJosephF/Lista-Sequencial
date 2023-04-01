//Faça um Programa que peça as 4 notas bimestrais e mostre a média.

import java.util.Scanner;
public class MediaNotas {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        Float note1, note2, note3, note4, average;

        System.out.print("Insira a primeria nota: ");
        note1 = read.nextFloat();
        System.out.print("Insira a segunda nota: ");
        note2 = read.nextFloat();
        System.out.print("Insira a terceira nota: ");
        note3 = read.nextFloat();
        System.out.print("Insira a quarta nota: ");
        note4 = read.nextFloat();

        average = (note1+note2+note3+note4) / 4;

        System.out.print("A media de todas as notas foi: "+ average);

    }
}
