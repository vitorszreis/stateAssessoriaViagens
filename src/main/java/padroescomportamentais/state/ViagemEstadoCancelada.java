package padroescomportamentais.state;

public class ViagemEstadoCancelada extends ViagemEstado {

    private ViagemEstadoCancelada() {};
    private static ViagemEstadoCancelada instance = new ViagemEstadoCancelada();
    public static ViagemEstadoCancelada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Cancelada";
    }
}
