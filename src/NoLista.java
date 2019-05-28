public class NoLista {
    private int chave;
    private NoLista proximo;

    public NoLista(int chave){
        this.chave = chave;
        this.proximo = null;
    }

    public void alteraproximo(NoLista proximo){
            this.proximo = proximo;
        }
    public NoLista getProximo (){
            return this.proximo;
        }
    public int getChave(){
            return this.chave;
        }

}
