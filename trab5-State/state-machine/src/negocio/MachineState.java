package negocio;

public abstract class MachineState {

    protected Machine machine;

    public MachineState(Machine machine) {
        this.machine = machine;
    }

    public abstract void semGoma();
    public abstract void entregar();
    public abstract void virarManivela();
    
    
    public void print(String message){
        System.out.println(message);
    }   
    
    public void printGomas(){
        System.out.println("Gomas restantes: " + machine.getGomas());
    }
    
    public void printEstadoAtual(){
        System.out.println("Estado atual: " + machine.getEstadoAtualString());
    }
    
    public void insereMoeda(){
        print("Moeda inserida");
        machine.setMachineState(new MachineComMoeda(machine));
    };
    // public void virarManivela(){
    //     if(machine.getGomas() > 0){
    //         print("Virando manivela...");
    //         machine.gomaVendida();
    //     }else{
    //         print("Goma esgotada!");
    //         machine.gomaEsgotada();
    //         machine.ejetarMoeda();
    //     }
    // }

    public void gomaEsgotada(){
        machine.setMachineState(new MachineSemGoma(machine));
        print("Goma esgotada!");
        printGomas();
        printEstadoAtual();
    }

    public void ejetarMoeda(){
        print("Ejetando moeda...");
        machine.setMachineState(new MachineSemMoeda(machine));
        //machine.setMachineState(new MachineSemMoeda(machine));
        printEstadoAtual();
    }

    public void gomaVendida(){
        print("Goma entregue!");
        printGomas();
        machine.setMachineState(new MachineSemMoeda(machine));
        if(machine.getGomas() <= 0){
            machine.setMachineState(new MachineSemGoma(machine));
        }
        printEstadoAtual();
    }
        
}
