/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import abstractfactory.banking.BankingTeamFactory;

/**
 *
 * @author nodira
 */
public class SuperBankSystem {
    public static void main(String[] args){
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();
        
        System.out.println("Creating banking system...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    } 
}
