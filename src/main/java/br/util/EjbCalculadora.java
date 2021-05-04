/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.util;

import javax.ejb.Stateless;

/**
 *
 * @author Nova
 */
@Stateless
public class EjbCalculadora {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public int dobrar(int valor){
        return valor*2;
    }
}
