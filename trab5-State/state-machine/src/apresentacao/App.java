package apresentacao;

import negocio.Machine;

public class App {
    public static void main(String[] args) throws Exception {
        Machine machine = new Machine(5);

        ////////////////////////////
        System.out.println(machine.getEstadoAtualString());
        System.out.println(machine.getGomas());
        machine.virarManivela();
        machine.insereMoeda();
        machine.virarManivela();
        System.out.println(machine.getEstadoAtualString());
        ////////////////////////////

        ////////////////////////////
        System.out.println(machine.getGomas());
        machine.insereMoeda();
        machine.virarManivela();
        System.out.println(machine.getEstadoAtualString());
        ////////////////////////////

        ////////////////////////////
        System.out.println(machine.getGomas());
        machine.insereMoeda();
        machine.virarManivela();
        System.out.println(machine.getEstadoAtualString());
        ////////////////////////////

        ////////////////////////////
        System.out.println(machine.getGomas());
        machine.insereMoeda();
        machine.virarManivela();
        System.out.println(machine.getEstadoAtualString());
        ////////////////////////////

        ////////////////////////////
        System.out.println(machine.getGomas());
        machine.insereMoeda();
        machine.virarManivela();
        System.out.println(machine.getEstadoAtualString());
        ////////////////////////////

        ////////////////////////////
        System.out.println(machine.getGomas());
        machine.insereMoeda();
        machine.virarManivela();
        System.out.println(machine.getEstadoAtualString());
        ////////////////////////////

        ////////////////////////////
        System.out.println(machine.getGomas());
        machine.insereMoeda();
        machine.virarManivela();
        System.out.println(machine.getEstadoAtualString());
        ////////////////////////////

    }
}
