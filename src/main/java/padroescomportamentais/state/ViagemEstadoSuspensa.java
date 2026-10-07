package padroescomportamentais.state;

public class ViagemEstadoSuspensa extends ViagemEstado {

    private ViagemEstadoSuspensa() {};
    private static ViagemEstadoSuspensa instance = new ViagemEstadoSuspensa();
    public static ViagemEstadoSuspensa getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Suspensa";
    }

    public boolean reservar(Viagem viagem) {
        viagem.setEstado(ViagemEstadoReservada.getInstance());
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

    public boolean cancelar(Viagem viagem) {
        viagem.setEstado(ViagemEstadoCancelada.getInstance());
        return true;
    }
}
