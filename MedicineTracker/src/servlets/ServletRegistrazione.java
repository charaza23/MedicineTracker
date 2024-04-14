package servlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registrazione")
public ServletRegistrazione extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    // Utilizziamo una mappa per memorizzare gli utenti registrati
    private Map<String, Utente> utenti = new HashMap<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Verifica se l'utente esiste già
        if (utenti.containsKey(username)) {
            // Utente già registrato, reindirizza alla pagina di registrazione con un messaggio di errore
            response.sendRedirect("register.jsp?error=existing_user");
            return;
        }

        // Crea un nuovo utente con i dati forniti
        Utente utente = new Utente(username, password);
        
        // Aggiunge l'utente alla mappa degli utenti
        utenti.put(username, utente);

        // Reindirizza l'utente alla pagina di login
        response.sendRedirect("login.jsp");
    }
}

