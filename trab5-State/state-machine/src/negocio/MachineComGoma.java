package negocio;

public class MachineComGoma extends MachineState{
        
            public MachineComGoma(Machine machine) {
                super(machine);  
                machine.setMachineState(new MachineSemMoeda(machine));      
            }
        
            @Override
            public void insereMoeda() {
                print("Moeda inserida");
            }
        
            @Override
            public void entregar() {
                print("Entregando goma...");
                machine.gomaVendida();                
            }
        
            @Override
            public void semGoma() {
                //print("Não é possível sem goma");
            }      

            @Override
            public void virarManivela(){
                print("Virando manivela...");
                machine.gomaVendida();
                machine.setMachineState(new MachineSemMoeda(machine));
            }
            
    
}
