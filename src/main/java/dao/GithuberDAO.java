package dao;

import model.Githuber;
import java.util.List;

public interface GithuberDAO {

    List<Githuber> getGithubers();

    void saveGithuber(Githuber githuber);

}