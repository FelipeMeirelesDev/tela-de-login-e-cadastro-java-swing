import java.util.ArrayList;

public class BancoUsuario {
    
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    
    public static void adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    
    public static boolean validarLogin(String email, String senha){
        
        for (Usuario u : usuarios) {
            if (u.getEmail().equals(email) && u.getSenha().equals(senha)){
                return true;
            }
        }
        
        return false;
    }
    
    public static String validarNome(String email, String senha){
        
        for (Usuario u : usuarios) {
            if (u.getEmail().equals(email) && u.getSenha().equals(senha)){
                return u.getNome();
            }
        }
        
        return "Sem nome";
    }
}
