package code_package;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//
//@WebServlet(name = "MultiplicationServlet", urlPatterns = "/multiply")
public class MultiplicationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public MultiplicationServlet() {
        super();
    }

    public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));

        int result = num1 * num2;

        System.out.println(result);

        PrintWriter out = resp.getWriter();
        out.println("<b>Result:</b> " + result);
    }
}
