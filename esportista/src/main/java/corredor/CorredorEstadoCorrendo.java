package corredor;

public class CorredorEstadoCorrendo implements CorredorEstado {

    private CorredorEstadoCorrendo() {};
    private static CorredorEstadoCorrendo instance = new CorredorEstadoCorrendo();
    public static CorredorEstadoCorrendo getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Atleta Correndo!";
    }
    public String descansando(Corredor corredor){
        return "Atleta Descansando!";
    }
    public String aquecendo(Corredor corredor){
        return "Aquecimento iniciado!";
    }

    public String correndo(Corredor corredor){
        return "Treino não iniciado!";
    }
}
