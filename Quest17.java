//Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
// Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros,
// que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
//Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
//comprar apenas latas de 18 litros;
//comprar apenas galões de 3,6 litros;
//misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.

import java.util.Scanner;


public class Quest17 {
    public static void main(String[] args){
          Scanner read = new Scanner(System.in);
          int qtdLatas, qtdLitros, qtdGaloes, qtdLatas2, qtdGaloes2;
          double qtdTinta, tamanho, litros, precoLatas, precoGaloes, precoLatas2, precoGaloes2;

          System.out.print("Informe o tamanho da area a ser pintada em metros quadrados: ");
          tamanho = read.nextDouble();

          litros = tamanho / 6.0;
          qtdLatas = (int) Math.ceil((litros * 1.1) / 18.0);
          qtdGaloes = (int) Math.ceil((litros *1.1) / 3.6);
          precoLatas = qtdLatas * 80.0;
          precoGaloes = qtdGaloes * 25.0;

          qtdLatas2 = (int) Math.floor((litros * 1.1) / 18.0);
          qtdGaloes2 = (int) Math.ceil(((litros * 1.1) - qtdLatas2 * 18.0) / 3.6);
          precoLatas2 = qtdLatas2 * 80.0;
          precoGaloes2 = qtdGaloes2 * 25.0;

          System.out.println("Situação 1: Comprar apenas latas de 18 litros:");
          System.out.printf("Quantidade de latas: %d\nPreço total: R$ %.2f\n", qtdLatas, precoLatas);
          System.out.println();
          System.out.println("Situação 2: Comprar apenas galões de 3,6 litros:");
          System.out.printf("Quantidade de galões: %d\nPreço total: R$ %.2f\n", qtdGaloes, precoGaloes);
          System.out.println();
          System.out.println("Situação 3: Misturar latas e galões:");
          System.out.printf("Quantidade de latas: %d\nQuantidade de galões: %d\nPreço total: R$ %.2f\n", qtdLatas2, qtdGaloes2, precoLatas2 + precoGaloes2);





    }
}

//signed by VictorJosephF
