
package enums;

public enum Transmissao {
    CE("Corrente"),
    CA("Correia"),
    CN("Cardan");
    //
    private String descricao;
    //alt+ins
    private Transmissao(String descricao) {
        this.descricao = descricao;
    }
    @Override
    public String toString(){
        return descricao;
    }
}
