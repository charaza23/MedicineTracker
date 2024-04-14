package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Ottieni l'utente dalla mappa degli utenti
        User user = UserDatabase.getInstance().getUser(username);

        // Verifica se l'utente esiste e se la password è corretta
        if (user != null && user.getPassword().equals(password)) {
            // Login corretto, reindirizza alla pagina home
            response.sendRedirect("home.jsp");
        } else {
            // Credenziali non valide, reindirizza alla pagina di login con un messaggio di errore
            response.sendRedirect("login.jsp?error=invalid_credentials");
        }
    }
}
