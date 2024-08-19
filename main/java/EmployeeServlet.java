import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;


@WebServlet(urlPatterns = "/employeeList")
public class EmployeeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Doe", "HR"));
        employees.add(new Employee("Jane Smith", "Finance"));
        employees.add(new Employee("Mike Johnson", "IT"));

        request.setAttribute("employeeList", employees);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
