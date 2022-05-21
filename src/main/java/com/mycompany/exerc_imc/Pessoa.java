
package com.mycompany.exerc_imc;


public class Pessoa {

    private double altura, peso;
    
public Pessoa(double altura, double peso){
    this.altura = altura;
    this.peso = peso;
  }   
    
public double getImc() {
    return peso / Math.pow(altura,2);
    
   }
}