import java.util.Scanner;

public class Calculadora {
    static public void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Numero n1 = new Numero();
        Numero n2 = new Numero();
        Numero result = new Numero();

        System.out.println("\nDigite o primeiro valor: ");
        n1.setValor(ler.nextDouble());
        System.out.println("Digite o segundo valor: ");
        n2.setValor(ler.nextDouble());
        result.setValor(n1.getValor() + n2.getValor());
        System.out.printf("\n\nA soma de " + n1.getValor() + " com " + n2.getValor() + " é de: " + result.getValor());
        result.setValor(n1.getValor() * n2.getValor());
        System.out
                .printf("\n\nA multiplicação de " + n1.getValor() + " com " + n2.getValor() + " é de: "
                        + result.getValor());
        result.setValor((n1.getValor()) - ((n2.getValor() / 99) * n1.getValor()));
        System.out.printf(
                "\n\nO valor de desconto de " + n2.getValor() + " por cento" + " de R$" + n1.getValor() + " é de: "
                        + result.getValor());

    }
}
