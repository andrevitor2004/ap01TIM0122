import java.util.Scanner;
public class MediaAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner leia = new Scanner(System.in);
	float soma,nota=0, media, max, min;
	int i;
	
	System.out.println("Digite a nota do Aluno 1: ");
	nota = leia.nextFloat();
	
	if(nota<5.0) {
		System.out.println("Aluno Reprovado");
	}else {
		System.out.println("Aluno Aprovado");
	}
	
	max=nota;
	min=nota;
	soma=nota;
	
	for(i=2;i<=10;i++) {
		System.out.println("Digite a nota do Aluno "+i+": ");
		nota = leia.nextFloat();
		soma=soma+nota;
		
		if(nota<=5.0) {
			System.out.println("Aluno Reprovado");
		}else {
			System.out.println("Aluno Aprovado");
		}
		
		
		if(nota>max) {
			max=nota;
		}else if (nota<min){
			min=nota;
		}
		
	}
	
	media=soma/10;
	
	System.out.println("Média das Notas: "+media);
	System.out.println("Maior nota:"+max);
	System.out.println("Menor nota:"+min);
	

	}

}
