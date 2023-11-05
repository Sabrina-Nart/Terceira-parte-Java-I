
package enums;

public enum Combustivel {
    GA("Gasolina"),
    EL("Etanol"),
    FX("Flex"),
    GV("GNV"),
    DL("Diesel"),
    EO("Elétrico");
    //
    private String descricao;
    //alt+ins
    private Combustivel(String descricao) {
        this.descricao = descricao;
    }
    //
    @Override
    public String toString(){
        return descricao;
    }
    
}
