package negocio;

public class MachineSemMoeda extends MachineState {
    public MachineSemMoeda(Machine machine) {
        super(machine);
        this.print("Máquina sem moeda");
        machine.setMoeda(false);
    }

    @Override
    public void insereMoeda() {
        print("Moeda inserida");
        machine.setMachineState(new MachineComMoeda(machine));
    }

    @Override
    public void ejetarMoeda() {
        print("Não é possível ejetar moeda, não há moeda inserida");
    }

    @Override
    public void virarManivela() {
        print("Não é possível virar manivela, não há moeda inserida");
    }

    @Override
    public void semGoma() {
        print("Não é possível sem goma");
    }

    @Override
    public void entregar() {
       print("Não é possível entregar, não há moeda inserida");
    }
    
}
