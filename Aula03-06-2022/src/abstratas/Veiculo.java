
package abstratas;

import enums.Combustivel;

abstract public class Veiculo {
    //atributos e métodos
    private String modelo;
    private int cilindrada;
    private Combustivel combustivel;
    //
    public Veiculo(){
        this.setModelo("nomodel");
        this.setCilindrada(49);
        this.setCombustivel(Combustivel.GA);
    }
    public Veiculo(String modelo,int cilindrada,Combustivel combustivel){
        this.setModelo(modelo);
        this.setCilindrada(cilindrada);
        this.setCombustivel(combustivel);
    }
    //alt+ins
    public void setModelo(String modelo) {
        this.modelo = modelo.trim().isEmpty()?"NOMODEL":modelo.toUpperCase();
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada<49 ? 49 : cilindrada;
    }
    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }
    //
    public String getModelo() {
        return this.modelo;
    }
    public int getCilindrada() {
        return this.cilindrada;
    }
    public Combustivel getCombustivel() {
        return this.combustivel;
    }
    //
    @Override
    public String toString(){
        return this.modelo;
    }
}
