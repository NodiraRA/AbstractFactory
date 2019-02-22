/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.website;

import abstractfactory.ProjectManager;

/**
 *
 * @author nodira
 */
public class WebsitePM implements ProjectManager{

    @Override
    public void manageProject() {
        System.out.println("Website PM manages Website project...");
        
    }
}
