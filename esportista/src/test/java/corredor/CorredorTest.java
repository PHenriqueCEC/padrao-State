package corredor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CorredorTest {

    Corredor corredor;

    @BeforeEach
    public void setUp(){
        corredor = new Corredor();
    }

    @Test
    public void corredorForaDoDescansoCorredorDescansando(){
        corredor.setEstado(CorredorEstadoDescansando.getInstance());
        assertEquals("Atleta em descanso!", corredor.descansando());
    }

    @Test
    public void corredorIniciouAquecimentoCorredorDescansando() {
        corredor.setEstado(CorredorEstadoDescansando.getInstance());
        assertEquals("Aquecimento iniciado!", corredor.aquecendo());
    }

    @Test
    public void corredorIniciouTreinoDeCorridaCorredorDescansando(){
        corredor.setEstado(CorredorEstadoDescansando.getInstance());
        assertEquals("Treino de corrida iniciado!", corredor.correndo());
    }

    @Test
    public void corredorNoDescansoCorredorAquecendo(){
        corredor.setEstado(CorredorEstadoAquecendo.getInstance());
        assertEquals("Atleta Descansando!", corredor.descansando());
    }

    @Test
    public void corredorNaoIniciouTreinoDeAquecimentoCorredorAquecendo(){
        corredor.setEstado(CorredorEstadoAquecendo.getInstance());
        assertEquals("Treino não iniciado!", corredor.aquecendo());
    }

    @Test
    public void corredorIniciouTreinoDeCorridaCorredorAquecendo(){
        corredor.setEstado(CorredorEstadoAquecendo.getInstance());
        assertEquals("Treino de corrida iniciado!", corredor.correndo());
    }

    @Test
    public void corredorNoDescansoCorredorCorrendo(){
        corredor.setEstado(CorredorEstadoCorrendo.getInstance());
        assertEquals("Atleta Descansando!", corredor.descansando());
    }

    @Test
    public void corredorIniciouTreinoDeAquecimentoCorredorCorrendo(){
        corredor.setEstado(CorredorEstadoCorrendo.getInstance());
        assertEquals("Aquecimento iniciado!", corredor.aquecendo());
    }

    @Test
    public void corredorNãoIniciouTreinoDeCorridaCorredorCorrendo(){
        corredor.setEstado(CorredorEstadoCorrendo.getInstance());
        assertEquals("Treino não iniciado!", corredor.correndo());
    }
}
