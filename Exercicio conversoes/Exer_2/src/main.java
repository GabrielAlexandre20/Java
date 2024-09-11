package Exer_2;
import java.util.Scanner;
public class main {
	

	

	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
        
        Aluno a1 = new Aluno (); 
        
        System.out.println("Nome do aluno");
        a1.setNome(scan.next());
        System.out.println("N1 do aluno"); 
        a1.setNota_a1(scan.nextFloat());
        System.out.println("N2 do aluno");
        a1.setNota_a2(scan.nextFloat());
        System.out.println("Frequencia do aluno");
        a1.setFrequencia(scan.nextFloat());
        
        Aluno a2 = new Aluno ();
        
        System.out.println("Nome do aluno");
        a2.setNome(scan.next());
        System.out.println("N1 do aluno"); 
        a2.setNota_a1(scan.nextFloat());
        System.out.println("N2 do aluno");
        a2.setNota_a2(scan.nextFloat());
        System.out.println("Frequencia do aluno");
        a1.setFrequencia(scan.nextFloat());
        
        
        Aluno a3 = new Aluno ();
        
        System.out.println("Nome do aluno");
        a3.setNome(scan.next());
        System.out.println("N1 do aluno"); 
        a3.setNota_a1(scan.nextFloat());
        System.out.println("N2 do aluno");
        a3.setNota_a2(scan.nextFloat());
        System.out.println("Frequencia do aluno");
        a3.setFrequencia(scan.nextFloat());
        
        
        
        Aluno a4 = new Aluno ();
        
        System.out.println("Nome do aluno");
        a4.setNome(scan.next());
        System.out.println("N1 do aluno"); 
        a4.setNota_a1(scan.nextFloat());
        System.out.println("N2 do aluno");
        a4.setNota_a2(scan.nextFloat());
        System.out.println("Frequencia do aluno");
        a4.setFrequencia(scan.nextFloat());
        
        
        Aluno a5 = new Aluno ();
        
        System.out.println("Nome do aluno");
        a5.setNome(scan.next());
        System.out.println("N1 do aluno"); 
        a5.setNota_a1(scan.nextFloat());
        System.out.println("N2 do aluno");
        a5.setNota_a2(scan.nextFloat());
        System.out.println("Frequencia do aluno");
        a5.setFrequencia(scan.nextFloat());

        a1.informacoes();
        a1.SituacaoAluno();
    
        a2.informacoes();
        a2.SituacaoAluno();
        
        a3.informacoes();
        a3.SituacaoAluno();
        
        a4.informacoes();
        a4.SituacaoAluno();
        
        a5.informacoes();
        a5.SituacaoAluno();
	}

}
