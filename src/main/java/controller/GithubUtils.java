package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Githuber;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

@Dependent
public class GithubUtils {

    @Inject
    private ObjectMapper om;

    public Githuber parseGithuber(String login){

        try(InputStream is = new URL("https://api.github.com/users/"+login).openStream()){
            Githuber result = om.readValue(is, Githuber.class);
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;

    }

}
