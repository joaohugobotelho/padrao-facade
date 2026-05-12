package facade;

public class CinemaHome{
    private DvdPlayer dvd;
    private Projetor projetor;
    private SistemaSom som;

    public CinemaHome(){
        dvd = new DvdPlayer();
        projetor = new Projetor();
        som = new SistemaSom();
    }

    public String assistirFilme(String filme) {

        String resultado = "";

        resultado += projetor.ligar() + "/n";
        resultado += projetor.modoCinema() + "/n";

        resultado += som.ligar() + "/n";
        resultado += som.ajustarVolume(20) + "/n";

        resultado += dvd.ligar() + "n/";
        resultado += dvd.reproduzirFilme(filme);

        return resultado;
    }

    public String encerrarCinema() {

        String resultado = "";

        resultado += projetor.desligar() + "/n";
        resultado += som.desligar() + "/n";
        resultado += dvd.desligar() + "/n";

        return resultado;

    }
}
