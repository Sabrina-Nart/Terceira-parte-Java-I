
package abstratas;

import java.util.LinkedList;
import classes.Atletismo;
import classes.Futebol;

abstract public class Dados {
    
    private static double cotacaoDolar; //Static = presente em qualquer lugar, para qualquer jogador
    
    private static LinkedList<Futebol>listaFutebol = new LinkedList<>();
    private static LinkedList<Atletismo>listaAtletismo = new LinkedList<>();
    
    //Set e Get, porque tem Atributos
    //Não tem construtor, porque só mantem statico

/////////////////    
    
    public static void setCotacaoDolar(double cotacaoDolar) { //Valor Atribuido - LinkedList não tem, porque é uma lista que vai ficar permanente para todos
        Dados.cotacaoDolar = cotacaoDolar < 0.1 ? 0.1 : cotacaoDolar;
    } //O usuário digita o valor da cotação
    
//////////////////

    public static double getCotacaoDolar() {
        return cotacaoDolar; //Não é this, porque é Static = não depende de uma instância / objeto
    }

    public static LinkedList<Futebol> getListaFutebol() {
        return listaFutebol;
    }

    public static LinkedList<Atletismo> getListaAtletismo() {
        return listaAtletismo;
    }

//////////////////    
    
}
