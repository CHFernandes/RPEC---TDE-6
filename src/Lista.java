public class Lista {
    private int posicao;
    private int chave;
    private Lista lista;

    public Lista(int posicao, int chave){
        this.posicao = posicao;
        this.chave = chave;
        this.lista = null;
    }

    public void Encadeia(Lista proximo){
        this.lista = proximo;
    }

    public Lista Proximo(){
        return this.lista;
    }

    public int Chave(){
        return this.chave;
    }
}
