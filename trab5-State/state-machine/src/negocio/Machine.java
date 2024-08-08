package negocio;

public class Machine {
    private MachineState state;
    private int gomas;
    private boolean moeda;

    public Machine(int gomas) {
        this.gomas = gomas;
        this.moeda = false;
        if (gomas > 0) {
            state = new MachineComGoma(this);
        } else {
            state = new MachineSemGoma(this);
        }
    }

    public void insereMoeda() {
        if (gomas > 0 && !moeda) {
            state.insereMoeda();
        } else if (moeda) {
            System.out.println("Já existe uma moeda inserida");
            state = new MachineComMoeda(this);
        } else if (gomas <= 0) {
            state.gomaEsgotada();
        }
    }

    void ejetarMoeda() {
        state.ejetarMoeda();
    }

    public void virarManivela() {
        if(moeda && gomas > 0)
        state.virarManivela();
        else if(!moeda){
            this.semMoeda();
        }else if(gomas <= 0){
            state.gomaEsgotada();
        }
    }

    void semGoma() {
        this.gomas = 0;
        state.semGoma();
    }

    void gomaVendida() {
        this.gomas--;
        state.gomaVendida();
    }

    void gomaEsgotada() {
        state.gomaEsgotada();
    }

    void setMachineState(MachineState state) {
        this.state = state;
    }

    public MachineState getMachineState() {
        return state;
    }

    public String getEstadoAtualString() {
        return state.getClass().getSimpleName();
    }

    public int getGomas() {
        return gomas;
    }

    private void semMoeda(){
        System.out.println("Insira uma moeda");
        state = new MachineSemMoeda(this);
    }

    private void comMoeda(){
        System.out.println("Vire a manivela");
        state = new MachineComMoeda(this);
    }

    public void setMoeda(boolean moeda) {
        this.moeda = moeda;
    }
}