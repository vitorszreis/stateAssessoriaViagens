package padroescomportamentais.state;

public class Viagem {

    private String cliente;
    private String destino;
    private ViagemEstado estado;

    public Viagem() {
        this.estado = ViagemEstadoReservada.getInstance();
    }

    public void setEstado(ViagemEstado estado) {
        this.estado = estado;
    }

    public boolean reservar() {
        return estado.reservar(this);
    }

    public boolean concluir() {
        return estado.concluir(this);
    }

    public boolean suspender() {
        return estado.suspender(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public boolean expirar() {
        return estado.expirar(this);
    }

    public boolean transferir() {
        return estado.transferir(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public ViagemEstado getEstado() {
        return estado;
    }
}
