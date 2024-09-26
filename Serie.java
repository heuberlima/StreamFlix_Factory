import java.util.ArrayList;

// Classe Série
class Serie extends Video {
    // Construtor
    public Serie(String titulo, String diretor, int anoLancamento, String genero,
            ArrayList<String> listaAtoresPrincipais) {
        super(titulo, diretor, anoLancamento, genero, listaAtoresPrincipais);
    }

    // Método toString
    public String toString() {
        return super.toString();
    }
}