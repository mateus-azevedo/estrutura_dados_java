package listaencadeada;

public class Main {

	public static void main(String[] args) {
		
		ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();
		
		minhaListaEncadeada.add("teste1");
		minhaListaEncadeada.add("teste1");
		minhaListaEncadeada.add("teste1");
		minhaListaEncadeada.add("teste1");
		
		System.out.println(minhaListaEncadeada.get(0));
		System.out.println(minhaListaEncadeada.get(0));
		System.out.println(minhaListaEncadeada.get(0));
		System.out.println(minhaListaEncadeada.get(0));
		
		System.out.println(minhaListaEncadeada);
		
		System.out.println(minhaListaEncadeada.remove(3));
		
		System.out.println(minhaListaEncadeada);

	}

}
