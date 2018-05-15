package service;

import dao.GithuberDAO;
import dao.InMemory;
import model.Githuber;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

@Dependent
public class GithubersService implements Serializable{

    private GithuberDAO dao;

    @Inject
    public GithubersService(@InMemory GithuberDAO dao) {
        this.dao = dao;
    }


    public List<Githuber> getAllGithubers(){
        return this.dao.getGithubers();
    }

    public Githuber getGithuber(String login){
        List<Githuber> githubers = getAllGithubers();

        for (Githuber githuber : githubers) {
            if (login.equals(githuber.getLogin())) {
                return githuber;
            }
        }
        return null;
    }


    public void track(String login){
        //TODO

    }
}
