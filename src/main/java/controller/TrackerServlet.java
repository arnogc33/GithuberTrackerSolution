package controller;

import dao.GithuberDAO;
import dao.InMemory;
import service.GithubersService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TrackerServlet", urlPatterns = {"/track"})
public class TrackerServlet extends HttpServlet {
    @Inject
    @InMemory
    private GithuberDAO dao;

    @Inject
    private GithubUtils ghu;

    @Inject
    private GithubersService gts;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String login = request.getParameter("login");
        dao.saveGithuber(ghu.parseGithuber(login));
        response.sendRedirect("/GithuberTracker/githubers");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/track.jsp").forward(request, response);
    }

}
