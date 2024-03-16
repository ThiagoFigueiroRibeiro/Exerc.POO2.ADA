//Postando em Redes Sociais
public class Solution{}

class InstagramPublicador implements StoriePublicador {
  @Override
  public void publicar(Post post){
  /* publica post no Instagram */
}

  public void publicaStorie(Storie storie){}
}

interface StoriePublicador extends Publicador{
  public void publicaStorie(Storie storie);
}
