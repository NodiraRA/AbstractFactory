/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.website;

import abstractfactory.Tester;

/**
 *
 * @author nodira
 */
public class ManualTester implements Tester{

    @Override
    public void testCode() {
        System.out.println("manual tester tests website...");
    }
    
}
