public class Hash {

    private int tamanho;
    private Lista[] vetor;

    public Hash(int tamanho){
        this.tamanho = tamanho;
        this.vetor = new Lista[tamanho];
    }

    int hashing(int chave){
        int h = (chave % tamanho);
        return h;
    }

    void insere(int chave){
        int i = hashing(chave);
        if (vetor[i] == null){
            vetor[i] = new Lista();
        }
        vetor[i].insere_ordenado(chave);

    }

    boolean busca(int chave){
        int i = hashing(chave);
        Lista busca = vetor[i];

        if (vetor[i] == null){
            return false;
        }else if (busca.acha_no(chave).getChave() != -1){
            return true;
        }else {
            return false;
        }
    }
}
