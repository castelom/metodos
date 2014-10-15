package ifce;

public class Contador {
	public String ContaPares(int num){
		int i;
		String texto = "números pares";
		for(i = 0; i<= num; i = i+2){
			System.out.println(i);
		}
		return texto;
	}
	
	public void ContaImpares(int num){
		int i;
		for(i = 1; i<= num; i = i+2){
			System.out.println(i);
		}
	}
	
	public String ContaTudo(int num){
		int i;
		String texto = "números";
		for(i = 0; i<= num; i++){
			System.out.println(i);
		}
		return texto;
	}
}
