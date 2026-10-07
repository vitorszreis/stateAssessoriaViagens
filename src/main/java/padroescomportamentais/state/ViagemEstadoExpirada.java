package padroescomportamentais.state;

public class ViagemEstadoExpirada extends ViagemEstado {

    private ViagemEstadoExpirada() {};
    private static ViagemEstadoExpirada instance = new ViagemEstadoExpirada();
    public static ViagemEstadoExpirada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Expirada";
    }
}
