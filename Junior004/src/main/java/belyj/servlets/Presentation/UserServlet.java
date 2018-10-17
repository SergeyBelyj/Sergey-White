package belyj.servlets.Presentation;

import belyj.servlets.Logic.ValidateService;
import belyj.servlets.Persistent.MemoryStore;
import belyj.servlets.User;
import jdk.nashorn.internal.ir.WhileNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;


public class UserServlet extends HttpServlet {


    private static final Logger log = LoggerFactory.getLogger(UserServlet.class);

    private MemoryStore memory = new MemoryStore();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter wr = new PrintWriter(resp.getOutputStream());
        for (User us : memory.findAll()) {
            wr.append("hi " + us);
            wr.flush();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        if (req.getParameter("action").equals("add")) {
            memory.add(new User(req.getParameter("name")));
        }
        doGet(req, resp);
    }
}
