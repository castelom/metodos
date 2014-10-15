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
	public void ContaParEImpar(int num){
		System.out.println("Conta Pares");
		ContaPares(num);
		System.out.println("Conta Impares");
		ContaImpar(num);
	}
	public int CountDobro(int num){
		int i;
		for(i=0;i<num;i++){
			System.out.println(2*i);
		}
		return i;
	}
	
	public void CountTriplo(int num){
		int i;
		for(i=0;i<num;i++){
			System.out.println(3*i);
		}
	}
	
}
