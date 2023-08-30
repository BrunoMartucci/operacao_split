package operacao_split;


public class Exemplo {


	public static void main(String[] args) {
		String S = "potato apple lemon orange";
		
		String[] vect = S.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
		

	}

}