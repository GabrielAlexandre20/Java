import java.util.Scanner;
import java.text.DecimalFormat;
public class main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		
		float a1, a2, media;
		int pre;
		
		
		System.out.println("Digite a primeira nota: ");
		a1 = Float.parseFloat(ler.next());
		System.out.println("Digite a segunda nota: ");
		a2 = Float.parseFloat(ler.next());
		System.out.println("Digite a % de presen�a: ");
		pre = Integer.parseInt(ler.next());
		
		media = (a1 +(2*a2)) /3;
		
		System.out.printf("Sua nota �: ");
		System.out.println(deci.format(media));
		System.out.println("Sua porcentagem de presen�a: " +pre+ "%");
		
		if((pre>75) && (media>=5)) {
			System.out.println("Aprovado!");
		}else if((pre>75) && (media<5)) {
			System.out.println("RE!");
		}else if((pre<75) || (media<3)) {
			System.out.println("Reprovado!");
		}
		
		
		
		

	}

}
