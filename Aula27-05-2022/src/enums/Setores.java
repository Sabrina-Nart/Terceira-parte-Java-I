
package enums;//Começa pela classe de cima

public enum Setores {
   GR("Gerência"), //é maíusculo
   RH("RH"),
   TI("Engenharia"),
   EN("PCP"),
   PC("Almoxarifado"),
   CO("Conservação");
   
   private String descricao; //Dizer o que é ao Java esse negócio do lado
   
   private Setores(String descricao){
      this.descricao = descricao;
   }
   
   public String toString(){
       return descricao;
   }
}
