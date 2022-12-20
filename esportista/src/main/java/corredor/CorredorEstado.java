package corredor;

public interface CorredorEstado {

    String getEstado();

    String descansando(Corredor corredor);

    String aquecendo(Corredor corredor);

    String correndo(Corredor corredor);


}