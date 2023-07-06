import java.util.Scanner;
public class Taxi {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double valor=0, km, preco; 
		int taxa;
		
		System.out.println("Digite 1 para taxa1 ou 2 para taxa2: ");
		taxa=leia.nextInt();
		
		if (taxa==1) {
			valor=1.80;
		}else if(taxa==2) {
			valor=2.30;
		}
		
		System.out.println("Digite o Km rodado: ");
		km=leia.nextDouble();
		preco=valor*km;
		
		System.out.println("Valor da corrida: "+preco);
		
		  

	}

}
