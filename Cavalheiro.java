public class Cavalheiro extends Personagem {

    private int espada;

    public Cavalheiro() {
        super();
    }

    public Cavalheiro(int espada) {
        this.espada = espada;
    }

    public Cavalheiro(String nome, String aparencia, String historia, int espada) {
        super(nome, aparencia, historia);
        this.espada = espada;
    }

    public int getEspada() {
        return espada;
    }

    public void setEspada(int espada) {
        this.espada = espada;
    }

}
