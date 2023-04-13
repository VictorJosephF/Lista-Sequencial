//Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
// Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros,
// que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Quest16 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        final double precoLata = 80.0;
        final double coberturaPorLitro = 3.0;
        final int capacLata = 18;
        double precototal, tamanho, quantLitros;
        int quantLatas;

        System.out.print("Informe o tamanho da area a ser pintada em metros quiadrados: ");
        tamanho = read.nextDouble();
        quantLitros = tamanho / coberturaPorLitro;
        quantLatas = (int) Math.ceil(quantLitros / capacLata);
        precototal = quantLatas * precoLata;

        System.out.println("A quantidade de latas para essa cobertura é: "+quantLatas);
        System.out.println("O preço total dessas latas é: R$"+ df.format(precototal));


    }
}



//signed by VictorJosephF
