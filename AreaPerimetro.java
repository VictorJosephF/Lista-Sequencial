import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double a, area, perimet;
    Scanner leia = new Scanner(System.in);
    System.out.print("Digite o comprimento de um lado do quadrado: ");
    a = leia.nextDouble();
    area = a*a;
    perimet = a*4;
    System.out.print("O valor da area deste Quadrado é de: "+ area);
    System.out.print("O valor do perimetro do Quadrado é de: "+perimet);
  }
}