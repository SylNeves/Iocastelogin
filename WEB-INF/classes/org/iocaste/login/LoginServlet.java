package org.iocaste.login;



import org.iocaste.protocol.ClientServlet;
import org.iocaste.protocol.Iocaste;


public class LoginServlet extends ClientServlet {
    private static final long serialVersionUID = 1946889529842250472L;
    
    @Override
    protected void init(Iocaste iocaste) throws Exception {
     
    	String usuario = getValue("usuario").toUpperCase();
        String senha = getValue("senha");
                 
        
    	if (iocaste.login(usuario, senha)== true)
    	{
    		redirect("/iocaste-session/pagina1.html");
    	}
    	else
    	{
    		redirect("erro.html");
    	}
    }
    
}
