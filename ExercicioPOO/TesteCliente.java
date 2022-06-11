package ExercicioPOO;

public class TesteCliente {

	public static void main(String[] args) {
		ClienteClasse c1 = new ClienteClasse("Vitoria", 22, 1.53, 55);
		ClienteClasse c2 = new ClienteClasse("Jonathan", 15, 1.61, 57);
		
		System.out.println(c1.getNome() + " tem " + c1.getIdade() + " anos, "
				+ c1.getAltura() + " de altura e " + c1.getPeso() + " kilogramas.");
		
		System.out.println("\n" + c2.getNome() + " tem " + c2.getIdade() + " anos, "
				+ c2.getAltura() + " de altura e " + c2.getPeso() + " kilogramas.");

	}

	}
