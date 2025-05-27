package Automovel;

public class CarroAutomatico extends Carro{
    private boolean freioPressionado;

    public CarroAutomatico(int numRodas, int velMax) {
        super(numRodas, velMax);
        this.freioPressionado = false;
    }

    public boolean isFreioPressionado() {
        return freioPressionado;
    }

    public void setFreioPressionado(boolean freioPressionado) {
        this.freioPressionado = freioPressionado;
    }

    public void pressionarFreio(){
        setFreioPressionado(true);
        System.out.println("Freio pressionado.");
    }

    public void soltarFreio() {
        setFreioPressionado(false);
        System.out.println("Freio solto.");
    }

    @Override
    public void ligar(){
        if (freioPressionado){
            super.ligar();
        }else {
            System.out.println("Para ligar o carro automático, o freio deve estar pressionado.");
        }
    }
}
