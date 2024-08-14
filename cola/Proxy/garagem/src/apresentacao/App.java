package apresentacao;
import negocio.*;
public class App {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("João Silva", 20, 123456, true);
        Empregado empregado2 = new Empregado("Maria Souza", 17, 987654, false);
        Empregado empregado3 = new Empregado("Pedro Costa", 25, 0, false);

        CarroGaragem carroProxy1 = new CarroProxy("Preto", "ABC-1234", "Civic", "Honda");
        CarroGaragem carroProxy2 = new CarroProxy("Branco", "DEF-5678", "Corolla", "Toyota");

        carroProxy1.manobrar(empregado1); 
        carroProxy1.manobrar(empregado2);
        carroProxy1.manobrar(empregado3); 

        carroProxy2.manobrar(empregado1); 
        carroProxy2.manobrar(empregado2);
        carroProxy2.manobrar(empregado3); 
    }
}


