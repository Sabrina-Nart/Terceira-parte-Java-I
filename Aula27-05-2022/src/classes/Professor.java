
package classes;

import abstratas.Funcionarios;

import enums.Titulacoes;
        
public class Professor extends Funcionarios{ //Crtl espaço para não ficar dando erro
   //Atributos especializados - pertencem apenas a professor
    private double numeroHoras;
    private double valorHoras;
    private Titulacoes titulacao; //Titulações passa a ser um tipo
    
    //Não precissa fazer um toString novamente, porque herda, então precisa só de um
    //Quando quer um toString diferente, faz outro, caso fosse o nome e outra coisa,tem que fazer
    
    //O Construtor é o único que não é herdado
    public Professor(){
        //É super porque não está aqui, está na SuperClass - Tudo que é This é dessa classe - Super é de fora
        super(); //Chama o construtor da classe de cima - construtor sem parâmetro,porque o Professor tambémnão tem
        this.setNumeroHoras(0);
        this.setValorHoras(0);
        this.setTitulacao(Titulacoes.GR);//Enum - só aceita um Enum - é obrigado a colocar algo dessa lista
    }
    
    public Professor(String nome, String cpf, double numeroHoras, double valorHora, Titulacoes titulacao){
    
     super(nome, cpf);
     this.setNumeroHoras(numeroHoras);
     this.setValorHoras(valorHora);
     this.setTitulacao(titulacao);
    }
    
    //Alt Insert
    public void setNumeroHoras(double numeroHoras) {
        this.numeroHoras = numeroHoras < 0 ? 0 : numeroHoras; //Não tem como trabalhar menos que 0
    }

    public void setValorHoras(double valorHoras) {
        this.valorHoras = valorHoras < 0 ? 0 : valorHoras;
    }

    public void setTitulacao(Titulacoes titulacao) { //Não precissa validar, porque a lista é fixa e constante - não tem como o usuário digitar algo fora disso
        this.titulacao = titulacao;
    }
  ////////////////
    public double getNumeroHoras() {
        return this.numeroHoras;
    }

    public double getValorHoras() {
        return this.valorHoras;
    }

    public Titulacoes getTitulacao() {
        return this.titulacao;
    }
    
    
              
}
