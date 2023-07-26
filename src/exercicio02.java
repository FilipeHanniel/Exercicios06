import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args) {
        
        float[][] diarioDeClasse = new float[2000][4];
        int i = 0, loop = 1, index = 0;
        float maiorMedia = 0, flag;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("digite os dados do aluno " + (i+1));
            System.out.print("Nº de matrícula: ");
            flag = Float.parseFloat(sc.nextLine());
            if (flag == 0) {
                break;
            }
            diarioDeClasse[i][0] = flag;
            System.out.print("Sexo (0 para masculino e 1 para feminino): ");
            diarioDeClasse[i][1] = Float.parseFloat(sc.nextLine());
            System.out.print("Nº do curso: ");
            diarioDeClasse[i][2] = Float.parseFloat(sc.nextLine());
            System.out.println("Média geral no curso: ");
            diarioDeClasse[i][3] = Float.parseFloat(sc.nextLine());

            i += 1;

        } while (loop > 0);

        sc.close();

        for (int j = 0; j < 2000; j++) {
            if (diarioDeClasse[j][1] == 1 && diarioDeClasse[j][2] == 153) {
                if (diarioDeClasse[j][3] > maiorMedia) {
                    maiorMedia = diarioDeClasse[j][3];
                    index = j;
                }
            }
            
        }

        System.out.println("O aluno com a melhor média foi:");
        System.out.println(diarioDeClasse[index][0]);
    }
    
}
