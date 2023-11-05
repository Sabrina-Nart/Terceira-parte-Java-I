
package classes;

import abstratas.Veiculo;
import enums.Combustivel;
import enums.Transmissao;

public class Moto extends Veiculo{
    private Transmissao transmissao;
    //
    public Moto(){
        super();
        this.setTransmissao(Transmissao.CE);
    }
    public Moto(String modelo,int cilindrada,
    Combustivel combustivel,Transmissao transmissao){
        super(modelo, cilindrada, combustivel);
        this.setTransmissao(transmissao);
    }
    public void setTransmissao(Transmissao transmissao) {
        this.transmissao = transmissao;
    }
    public Transmissao getTransmissao() {
        return this.transmissao;
    }
    //
    @Override
    public String toString(){
        return super.getModelo()+"->"+this.getTransmissao();
    }    
}
