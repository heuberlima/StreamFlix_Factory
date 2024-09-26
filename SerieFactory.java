import java.util.ArrayList;

public class SerieFactory extends VideoFactory {
    public Video criarVideo(String titulo, String diretor, int anoLancamento, String genero,
            ArrayList<String> listaAtoresPrincipais) {
        return new Serie(titulo, diretor, anoLancamento, genero, listaAtoresPrincipais);
    }

}
