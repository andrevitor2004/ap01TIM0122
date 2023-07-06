import java.util.Scanner;
public class ImpaPar {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num=1;
		
		System.out.println("Digite um numero:");
		
		do {
			
			num=leia.nextInt();
			
			if ( num==0 ) {
				System.out.println("programa encerrado");
				}
				else if (num%2==0){
					
					System.out.println("numero par");
					System.out.println("Digite 0 para sair ou outro numero para continuar");
				} else {
					System.out.println("numero impa");
					System.out.println("Digite 0 para sair ou outro numero para continuar");
				}
			
			
						
				
				
			}while(num!=0);
		
		
		
		
		}
		

	}


