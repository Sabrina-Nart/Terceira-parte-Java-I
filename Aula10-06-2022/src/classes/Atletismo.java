
package classes;

import abstratas.Atleta;
import enums.Modalidade;

public class Atletismo extends Atleta{
    private Modalidade modalidade;
    
/////////
    
    public Atletismo(){
        super(); //Super Class
        this.setModalidade(modalidade.B); //This - própria classe
    }
    
    public Atletismo(String nome, int idade, Modalidade modalidade){
        super(nome, idade);
        this.setModalidade(modalidade);
    }
    
///////////

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    public Modalidade getModalidade() {
        return this.modalidade;
    }
    
//////////    
    
}
