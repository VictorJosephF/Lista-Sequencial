//Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps),
// calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).

import java.util.Scanner;
public class Quest18 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        System.out.print("Informe o tamanho do arquivo em MB: ");
        double arquivo = read.nextDouble();
        System.out.print("Informe a velocidade da download da sua internet em Mbps: ");
        double velNet = read.nextDouble();

        double velMbs = velNet / 8;
        double temps = arquivo / velMbs;
        double tempM = temps / 60;

        System.out.println();
        System.out.printf("Com a velocidade de: %.2f(Mbps)\nO arquivo de: %.2f(Mb\nLeva: %.2f(min) para finalizar.",velNet, arquivo, tempM);
        System.out.println();

    }
}

//signed by VictorJosephF
