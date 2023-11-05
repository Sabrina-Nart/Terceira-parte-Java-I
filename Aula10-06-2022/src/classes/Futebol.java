
package classes;

import abstratas.Atleta;
import enums.peDominante;

public class Futebol extends Atleta{

   private peDominante pe;
   private double valorPasseDolar;

/////////   
   
   public Futebol(){
      super();
      this.setPe(peDominante.D);
      this.setValorPasseDolar(1);
   }
    
   public Futebol(String nome, int idade, peDominante pe, double valorPasseDolar){
      super(nome, idade);
      this.setPe(pe);
      this.setValorPasseDolar(valorPasseDolar);
   }
   
////////////

    public void setPe(peDominante pe) {
        this.pe = pe;
    }

    public void setValorPasseDolar(double valorPasseDolar) {
        this.valorPasseDolar = valorPasseDolar < 1 ? 1 : valorPasseDolar;
    }

///////////

    public peDominante getPe() {
        return this.pe;
    }

    public double getValorPasseDolar() {
        return this.valorPasseDolar;
    }

////////    
    
}
