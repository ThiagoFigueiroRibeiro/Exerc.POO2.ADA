//Opções de Login - SSO
public class Solution{}

class GoogleSso extends ProvedorSso{
    public boolean 
    autenticaUsuario(Credenciais credenciais){
        return true;
    };
}

class FacebookSso extends ProvedorSso{
    public boolean 
    autenticaUsuario(Credenciais credenciais){
        return false;
    };
}
