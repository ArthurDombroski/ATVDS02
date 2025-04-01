public class Personagem {

    private String nome;
    private String aparencia;
    private String historia;

    public Personagem(){}

    public Personagem(String nome, String aparencia, String historia) {
        this.nome = nome;
        this.aparencia = aparencia;
        this.historia = historia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAparencia() {
        return aparencia;
    }

    public void setAparencia(String aparencia) {
        this.aparencia = aparencia;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public void poder(){
        System.out.println("Soltar Poder");
    }
}