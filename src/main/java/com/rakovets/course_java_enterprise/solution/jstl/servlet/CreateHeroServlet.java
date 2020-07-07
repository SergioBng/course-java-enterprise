package com.rakovets.course_java_enterprise.solution.jstl.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CreateHeroServlet", urlPatterns = {"/create-hero"})
public class CreateHeroServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = "/WEB-INF/jsp/create-hero.jsp";
        req.getRequestDispatcher(path).forward(req, resp);
    }
}
