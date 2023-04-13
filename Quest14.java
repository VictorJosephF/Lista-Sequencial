//João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
// Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do
// estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você
// faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a
// quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.

import java.util.Scanner;

public class Quest14 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        double weight, excess, fine;
        System.out.print("Insira o peso dos peixes em quilos: ");
        weight = read.nextDouble();
        excess = weight-50;
        fine = excess * 4.0;
        System.out.println("O peso de peixes em quilos é: "+ weight);
        System.out.println("O excesso de quilos de peixes é: "+excess);
        System.out.println("A multa sobre o excesso de quilos de peixes é: R$"+fine);

    }
}

//signed by VictorJosephF
