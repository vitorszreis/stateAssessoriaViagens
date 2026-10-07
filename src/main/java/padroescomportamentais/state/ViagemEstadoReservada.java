package padroescomportamentais.state;

public class ViagemEstadoReservada extends ViagemEstado {

    private ViagemEstadoReservada() {};
    private static ViagemEstadoReservada instance = new ViagemEstadoReservada();
    public static ViagemEstadoReservada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Reservada";
    }

    public boolean concluir(Viagem viagem) {
        viagem.setEstado(ViagemEstadoConcluida.getInstance());
        return true;
    }

    public boolean suspender(Viagem viagem) {
        viagem.setEstado(ViagemEstadoSuspensa.getInstance());
        return true;
    }

    public boolean cancelar(Viagem viagem) {
        viagem.setEstado(ViagemEstadoCancelada.getInstance());
        return true;
    }

    public boolean expirar(Viagem viagem) {
        viagem.setEstado(ViagemEstadoExpirada.getInstance());
        return true;
    }

    public boolean transferir(Viagem viagem) {
        viagem.setEstado(ViagemEstadoTransferida.getInstance());
        return true;
    }
}
