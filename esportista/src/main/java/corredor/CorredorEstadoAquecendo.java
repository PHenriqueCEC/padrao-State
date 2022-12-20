package corredor;

public class CorredorEstadoAquecendo implements CorredorEstado {

    private CorredorEstadoAquecendo() {};
    private static CorredorEstadoAquecendo instance = new CorredorEstadoAquecendo();
    public static CorredorEstadoAquecendo getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Atleta Aquecendo!";
    }
    public String descansando(Corredor corredor){
        return "Atleta Descansando!";
    }
    public String aquecendo(Corredor corredor){
        return "Treino não iniciado!";
    }

    public String correndo(Corredor corredor){
        return "Treino de corrida iniciado!";
    }
}
