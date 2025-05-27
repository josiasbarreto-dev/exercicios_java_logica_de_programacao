package Automovel;

public class MotoPartidaPedal extends Moto{
    private boolean aceleradorPuxado;

    public MotoPartidaPedal(int numRodas, int velMax) {
        super(numRodas, velMax);
        this.aceleradorPuxado = false;
    }

    public boolean isAceleradorPuxado() {
        return aceleradorPuxado;
    }

    public void setAceleradorPuxado(boolean aceleradorPuxado) {
        this.aceleradorPuxado = aceleradorPuxado;
    }

    public void puxarAcelerador(){
        setAceleradorPuxado(true);
        System.out.println("Acelerador puxado.");
    }

    @Override
    public void ligar() {
        if (aceleradorPuxado) {
            super.ligar();
        } else {
            System.out.println("Para ligar a moto com partida a pedal, o acelerador deve estar puxado.");
        }
    }
}
