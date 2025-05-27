package Automovel;

public class Carro extends Automovel{

    public Carro(int numRodas, int velMax) {
        super(numRodas, velMax);
    }

    @Override
    public void ligar() {
        setLigado(true);
        System.out.println("Carro ligado");
    }
}
