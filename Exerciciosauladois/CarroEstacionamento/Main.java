package CarroEstacionamento;

public class Main {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento("Rua Avestruz", 90001007);
        estacionamento.adicionarCarro(new Carro("Hyundai", "HB20", "preto", "BEE4F00"));
        estacionamento.adicionarCarro(new Carro("Chevrolet", "Onix", "cinza", "FUN2M33"));
        estacionamento.adicionarCarro(new Carro("Ford", "Ka", "vermelho", "GEZ0W35"));
        System.out.println(estacionamento);
    }

}
