import java.util.ArrayList;

abstract class VideoFactory {

    public abstract Video criarVideo(String titulo, String diretor, int anoLancamento, String genero,
            ArrayList<String> listaAtoresPrincipais);

}
