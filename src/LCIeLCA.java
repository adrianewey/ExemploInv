import java.util.ArrayList;

/**
 * Created by adria on 25/04/2017.
 */
public class LCIeLCA extends Investimento {

    public LCIeLCA(Double valor, int tempo){
        this.valor = valor;
        this.tempo = tempo;
    }


    @Override
    protected Double previsaoRetorno() {
        if(tipo.equalsIgnoreCase("lca")) simuladorLCA();
        else if(tipo.equalsIgnoreCase("lci")) simuladorLCI();
        return null;
    }

    private Double simuladorLCI(){
        return null;
    }

    private Double simuladorLCA(){
        return null;
    }

    public void setMensal(boolean mensal){
        this.mensal = mensal;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
}
