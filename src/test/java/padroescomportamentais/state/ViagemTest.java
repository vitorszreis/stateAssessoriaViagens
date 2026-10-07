package padroescomportamentais.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ViagemTest {

    Viagem viagem;

    @BeforeEach
    public void setUp() {
        viagem = new Viagem();
    }

    @Test
    public void deveIniciarViagemReservada() {
        assertEquals(ViagemEstadoReservada.getInstance(), viagem.getEstado());
        assertEquals("Reservada", viagem.getNomeEstado());
    }

    // Viagem reservada

    @Test
    public void naoDeveReservarViagemReservada() {
        viagem.setEstado(ViagemEstadoReservada.getInstance());
        assertFalse(viagem.reservar());
    }

    @Test
    public void deveConcluirViagemReservada() {
        viagem.setEstado(ViagemEstadoReservada.getInstance());
        assertTrue(viagem.concluir());
        assertEquals(ViagemEstadoConcluida.getInstance(), viagem.getEstado());
    }

    @Test
    public void deveSuspenderViagemReservada() {
        viagem.setEstado(ViagemEstadoReservada.getInstance());
        assertTrue(viagem.suspender());
        assertEquals(ViagemEstadoSuspensa.getInstance(), viagem.getEstado());
    }

    @Test
    public void deveCancelarViagemReservada() {
        viagem.setEstado(ViagemEstadoReservada.getInstance());
        assertTrue(viagem.cancelar());
        assertEquals(ViagemEstadoCancelada.getInstance(), viagem.getEstado());
    }

    @Test
    public void deveExpirarViagemReservada() {
        viagem.setEstado(ViagemEstadoReservada.getInstance());
        assertTrue(viagem.expirar());
        assertEquals(ViagemEstadoExpirada.getInstance(), viagem.getEstado());
    }

    @Test
    public void deveTransferirViagemReservada() {
        viagem.setEstado(ViagemEstadoReservada.getInstance());
        assertTrue(viagem.transferir());
        assertEquals(ViagemEstadoTransferida.getInstance(), viagem.getEstado());
    }

    // Viagem suspensa

    @Test
    public void deveReservarViagemSuspensa() {
        viagem.setEstado(ViagemEstadoSuspensa.getInstance());
        assertTrue(viagem.reservar());
        assertEquals(ViagemEstadoReservada.getInstance(), viagem.getEstado());
    }

    @Test
    public void naoDeveConcluirViagemSuspensa() {
        viagem.setEstado(ViagemEstadoSuspensa.getInstance());
        assertFalse(viagem.concluir());
    }

    @Test
    public void naoDeveSuspenderViagemSuspensa() {
        viagem.setEstado(ViagemEstadoSuspensa.getInstance());
        assertFalse(viagem.suspender());
    }

    @Test
    public void deveCancelarViagemSuspensa() {
        viagem.setEstado(ViagemEstadoSuspensa.getInstance());
        assertTrue(viagem.cancelar());
        assertEquals(ViagemEstadoCancelada.getInstance(), viagem.getEstado());
    }

    @Test
    public void deveExpirarViagemSuspensa() {
        viagem.setEstado(ViagemEstadoSuspensa.getInstance());
        assertTrue(viagem.expirar());
        assertEquals(ViagemEstadoExpirada.getInstance(), viagem.getEstado());
    }

    @Test
    public void deveTransferirViagemSuspensa() {
        viagem.setEstado(ViagemEstadoSuspensa.getInstance());
        assertTrue(viagem.transferir());
        assertEquals(ViagemEstadoTransferida.getInstance(), viagem.getEstado());
    }

    // Viagem concluída

    @Test
    public void naoDeveReservarViagemConcluida() {
        viagem.setEstado(ViagemEstadoConcluida.getInstance());
        assertFalse(viagem.reservar());
    }

    @Test
    public void naoDeveConcluirViagemConcluida() {
        viagem.setEstado(ViagemEstadoConcluida.getInstance());
        assertFalse(viagem.concluir());
    }

    @Test
    public void naoDeveSuspenderViagemConcluida() {
        viagem.setEstado(ViagemEstadoConcluida.getInstance());
        assertFalse(viagem.suspender());
    }

    @Test
    public void naoDeveCancelarViagemConcluida() {
        viagem.setEstado(ViagemEstadoConcluida.getInstance());
        assertFalse(viagem.cancelar());
    }

    @Test
    public void naoDeveExpirarViagemConcluida() {
        viagem.setEstado(ViagemEstadoConcluida.getInstance());
        assertFalse(viagem.expirar());
    }

    @Test
    public void naoDeveTransferirViagemConcluida() {
        viagem.setEstado(ViagemEstadoConcluida.getInstance());
        assertFalse(viagem.transferir());
    }

    // Viagem cancelada

    @Test
    public void naoDeveReservarViagemCancelada() {
        viagem.setEstado(ViagemEstadoCancelada.getInstance());
        assertFalse(viagem.reservar());
    }

    @Test
    public void naoDeveConcluirViagemCancelada() {
        viagem.setEstado(ViagemEstadoCancelada.getInstance());
        assertFalse(viagem.concluir());
    }

    @Test
    public void naoDeveSuspenderViagemCancelada() {
        viagem.setEstado(ViagemEstadoCancelada.getInstance());
        assertFalse(viagem.suspender());
    }

    @Test
    public void naoDeveCancelarViagemCancelada() {
        viagem.setEstado(ViagemEstadoCancelada.getInstance());
        assertFalse(viagem.cancelar());
    }

    @Test
    public void naoDeveExpirarViagemCancelada() {
        viagem.setEstado(ViagemEstadoCancelada.getInstance());
        assertFalse(viagem.expirar());
    }

    @Test
    public void naoDeveTransferirViagemCancelada() {
        viagem.setEstado(ViagemEstadoCancelada.getInstance());
        assertFalse(viagem.transferir());
    }

    // Viagem expirada

    @Test
    public void naoDeveReservarViagemExpirada() {
        viagem.setEstado(ViagemEstadoExpirada.getInstance());
        assertFalse(viagem.reservar());
    }

    @Test
    public void naoDeveConcluirViagemExpirada() {
        viagem.setEstado(ViagemEstadoExpirada.getInstance());
        assertFalse(viagem.concluir());
    }

    @Test
    public void naoDeveSuspenderViagemExpirada() {
        viagem.setEstado(ViagemEstadoExpirada.getInstance());
        assertFalse(viagem.suspender());
    }

    @Test
    public void naoDeveCancelarViagemExpirada() {
        viagem.setEstado(ViagemEstadoExpirada.getInstance());
        assertFalse(viagem.cancelar());
    }

    @Test
    public void naoDeveExpirarViagemExpirada() {
        viagem.setEstado(ViagemEstadoExpirada.getInstance());
        assertFalse(viagem.expirar());
    }

    @Test
    public void naoDeveTransferirViagemExpirada() {
        viagem.setEstado(ViagemEstadoExpirada.getInstance());
        assertFalse(viagem.transferir());
    }

    // Viagem transferida

    @Test
    public void naoDeveReservarViagemTransferida() {
        viagem.setEstado(ViagemEstadoTransferida.getInstance());
        assertFalse(viagem.reservar());
    }

    @Test
    public void naoDeveConcluirViagemTransferida() {
        viagem.setEstado(ViagemEstadoTransferida.getInstance());
        assertFalse(viagem.concluir());
    }

    @Test
    public void naoDeveSuspenderViagemTransferida() {
        viagem.setEstado(ViagemEstadoTransferida.getInstance());
        assertFalse(viagem.suspender());
    }

    @Test
    public void naoDeveCancelarViagemTransferida() {
        viagem.setEstado(ViagemEstadoTransferida.getInstance());
        assertFalse(viagem.cancelar());
    }

    @Test
    public void naoDeveExpirarViagemTransferida() {
        viagem.setEstado(ViagemEstadoTransferida.getInstance());
        assertFalse(viagem.expirar());
    }

    @Test
    public void naoDeveTransferirViagemTransferida() {
        viagem.setEstado(ViagemEstadoTransferida.getInstance());
        assertFalse(viagem.transferir());
    }
}
