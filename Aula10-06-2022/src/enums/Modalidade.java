
package enums;

public enum Modalidade {
    
    R("100 metros Rasos"),
    B("110 metros com Barreira"),
    S("Salto a Distância"),
    T("Salto Triplos");
    
    private String descricao;

    private Modalidade(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }
    
}
