
import java.util.Scanner;

/**
 *
 * @author Yan
 */
public class App {
    
    public static void main(String[] args) {
        
        //declaração das variáveis e constantes do sistema
        double altura, pesoIdeal;
        int sexo;
        Scanner tecla = new Scanner(System.in); 
        final double FATOR = 44.7;
        
        for (int i = 0; i < 10; i++) {
            
            //Entrada de dados
            System.out.println("Digite a altura:");
            altura = tecla.nextDouble();
            System.out.println("Digite seu sexo (1-FEM/2-MASC):");
            sexo = tecla.nextInt();
        
            //Processamento de dados
            if (sexo == 1){
                pesoIdeal = (62.1 * altura) - FATOR; 
            }else {
                pesoIdeal = (72.7 * altura) - FATOR;
            }
            
            //saída da informação
            System.out.println("Seu peso ideal é : " + pesoIdeal);
        }
        
        
    }
}
