public class MinhaClasse {
    public static void main(String[] args) {
        System.out.print("Olá pessoal, sejam bem-vindos");
        //String meuNome = "Paulo";
        //tipo, nome e valor correspondente

        String  primeiroNome = "Paulo";
        String  segundoNome = "Martins";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        
        System.out.println(nomeCompleto);
    }

//DECLARANDO MÉTODOS        
//TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}

//Todo arquivo .java deve começar com a letra MAIÚSCULA
//Toda variável deve ser escrita com aletra minúscula. Obedecer a regra camelCase


