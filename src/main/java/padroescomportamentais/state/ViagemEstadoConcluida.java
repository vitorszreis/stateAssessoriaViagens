package padroescomportamentais.state;

public class ViagemEstadoConcluida extends ViagemEstado {

    private ViagemEstadoConcluida() {};
    private static ViagemEstadoConcluida instance = new ViagemEstadoConcluida();
    public static ViagemEstadoConcluida getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Concluída";
    }
}
