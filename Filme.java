import java.util.ArrayList;

// Classe Filme
class Filme extends Video {
    // Construtor
    public Filme(String titulo, String diretor, int anoLancamento, String genero,
            ArrayList<String> listaAtoresPrincipais) {
        super(titulo, diretor, anoLancamento, genero, listaAtoresPrincipais);
    }

    // Método toString
    public String toString() {
        return super.toString();
    }
}
