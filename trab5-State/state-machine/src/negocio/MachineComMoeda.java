package negocio;

public class MachineComMoeda extends MachineState{
        
        public MachineComMoeda(Machine machine) {
            super(machine);        
            machine.setMoeda(true);
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
            print("Não é possível sem goma");
        }      
    
        @Override
        public void virarManivela(){
            print("Virando manivela...");
            machine.gomaVendida();
            machine.setMachineState(new MachineSemMoeda(machine));
        }

}
