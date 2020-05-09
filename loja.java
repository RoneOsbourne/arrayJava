import javax.swing.JOptionPane;

public class loja {

	public static void main(String[] args) {
		
		String cDNome    = JOptionPane.showInputDialog("Digite o nome do CD: ");
		String cDPreco   = JOptionPane.showInputDialog("Digite o preco: ");
		String cDArtista = JOptionPane.showInputDialog("Digite o Artista: ");
		String vQtd = JOptionPane.showInputDialog("Digite a quantidade que deseja comprar: ");
		
		CD c1 = new CD(cDNome, Integer.parseInt(cDPreco), cDArtista);
		
		double valCompra = c1.compraCD(Integer.parseInt(vQtd));
		
		System.out.println("Comprado(s): " + vQtd + " do CD: " + cDNome);
		System.out.println("Artista: " + cDArtista);
		System.out.println("Valor: " + valCompra);
		
		CD[] arrayCD = new CD[3];
		
		/*Setando valores
		arrayCD[0] = new CD("Reunion", 40, "Black Sabbath");
		arrayCD[1] = new CD("Live Era", 80, "Guns 'N Roses");
		arrayCD[2] = new CD("Master Of Puppets", 35, "Metallica");
		*/
		
		for(int i = 0; i < arrayCD.length; i++) {
			System.out.println(arrayCD[i].nome);
					
		}

	}

}
