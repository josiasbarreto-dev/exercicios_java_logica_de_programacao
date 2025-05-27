package Automovel;

public class Moto extends Automovel{
    public Moto(int numRodas, int velMax) {
        super(numRodas, velMax);
    }

    @Override
    public void ligar() {
        setLigado(true);
        System.out.println("Moto ligada");
    }
}
