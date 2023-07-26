import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {

        int[][] estoque = new int[1000][5]; // mês-dia-entrada-saída-saldo
        int loop = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro lançamento:");
        System.out.print("Mês: ");
        estoque[0][0] = Integer.parseInt(sc.nextLine());
        System.out.print("Dia:");
        estoque[0][1] = Integer.parseInt(sc.nextLine());
        System.out.print("Entrada inicial de vacinas: ");
        estoque[0][4] = Integer.parseInt(sc.nextLine());
        estoque[0][3] = 0;

        for (int i = 1; i < 1000; i++) {
            System.out.println("Digite mês '0' para sair.");
            System.out.print("Digite o mês: ");
            loop = Integer.parseInt(sc.nextLine());
            if (loop == 0) {
                break;
            }
            estoque[i][0] = loop;
            System.out.print("Digite o dia: ");
            estoque[i][1] = Integer.parseInt(sc.nextLine());
            System.out.print("Digite a entrada se houver ou '0' para zero entrada: ");
            estoque[i][2] = Integer.parseInt(sc.nextLine());
            System.out.print("Digite a saída se houver e '0' para zero saída: ");
            estoque[i][3] = Integer.parseInt(sc.nextLine());
            estoque[i][4] = estoque[i-1][4] + estoque[i][2] - estoque[i][3];
            System.out.println("-------------");
            System.out.println("Saldo atual de estoque: " + estoque[i][4]);

        }

        for (int i = 0; i < 1000; i++) {
            if (estoque[i][0] < estoque[i][0]) {
                System.out.println("Estoque final do mês " + estoque[i][0] + " : " + estoque[i][4]);
            }            
        }

        sc.close();
    }

}
