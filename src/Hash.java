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
        Lista linha = new Lista(i, chave);
        if (vetor[i] == null){
            vetor[i] = linha;
        }else {
            Lista atual = vetor[i];

            while (atual.Proximo() != null){
                if(linha.Chave() <= atual.Chave()){

                }
            }
            vetor[i].Encadeia(linha);
        }
    }

}
