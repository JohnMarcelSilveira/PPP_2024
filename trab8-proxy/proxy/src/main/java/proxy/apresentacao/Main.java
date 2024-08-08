package proxy.apresentacao;

import proxy.model.Carro;
import proxy.model.Model;
import proxy.model.PessoaProxy;

public class Main {
    public static void main(String[] args) {
        Model p = new PessoaProxy(18, true);
        System.out.println(p.getIdade());
        System.out.println(p.isHabilitado());
        Carro c = new Carro();
        System.out.println(c.manobrar(p));
        Model p2 = new PessoaProxy(17, false);
        System.out.println(p2.getIdade());
        System.out.println(p2.isHabilitado());
        System.out.println(c.manobrar(p2));
    }
}