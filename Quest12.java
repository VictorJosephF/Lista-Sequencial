//Tendo como dados de entrada a altura de uma pessoa, construa
// um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
import java.util.Scanner;
public class quest12 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        double height, weight;
        System.out.print("Insira sua altura para saber seu peso ideal:  ");
        height = read.nextFloat();
        weight = (72.7 * height)-58;
        System.out.print("O peso ideal baseado na sua altura e de: "+ weight);
    }
}

//signed by VictorJosephF
