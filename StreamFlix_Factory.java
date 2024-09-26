import java.util.ArrayList;

public class StreamFlix_Factory {
    public static void main(String[] args) {

        // Instancias das fábricas
        SerieFactory serieFactory = new SerieFactory();
        FilmeFactory filmeFactory = new FilmeFactory();

        // Cria uma lista de atores para testes
        ArrayList<String> atores1 = new ArrayList<>();
        atores1.add("Ator 1");
        atores1.add("Ator 2");

        // Cria uma lista de atores para testes
        ArrayList<String> atores2 = new ArrayList<>();
        atores2.add("Ator 3");
        atores2.add("Ator 4");

        Video filme1 = filmeFactory.criarVideo("Filme exemplo 1", "Diretor exemplo 1", 2024, "Ação", atores1);

        System.out.println("Impressão do(s) Filme(s)");
        System.out.println(filme1.toString());

        Video serie1 = serieFactory.criarVideo("Serie exemplo 1", "Diretor da serie exemplo 1", 2023, "Drama", atores2);

        System.out.println("Impressão da(s) Serie(s)");
        System.out.println(serie1.toString());

    }
}
