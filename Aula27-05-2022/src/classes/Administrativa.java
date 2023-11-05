
package classes;

import abstratas.Funcionarios;
import enums.Setores;

public class Administrativa extends Funcionarios{
    private Setores setor;
    private double salario;
    
    //Um construtor sem e com parâmetros
    
    public Administrativa(){
      super();
      this.setSetor(Setores.CO);
      this.setSalario(0);
    }
    
    public Administrativa(String nome, String cpf, Setores setor, double salario){
       super(nome, cpf);
       this.setSetor(setor);
       this.setSalario(salario);
    
    }   
    
    public void setSetor(Setores setor) {
        this.setor = setor;
    }

    public void setSalario(double salario) {
        this.salario = salario < 0 ? 0 : salario;
    }

    public Setores getSetor() {
        return this.setor;
    }

    public double getSalario() {
        return this.salario;
    }
     
}
