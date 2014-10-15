package ifce;

public class Contador {
	public void ContaPares(int num){
		int i;
		for(i = 0; i<= num; i = i+2){
			System.out.println(i);
		}
	}
	
	public void ContaImpar(int num){
		int i;
		for(i = 1; i<= num; i = i+2){
			System.out.println(i);
		}
	}
	
	public void ContaTudo(int num){
		int i;
		
		for(i = 0; i<= num; i++){
			System.out.println(i);
		}
	}
	
	public void ContaTudo100(){
		int i;
		for(i = 0; i<= 100; i++){
			System.out.println(i);
		}
	}
	public void ContaTudo300(){
		int i;
		for(i = 0; i<= 300; i++){
			System.out.println(i);
		}
	}
	public void ContaParEImpar(int num){
		System.out.println("Conta Pares");
		ContaPares(num);
		System.out.println("Conta Imapres");
		ContaImpar(num);
	}
	
}
