/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.website;

import abstractfactory.Developer;
import abstractfactory.ProjectManager;
import abstractfactory.ProjectTeamFactory;
import abstractfactory.Tester;

/**
 *
 * @author nodira
 */
public class WebsiteTeamFactory implements ProjectTeamFactory{

    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
