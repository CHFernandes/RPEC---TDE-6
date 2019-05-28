public class Main {
    public static void main(String[]args){

        Hash tabela = new Hash(100);

        tabela.insere(5);

        tabela.insere(15);

        tabela.insere(105);
        System.out.println(tabela.busca(104));

    }
}
