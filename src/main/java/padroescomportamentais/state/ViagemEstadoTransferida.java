package padroescomportamentais.state;

public class ViagemEstadoTransferida extends ViagemEstado {

    private ViagemEstadoTransferida() {};
    private static ViagemEstadoTransferida instance = new ViagemEstadoTransferida();
    public static ViagemEstadoTransferida getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Transferida";
    }
}
