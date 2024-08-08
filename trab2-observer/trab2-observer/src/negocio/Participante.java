package negocio;

public class Participante implements Observer{
    private String nome;
    private String status;
    private Float lance;

    public Participante(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String status) {
        this.status = status;
        System.out.println(this.nome + " foi notificado: " + this.status);
    }

    public void darLance(Float lance) {
        this.lance = lance;
    }

    public String getNome() {
        return this.nome;
    }

    public Float getLance() {
        return this.lance;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setLance(Float lance) {
        this.lance = lance;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }   

    @Override  
    public String toString() {
        return "Participante [lance=" + lance + ", nome=" + nome + ", status=" + status + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Participante other = (Participante) obj;
        if (lance == null) {
            if (other.lance != null)
                return false;
        } else if (!lance.equals(other.lance))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        } else if (!status.equals(other.status))
            return false;
        return true;
    }
    
}
