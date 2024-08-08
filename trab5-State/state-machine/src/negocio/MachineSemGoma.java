package negocio;

public class MachineSemGoma extends MachineState{
    
        public MachineSemGoma(Machine machine) {
            super(machine); 
            this.print("Máquina sem goma");       
        }
    

        @Override
        public void entregar() {
            print("Não é possível entregar, maquina sem goma");
        }
    
        @Override
        public void semGoma() {
            print("Não é possível sem goma");
        }


        @Override
        public void virarManivela() {            
            machine.gomaEsgotada();
            machine.ejetarMoeda();
        }
}
