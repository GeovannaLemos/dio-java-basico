package classe;

public class MinhaClasseVariaveisMetodos {
public static void main(String[] args) {
    String primeiroNome = "Geovanna";
    String segundoNome = "Lemos";

    String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);

    System.out.println(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome,String segundoNome){
    return "Nome:" + primeiroNome.concat("").concat(segundoNome);
}
    
}
