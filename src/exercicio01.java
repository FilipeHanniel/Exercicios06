import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {

        int origin = 0, destin = 0, vehicle = 0;

        int i = 0, countBH = 0, countBrasPetr = 0;
        int loop = 1;
        int[][] automob = new int[1000][2];
        int[][] truck = new int[1000][2];
        int[][] bus = new int[1000][2];

        Scanner sc = new Scanner(System.in);
        System.out.println("QUESTIONÁRIO DE PESQUISA.");
        do {
            System.out.println("Digite de onde veio. Opções:");
            System.out.println("1. Belo Horizonte");
            System.out.println("2. São Paulo");
            System.out.println("3. Vitória");
            System.out.println("4. Brasília");
            System.out.print(": ");
            origin = Integer.parseInt(sc.nextLine());

            System.out.println("Para onde vai? Opções:");
            System.out.println("1. Rio de Janeiro");
            System.out.println("2. Petrópolis");
            System.out.println("3. Juiz de Fora");
            System.out.println("4. Barbacena");
            System.out.print(": ");
            destin = Integer.parseInt(sc.nextLine());

            System.out.println("Qual o tipo de veículo? Opções:");
            System.out.println("1. Automóvel");
            System.out.println("2. Caminhão");
            System.out.println("3. Ônibus");
            System.out.print(": ");
            vehicle = Integer.parseInt(sc.nextLine());

            if (origin == 0 && destin == 0 && vehicle == 0) {
                break;
            } else if (origin == 1) {
                countBH += 1;
            } else if (origin == 4 && (destin == 2 || destin == 4)) {
                countBrasPetr += 1;
            }

            if (vehicle == 1) {
                automob[i][0] = origin;
                automob[i][1] = destin;
            } else if (vehicle == 2) {
                truck[i][0] = origin;
                truck[i][1] = destin;
            } else {
                bus[i][0] = origin;
                bus[i][1] = destin;
            }

            i += 1;

        } while (loop > 0);

        sc.close();

        System.out.println("Contador de BH: " + countBH);
        System.out.println("Contador de BrasiliaPetropolis: " + countBrasPetr);
        System.out.println("_________________________________________________________");
        System.out.println("Matriz de Automóveis:");
        for (int j = 0; j < 1000; j++) {
            for (int j2 = 0; j2 < 2; j2++) {
                System.out.print(automob[j][j2]);                
            }
        }
        System.out.println("__________________________________________________________");
        System.out.println("Matriz de Caminhões:");
        for (int j = 0; j < 1000; j++) {
            for (int j2 = 0; j2 < 2; j2++) {
                System.out.print(truck[j][j2]);                
            }
        }
        System.out.println("__________________________________________________________");
        System.out.println("Matriz de Ônibus:");
        for (int j = 0; j < 1000; j++) {
            for (int j2 = 0; j2 < 2; j2++) {
                System.out.print(bus[j][j2]);                
            }
        }


    }
}
