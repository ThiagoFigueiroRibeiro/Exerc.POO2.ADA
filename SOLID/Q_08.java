//Instanciando tipos de criptografias
public class Solution{}

interface Criptografia{}

class LoginServico{
	Criptografia criptografia;
    public LoginServico(Criptografia criptografia) {
        this.criptografia = criptografia;
    }
}

class CriptografiaAssimetrica implements Criptografia{}
