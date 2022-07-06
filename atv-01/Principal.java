import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Churrasco churrasco = new Churrasco();
        System.out.print("Informe o número de pessoas que irão ao churrasco: ");
        churrasco.quantidadePessoas = scanner.nextInt();
        System.out.println("Total de carne: " + churrasco.calcularTotalCarne() + "g");
        scanner.close();
    }
}
