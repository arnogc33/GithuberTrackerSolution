package controller;

import model.Githuber;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "GithubersServlet", urlPatterns = {"/githubers"})
public class GithubersServlet extends HttpServlet {
    private static final List<Githuber> githubersList = new ArrayList<>(5);

    static {
        githubersList.add(new Githuber(1L, "christellsahli", "christellsahli@gmail.com", "christellsahli", "https://avatars3.githubusercontent.com/u/38050036?s=88&v=4"));
        githubersList.add(new Githuber(2L, "Gregbee", "backtopa@gmail.com", "Gregbee", "https://avatars1.githubusercontent.com/u/14792727?s=88&v=4"));
        githubersList.add(new Githuber(3L, "Julien Bourbonnais", "jbourbo@gmail.com", "jbourbo", "https://avatars0.githubusercontent.com/u/5736082?s=88&v=4"));
        githubersList.add(new Githuber(4L, "Lucilediague", "diaguelucile@gmail.com", "Lucilediague", "https://avatars3.githubusercontent.com/u/24568268?s=88&v=4"));
        githubersList.add(new Githuber(5L, "arnogc33", "guillou.arnaud@gmail.com", "arnogc33", "https://avatars2.githubusercontent.com/u/35994942?s=88&v=4"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("githubersList", githubersList);
        request.getRequestDispatcher("/githubers.jsp").forward(request, response);
    }

}