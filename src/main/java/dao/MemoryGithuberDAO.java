package dao;

import controller.GithubUtils;
import model.Githuber;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
@InMemory
public class MemoryGithuberDAO implements GithuberDAO {

    private HashMap<String, Githuber> githubers = new HashMap<>();

    @Inject
    GithubUtils gtu;

    @Override
    public List<Githuber> getGithubers() {
        return githubers.values().stream().collect(Collectors.toList());
    }

    @Override
    public void saveGithuber(Githuber githuber) {
        githubers.put(githuber.getLogin(), githuber);
    }

    @PostConstruct
    private void addGithuber(){
        saveGithuber(gtu.parseGithuber("christellsahli"));
        saveGithuber(gtu.parseGithuber("Gregbee"));
        saveGithuber(gtu.parseGithuber("jbourbo"));
        saveGithuber(gtu.parseGithuber("Lucilediague"));
        saveGithuber(gtu.parseGithuber("arnogc33"));
        saveGithuber(gtu.parseGithuber("RomInno"));
    }

}
