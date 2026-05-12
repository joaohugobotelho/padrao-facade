package facade;

public class SistemaSom {
    public String ligar() {
        return "Sistema de som ligado.";
    }

    public String ajustarVolume(int volume){
        return "Volume ajustado" + volume;
    }

    public String desligar() {
        return "Sistema de som desligado";
    }
}

