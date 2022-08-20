import java.util.Scanner;

import api.Chefe;
import api.Empregado;
import api.Estagiario;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        Chefe chefe = new Chefe("Hugo Boss", "HB123");
        Empregado empregado = new Empregado("Rafinha", "EM456");
        Estagiario estagiario = new Estagiario("Samuca", "IN789");

        int opcao;

        System.out.println("Informe sua hierarquia na empresa\n[1] Chefe\n[2] Empregado\n[3] Estagiário");
        opcao = read.nextInt();

        switch (opcao) {
            case 1:
                chefe.calcularSalario();
                System.out.println(chefe.toString());
                break;
            case 2:
                empregado.calcularVt(37.0);
                empregado.calcularSalario();
                System.out.println(empregado.toString());
                break;
            case 3:
                estagiario.calcularSalario();
                System.out.println(estagiario.toString());
                break;
            default:
                System.out.println("Informe uma opção válida.");        
        }



        read.close();
    }
}
