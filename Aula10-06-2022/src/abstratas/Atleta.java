
package abstratas; //Não permite a criação deobjetos

//Aqui não tem interação com o usuário - Essa parte fica com o Front. Formulário. Mensagem, controle, etc

abstract public class Atleta {
    
    private String nome;
    private int idade;

/////////////    
    
    //Construtor = dar valor inicial aos objetos    
    public Atleta(){
        this.setNome("NONAME");
        this.setIdade(14);
    }

    public Atleta(String nome, int idade){
       this.setNome(nome);
       this.setIdade(idade);
    }

//////////////    
    
    public void setNome(String nome) { 
        this.nome = nome.trim().isEmpty() ? "NONAME" : nome.toUpperCase(); //Teste para saber se digitou algo descente - se digitou fica em maísculo
    }

    public void setIdade(int idade) { //150 é um inteiro válido, não uma idade válida
        this.idade = (idade < 14) || (idade > 150) ? 14 : idade;
    }

///////////////    
    
    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }
    
//////////////     

    @Override //Valor quer vai identificar
    public String toString() {
        return this.nome;
    }

///////////////    
}
