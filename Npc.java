public class Npc extends Personagem {

    private int poder;

    public Npc () {
        super();
    }

    public Npc (int poder) {
        this.poder = poder;
    }

    public Npc (String nome, String aparencia, String historia, int poder) {
        super(nome, aparencia, historia);
        this.poder = poder;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

}
