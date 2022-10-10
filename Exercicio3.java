import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double salario, percReajuste, novoSalario;

        System.out.printf("Digite seu salário mensal atual: \n");
        salario = ler.nextDouble();
        System.out.printf("Digite o percentual de reajuste: \n");
        percReajuste = ler.nextDouble();

        novoSalario = (salario + (salario * (percReajuste / 100)));
        System.out.printf("\n\nSeu salario novo é = R$ " + novoSalario);
    }
}
