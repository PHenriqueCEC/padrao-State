package corredor;

public class CorredorEstadoDescansando implements CorredorEstado {

    private CorredorEstadoDescansando() {};
    private static CorredorEstadoDescansando instance = new CorredorEstadoDescansando();
    public static CorredorEstadoDescansando getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Atleta Descansando!";
    }
    public String descansando(Corredor corredor){
        return "Atleta em descanso!";
    }
    public String aquecendo(Corredor corredor){
        corredor.setEstado(CorredorEstadoAquecendo.getInstance());
        return "Aquecimento iniciado!";
    }

    public String correndo(Corredor corredor){
        corredor.setEstado(CorredorEstadoCorrendo.getInstance());
        return "Treino de corrida iniciado!";
    }
}
