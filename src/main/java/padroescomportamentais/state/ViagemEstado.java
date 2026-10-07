package padroescomportamentais.state;

public abstract class ViagemEstado {

    public abstract String getEstado();

    public boolean reservar(Viagem viagem) {
        return false;
    }

    public boolean concluir(Viagem viagem) {
        return false;
    }

    public boolean suspender(Viagem viagem) {
        return false;
    }

    public boolean cancelar(Viagem viagem) {
        return false;
    }

    public boolean expirar(Viagem viagem) {
        return false;
    }

    public boolean transferir(Viagem viagem) {
        return false;
    }

}
