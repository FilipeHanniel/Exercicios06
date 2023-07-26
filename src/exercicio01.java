import java.util.Scanner;

public class exercicio01 {
    
    public static void main(String[] args) {
        
        int origin = 0, destin = 0, vehicle = 0;

        int i = 0, answer1 = 0, answer2 = 0, answer3 = 0, countBH = 0, countBrasPetr = 0;
        int loop = 1;
        

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
            } else if (origin == ) {
                
            } else {
                
            }

            i += 1;
        
       } while (loop > 0);

       for (int j = 0; j < 10000; j++) {
        if (interview[j][0] == 1) {
            countBH += 1;
        } else if (interview[j][0] == 4 && interview[j][1] == 2) {
            countBrasPetr += 1;
        }        
       }  


        sc.close();

        System.out.println(countBH);
        System.out.println(countBrasPetr);
    }
}
