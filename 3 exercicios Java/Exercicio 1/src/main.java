import java.util.Scanner;
import java.text.DecimalFormat;
public class main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		float a1;
		float a2;
		float media;
		
		System.out.println("Digite a nota 1: ");
		a1 = Float.parseFloat(ler.next());
		System.out.println("Digite a nota 2: ");
		a2 = Float.parseFloat(ler.next());
		
		media = (a1 +(2*a2)) /3;
		
		System.out.printf("Sua nota é: ");
		System.out.println(deci.format (media));
		
		if(media<3) {
			System.out.println("Reprovado!");
		}else
		
		if(media<=5) {
			System.out.println("RE!");
		}else System.out.println("Aprovado!");
		
		
		
		

	}

}
