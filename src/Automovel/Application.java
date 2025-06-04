package Automovel;

public class Application {
    public static void main(String[] args) {
        CarroAutomatico carro = new CarroAutomatico(4,180);
        MotoPartidaPedal moto = new MotoPartidaPedal(2,120);
        Guincho guincho = new Guincho();

//        carro.ligar();  // Não liga - freio não pressionado
        carro.pressionarFreio();
        carro.ligar();  // Liga

//        moto.ligar();   // Não liga - acelerador não puxado
        moto.puxarAcelerador();
        moto.ligar();   // Liga

//        guincho.carregar(carro);
//        guincho.carregar(moto);
    }
}
