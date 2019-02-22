/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.banking;

import abstractfactory.Developer;
import abstractfactory.ProjectManager;
import abstractfactory.ProjectTeamFactory;
import abstractfactory.Tester;

/**
 *
 * @author nodira
 */
public class BankingTeamFactory implements ProjectTeamFactory{

    @Override
    public Developer getDeveloper() {
     
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
       return new BankingPM(); 
    }
    
}
