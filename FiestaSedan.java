/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.padroesGOF.abstractFactory;

/**
 *
 * @author djalma
 */
public class FiestaSedan implements CarroSedan {

    @Override
    public void exibirInfoSedan() {
        System.out.println("Modelo: Fiesta Sedan\nFábrica: Ford\nCategoria:Sedan");
    }
}
