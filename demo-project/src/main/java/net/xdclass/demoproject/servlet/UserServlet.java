package net.xdclass.demoproject.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/* @使用servlet3.0开发原生的接口
 * @ClassName UserServlet
 * @Description
 * @Author cy
 * @Date 2020-07-13 14:46
 * Version 1.0
 **/
@WebServlet(name="userServlet",urlPatterns = "/api/v1/test/customs")
public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.write("this is my custom servlet");
        writer.flush();
        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      this.doGet(req,resp);
    }
}
