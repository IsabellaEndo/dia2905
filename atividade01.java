package vetor2905;

import java.util.ArrayList;

public class atividade01 {
	//Criando ArrayLIst de numeros inteiros 
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		numeros.add(10);//adicionanado elementos ao ArrayList 
		numeros.add(20);

		System.out.println(numeros.get(0)); //saida:10 //acessando elementos do arraylist 
		System.out.println(numeros.get(1)); //saida; 20

		numeros.set(1,25);
		System.out.println(numeros.get(1)); //saida:25 //modificando elementos do arraylist 

		numeros.remove(0);
		System.out.println(numeros.get(0)); //saida:25 //removendo elementos do arraylist 

		System.out.println(numeros.size()); //saida:2 //obtendo tamanho do arraylist 

	}

}
