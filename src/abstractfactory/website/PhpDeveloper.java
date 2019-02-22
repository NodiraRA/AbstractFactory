/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.website;

import abstractfactory.Developer;

/**
 *
 * @author nodira
 */
public class PhpDeveloper implements Developer{

    @Override
    public void writeCode() {
        System.out.println("Php developer writes php codes...");
        
    }
    
}
