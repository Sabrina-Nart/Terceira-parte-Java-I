
package classes;

import abstratas.Veiculo;
import enums.Combustivel;

public class Carro extends Veiculo{
    private int portas;
    //
    public Carro(){
        super();
        this.setPortas(3);
    }
    public Carro(String modelo,int cilindrada,Combustivel combustivel,int portas){
        super(modelo, cilindrada, combustivel);
        this.setPortas(portas);
    }
    //
    public void setPortas(int portas) {
        this.portas = (portas<3)&&(portas>5) ? 3 : portas;
    }
    //
    public int getPortas() {
        return this.portas;
    }
    
    
}
