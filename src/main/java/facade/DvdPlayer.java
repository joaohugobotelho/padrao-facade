package facade;

public class DvdPlayer {
    public String ligar(){
        return "DvD ligado.";
    }

    public String reproduzirFilme(String filme) {
        return "Reproduzindo filme: " + filme;
    }

    public String desligar() {
        return "DvD desligado.";
    }
}
