package corredor;

public class Corredor {
    private String nomeCorredor;
    private CorredorEstado estado;

    public Corredor(){
        this.estado = CorredorEstadoDescansando.getInstance();
    }
    public void setEstado(CorredorEstado estado){
        this.estado = estado;
    }
    public String descansando(){
        return estado.descansando(this);
    }
    public String aquecendo(){
        return estado.aquecendo(this);
    }

    public String correndo(){
        return estado.correndo(this);
    }
    public String getNomeEstado(){
        return estado.getEstado();
    }
    public String getNomeCorredor(){
        return nomeCorredor;
    }
    public void setNomeCorredor(String nomeCorredor){
        this.nomeCorredor = nomeCorredor;
    }
    public CorredorEstado getEstado(){
        return estado;
    }
}