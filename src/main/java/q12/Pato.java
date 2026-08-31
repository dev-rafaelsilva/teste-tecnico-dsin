package q12;

public class Pato {
    private String nome;

    public Pato(String nome) {
        this.nome = nome;
    }

    public void grasnar() {
        System.out.println(nome + " diz: Quack quack!");
    }

    public void nadar() {
        System.out.println(nome + " está nadando na lagoa.");
    }

    public static void main(String[] args) {
        Pato donald = new Pato("Donald");
        donald.grasnar();
        donald.nadar();
    }
}
