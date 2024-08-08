import negocio.Leiloeiro;
import negocio.Participante;

public class App {
    public static void main(String[] args) throws Exception {
        Leiloeiro leiloeiro = new Leiloeiro();
        Participante participante1 = new Participante("João");
        leiloeiro.subscribe(participante1);

        leiloeiro.iniciarLeilao();

        Participante participante2 = new Participante("Maria");
        leiloeiro.subscribe(participante2);

        leiloeiro.iniciarLeilao();

        Participante participante3 = new Participante("José");
        leiloeiro.subscribe(participante3);

        leiloeiro.iniciarLeilao();


        participante1.darLance(1000f);
        leiloeiro.changedState(participante1);
        participante2.darLance(2000f);
        leiloeiro.changedState(participante2);
        participante3.darLance(1500f);
        leiloeiro.changedState(participante3);

        

        leiloeiro.encerrarLeilao();

        
    }
}
