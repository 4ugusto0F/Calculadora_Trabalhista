import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        double valor = 0;
        try (Scanner inpt = new Scanner(System.in)){
        System.out.println("|\\/\\/\\/\\/CALCULADORA\\/\\/\\/\\/|");
        
        System.out.println("\n Qual o seu nome: "); Professor P1 = new Professor(inpt.nextLine());

        System.out.println("\n Qual o tipo de regime de pagamento [CLT|HORISTA|PJ]:");
        R_Pagamentos R1 = new R_Pagamentos();
        String tipoG =  inpt.nextLine();
        String tipo = tipoG.toUpperCase();

        if(tipo.equals("CLT")){
            System.out.println("Qual o valor que você recebe mensalmente:");
            valor = R1.clt(inpt.nextDouble());
            System.out.println("Sr.(a) "+P1.getNome()+" O valor a receber é de: " + valor);
        }
        else if (tipo.equals("HORISTA")) {
            System.out.println("Quantas horas você trabalha? Quanto você ganha por hora? ");
            valor = R1.horista(inpt.nextDouble(),inpt.nextDouble());
            System.out.println("Sr.(a) "+P1.getNome()+" O valor a receber é de: " + valor);
        }
        else {
            System.out.println("Qual o valor do contrato ?");
            valor = R1.pj(inpt.nextDouble());
            System.out.println("Sr.(a) "+P1.getNome()+" O valor a receber é de: " + valor);
        }
        
        } 
        
    }
    
}