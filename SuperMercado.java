import java.util.Scanner;
public class SuperMercado {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);	
        double valorUni, valorT, sub, valorD, valorCD;
        int qtdProduto;
        String nomeProduto;
        
        System.out.println("Digite o nome do Produto: ");
        nomeProduto=leia.nextLine();
        System.out.println("Digite a qtd: ");
        qtdProduto=leia.nextInt();
        System.out.println("Digite o preço: ");
        valorUni=leia.nextDouble();
        
        valorT=valorUni*qtdProduto;
        
        System.out.println("Produto: "+nomeProduto);
        System.out.println("Qtd: "+qtdProduto);
        System.out.println("Valor Total: "+valorT);
        
        System.out.println("Desconto na nota: ");
        sub=leia.nextDouble();
        
        valorCD=valorT-sub;
        
        System.out.println("Valor do desconto: "+sub);
        System.out.println("Valor com desconto: "+valorCD);
        
        
        
	}

}
