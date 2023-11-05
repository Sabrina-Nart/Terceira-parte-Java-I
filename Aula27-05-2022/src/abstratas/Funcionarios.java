
package abstratas; //Toda classe base, será uma classe abstrada, para impedir que alguém crie um objeto chamado funcionarios
                   //A herança só existe em uma direção - para baixo
                    //Serm cor = não vai poder ter objetos criados

abstract public class Funcionarios {
    //Atributos
    private String nome;
    private String cpf;
    
    //Métodos
    //Construtores
    public Funcionarios(){
       this.setNome("noname"); //Atribuir um nome, mas não temum nome  
       this.setCpf("000.000.000-00");
    }
    public Funcionarios(String nome, String cpf){ //Aqui já tem um valor
        this.setNome(nome);
        this.setCpf(cpf); 
    }
    
    //set-atribuição
    public void setNome(String nome){
        this.nome=nome.trim().isEmpty()?"NONAME":nome.toUpperCase(); //Nome, não quer que fique em branco, então caso fique, atribui um valor
    }
    public void setCpf(String cpf){
        this.cpf=cpf.trim().isEmpty()?"000.000.000-00":cpf;
    }
    
    //get-retorno
    public String getNome(){
        return this.nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    
    //toString
    @Override
    public String toString(){
        return this.nome;
    }
            
}
