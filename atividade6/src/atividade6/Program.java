package atividade6;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] nomes = {"daniell ", "diogo ", "jefferson ", "karen<3amor "};
		
		// System.out.println(nomes[0] + nomes[1] + nomes[2] + nomes[3] + nomes[4] + nomes[5] + nomes[6]);
		
		double[] notas = {7.5, 9.3, 2.4, 8.0};
		System.out.println(nomes.length);
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("aluno: "+ nomes[i] + "| nota: " + notas[i]);
		}
		
		int[] dados = {4, 55, 17, 1, 3, 4, 5};
		
		for (int c = 0; c < dados.length; c++) {
			if (dados[c] == 4) {
				System.out.println("tem 4 na posição: "+c);
			}
				
		}
		
		boolean temquatro = false;
		for (int c = 0; c < dados.length; c++) {
			if (dados[c] == 4) {
				temquatro = true;
			}	
		}
		if(temquatro) {
			System.out.println("tem quatro ótario!");
		}else {
			System.out.println("tem não!");
		}
		
		int[] dados1 = {1, 2, 5, 77, 13, 15, 25};
		boolean[] epar = new boolean[7];
		
		for (int v = 0; v < 7; v++) {
			if (dados1[v] % 2 == 0) {
				epar[v] = true;
			}
			System.out.print(epar[v]+" ");
			System.out.println("");
		}
	
		System.out.println("-------------------------------------");
		
		// cria um array de ingredientes e avisa "alérgicos, contém leite"
		// "alérgicos, contém camarão"
		
		String[] ingredientes = {"açúcar", "café", "leite"};
		
		System.out.println("lista de ingredientes: ");
		for (int j = 0; j < 3; j++) {
			System.out.println(ingredientes[j]);
			if (ingredientes[j].equals("leite")) {
				System.out.println("contém leite!");
			}
		}

		
		System.out.println("------------------------------------");
		
		// cria um array do tipo String e inicie ele com vários nomes
		// se o nome contém a letra "c"...
		// muda o nome todo para CHIMPAZÉ
		
		String[] nomes1 = {"madalena", "gustavo", "agenor", "carlos", "givaldo", "carla"};
		
	    for (int l = 0; l < 6; l++) {
	    	if (nomes1[l].contains("c")) {
	    		nomes1[l] = "CHIMPANZÉ";
	    	}
	    	System.out.println(nomes1[l]);
	    }
		
		
		
		
	}

}