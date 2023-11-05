
package enums;

public enum Titulacoes { //Meio que preparado para não ser entendido pelo usuário
    GR("Graduação"), //O que vai ser gravado no banco, não mostrado para o usuário - é sópara ser mostrado
    ES("Especialização"), 
    ME("Mestrado"),
    DO("Doutorado"),
    PD("Pós_Doutorado");
    
    private String descricao; //Dizer o que é 

    private Titulacoes(String descricao) { //Alt Insert
        this.descricao = descricao; //Todo construtor é visível,esse não, esse não é uma responsabilidade nossa, = é do Java
    }
    
   @Override //Tudo aquilo que é omitido, faz o toString - Aquilo toString que já existe morre e vale esse
   public String toString(){
       return descricao;
   }
   
}
