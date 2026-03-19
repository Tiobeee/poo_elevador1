import java.util.Random;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private boolean portaAberta;

    Random random = new Random();

    public Elevador(int totalAndares) {
        this.andarAtual = 0;
        this.totalAndares = totalAndares;
        this.portaAberta = false;
    }

    public void abrirPorta() {
        int pessoa = random.nextInt(3);
        this.portaAberta = true;
        System.out.println("Porta aberta.");
    }

    public void fecharPorta() {
        int pessoa = random.nextInt(3);
        this.portaAberta = false;
        System.out.println("Porta fechada.");
    }

    public void subir() {
        int pessoa = random.nextInt(3);
        if (portaAberta) {
            System.out.println("Não é possível subir com a porta aberta!");
        } else if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("Subindo. Andar atual: " + andarAtual);
        } else {
            System.out.println("Você já está no último andar.");
        }
    }

    public void descer() {
        int pessoa = random.nextInt(3);
        if (portaAberta) {
            System.out.println("Não é possível descer com a porta aberta!");
        } else if (andarAtual > 0) {
            andarAtual--;
            System.out.println("Descendo... Andar atual: " + andarAtual);
        } else {
            System.out.println("O elevador já está no térreo.");
        }
    }

    public void exibirStatus() {
        int pessoa = random.nextInt(3);
        String statusPorta = portaAberta ? "Aberta" : "Fechada";
        if (pessoa > 0) {
            System.out.println("\nANDAR: " + andarAtual + " PORTA: " + statusPorta + " Pessoas no elevador: " + pessoa);
        } else {
            System.out.println("\nANDAR: " + andarAtual + " PORTA: " + statusPorta);
        }
    }
}