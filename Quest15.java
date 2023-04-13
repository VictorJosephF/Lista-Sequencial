//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
// Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda,
// 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
//salário bruto.
//quanto pagou ao INSS.
//quanto pagou ao sindicato.
//o salário líquido.
//calcule os descontos e o salário líquido, conforme a tabela abaixo:
//+ Salário Bruto : R$
//- IR (11%) : R$
//- INSS (8%) : R$
//- Sindicato ( 5%) : R$
//= Salário Liquido : R$
//Obs.: Salário Bruto - Descontos = Salário Líquido.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Quest15 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        double salBruto, salLiquid, ir, inss, sind, trabHoras, valHora;
        System.out.print("Informe o valor que você ganha por hora: ");
        valHora = read.nextDouble();
        System.out.print("Informe o total de horas trabalhadas no mês: ");
        trabHoras = read.nextDouble();

        salBruto = valHora*trabHoras;
        ir = salBruto*0.11;
        inss = salBruto*0.08;
        sind = salBruto*0.05;
        salLiquid = salBruto-ir-inss-sind;

        String valorFormatado = df.format(salLiquid);
        String valorFormatadoSind = df.format(sind);

        System.out.println("O valor do salario bruto é de: R$"+salBruto);
        System.out.println("O valor pago referente ao inss é: R$ "+inss);
        System.out.println("O valor pago referente ao sindicato é: R$"+valorFormatadoSind);
        System.out.println("O valor do seu salario liquido é: R$"+valorFormatado);

    }
}

//signed by VictorJosephF
