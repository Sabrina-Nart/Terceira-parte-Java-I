
package enums;

public enum peDominante {
    D("Direito"),
    E("Esquerdo"),
    A("Ambidestro");
    
    private String descricao;
    
    //Alt Insert - pois é Privado
    //Construtor
    private peDominante(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public String toString(){
        return this.descricao;
    }
    
}
