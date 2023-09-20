public class Motocicleta {
    private String modelo;
    private String marca;
    private int numeroChassi;
    private String numeroPlaca;
    private String cor;
    private int cilindradas;
    public static void main(String[] args) {
    Motocicleta moto = new Motocicleta();

    moto.mostraDados();
    }
    // Construtor 1: Recebe número do chassi e número da placa
    public Motocicleta(int numeroChassi, String numeroPlaca) {
        this.numeroChassi = numeroChassi;
        this.numeroPlaca = numeroPlaca;
    }

    // Construtor 2: Recebe modelo e marca
    public Motocicleta(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    // Construtor 3: Construtor default (sem parâmetros)
    public Motocicleta() {
        // Não é necessário implementar código aqui, pois não há parâmetros para inicializar.
    }

    // Método para mostrar os dados da motocicleta
    public void mostraDados() {
        System.out.println("Modelo : " + modelo);
        System.out.println("Marca : " + marca);
        System.out.println("Número do chassi : " + numeroChassi);
        System.out.println("Número da placa : " + numeroPlaca);
        System.out.println("Cor : " + cor);
        System.out.println("Número de Cilindradas : " + cilindradas);
    }

    // Outros métodos da classe Motocicleta, se houver...
}
