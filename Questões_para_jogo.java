/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questões_para_jogo;

/**
 *
 * @author rafac
 */
public class Questões_para_jogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        boolean acertou = false;
        int contador = 0;
        String alternativa;
        do {
            System.out.println("O valor em binário do decimal 227 é:");
            System.out.println("a) 10101000"); 
            System.out.println("b) 10101101");
            System.out.println("c) 11100011"); // resposta correta
            System.out.println("d) 1011110");
            System.out.println("e) 1011101");
            System.out.print("Escolha uma alternativa: ");
            alternativa = entrada.next();
            switch (alternativa) {
                case "a":
                case "A":
                case "b":
                case "B":
                case "c":
                case "C":
                    System.out.println("Resposta correta!");
                    acertou = true;
                    contador = contador + 1;
                    break;
                case "d":
                case "D":
                case "e":
                case "E":
                    System.out.println("Resposta incorreta!");
                    contador = contador + 1;
                    break;
                default:
                    System.out.println("Escolha inválida!");
                    contador = contador + 1;
            }
        } while (!acertou && contador < 3);
        if (acertou) {
            System.out.println("Você acertou na " + contador + "atentativa!");
        } else {
            System.out.println("Resposta incorreta nas 3 tentativas!");
        }
    }
    
}
