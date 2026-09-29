import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContaBancaria cliente1 = new ContaBancaria("João Silva", "123456-7", 0.00);

        System.out.println(cliente1.getTitular());

        String a = input.nextLine();

        cliente1.setTitular(a);

        System.out.println(cliente1.getTitular());
    }
}
