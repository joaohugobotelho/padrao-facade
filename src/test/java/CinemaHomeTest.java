import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import facade.CinemaHome;

public class CinemaHomeTest {

    @Test
    public void deveIniciarCinema() {
        CinemaHome facede = new CinemaHome();

       String filme = "Gente Grande";

       String resultado = facede.assistirFilme(filme);

        assertTrue(resultado.contains("Projetor ligado"));
        assertTrue(resultado.contains("Sistema de som ligado"));
        assertTrue(resultado.contains("Reproduzindo filme: "+ filme));
    }

    @Test
    public void deveEncerrarCinema() {
        CinemaHome facede = new CinemaHome();

        String resultado = facede.encerrarCinema();

        assertTrue(resultado.contains("DvD desligado."));
        assertTrue(resultado.contains("Projetor desligado"));
        assertTrue(resultado.contains("Sistema de som desligado"));

    }
}
