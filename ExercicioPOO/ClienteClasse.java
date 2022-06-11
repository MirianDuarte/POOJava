package ExercicioPOO;

public class ClienteClasse {

	private String nome;
	private int idade;
	private double altura;
	private double peso;
	
		//Metodos
	public ClienteClasse(String nome, int idade, double altura, double peso) {
		//Super atua como uma variável de referência para os objetos da classe pai
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}

	public String getNome() {
		//return serve para retornar algo de dentro do método
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	//Os métodos GET e SET são técnicas padronizadas para gerenciamento sobre o acesso dos atributos
	public int getIdade() {
		return idade;
	}
	//Os métodos GET e SET são técnicas padronizadas para gerenciamento sobre o acesso dos atributos
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		//this é usado para referenciar a um atributo externo fora do metodo
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}