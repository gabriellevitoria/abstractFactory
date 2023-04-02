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
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FabricaDeCarro fabrica = new FabricaFiat();
        CarroSedan sedan = fabrica.criarCarroSedan();
        CarroPopular popular = fabrica.criarCarroPopular();
        sedan.exibirInfoSedan();
        System.out.println();
        popular.exibirInfoPopular();
        System.out.println();

        fabrica = new FabricaFord();
        sedan = fabrica.criarCarroSedan();
        popular = fabrica.criarCarroPopular();
        sedan.exibirInfoSedan();
        System.out.println();
        popular.exibirInfoPopular();
    }

}
