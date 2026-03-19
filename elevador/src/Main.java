public class Main {
    public static void main(String[] args) {
        Elevador elevadorPredio = new Elevador(5);

        System.out.println("--- Iniciando Simulação ---");

        elevadorPredio.exibirStatus();
        elevadorPredio.abrirPorta();
        elevadorPredio.subir();


        elevadorPredio.fecharPorta();
        elevadorPredio.subir();
        elevadorPredio.subir();

        elevadorPredio.exibirStatus();

        elevadorPredio.descer();
        elevadorPredio.descer();
        elevadorPredio.descer();

        elevadorPredio.exibirStatus();

        elevadorPredio.abrirPorta();

        elevadorPredio.exibirStatus();
    }
}