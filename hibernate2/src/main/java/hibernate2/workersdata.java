package hibernate2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/workers")
public class workersdata extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        worker worker = new worker();
        worker.setName(name);
        worker.setEmail(email);
        worker.setPassword(password);

        workerduo.workersdata(worker);

        response.sendRedirect("success.jsp"); // Redirect to a success page
    }
}

