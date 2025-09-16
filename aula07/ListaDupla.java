public class ListaDupla<T>{
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private String nomeLista;
    private int tamanho;

    public ListaDupla(String nomeLista){
        this.nomeLista = nomeLista;
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanho = 0;
    }

    public void addInicio(T dado){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado, 0);
        if(primeiroNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        }else{
            novoNo.setProximoNo(primeiroNo);
            primeiroNo.setAnteriorNo(novoNo);
            primeiroNo = novoNo;
        }
        atualizaIndice();
        tamanho++;
    }

    public void atualizaIndice(){
        int indice = 0;
        NoDuplo<T> atual = primeiroNo;
        while(atual != null){
            atual.setIndice(indice);
            atual = atual.getProximoNo();
            indice++;
        }
    }

    public void addFinal(T dado){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado, tamanho);
        if(primeiroNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        }else{
            novoNo.setAnteriorNo(ultimoNo);
            ultimoNo.setProximoNo(novoNo);
            ultimoNo = novoNo;
        }
        ultimoNo.setIndice(tamanho);
        tamanho++;
    }
    public void imprimeLista(){
        NoDuplo<T> aux = primeiroNo;
        while(aux != null){
            System.out.println(aux.getDado());
            aux = aux.getProximoNo();
        }
    }
    public void addIndice(T dado, int indice) {
        if (indice <= 0) {
            addInicio(dado);
            return;
        } else if (indice >= tamanho) {
            addFinal(dado);
            return;
        }
        NoDuplo<T> atual = primeiroNo;
        for (int i = 0; i < indice - 1; i++) {
            atual = atual.getProximoNo();
        }
        NoDuplo<T> novoNo = new NoDuplo<>(dado, indice);
        novoNo.setProximoNo(atual.getProximoNo());
        novoNo.setAnteriorNo(atual);
        if (atual.getProximoNo() != null) {
            atual.getProximoNo().setAnteriorNo(novoNo);
        }
        atual.setProximoNo(novoNo);
        atualizaIndice();
        tamanho++;
    }

    public T removeIndice(int indice) {
        if (indice < 0 || indice >= tamanho || primeiroNo == null) {
            return null;
        }
        if (indice == 0) {
            T dado = primeiroNo.getDado();
            removeInicio();
            return dado;
        }
        NoDuplo<T> atual = primeiroNo;
        for (int i = 0; i < indice; i++) {
            atual = atual.getProximoNo();
        }
        T dado = atual.getDado();
        if (atual.getAnteriorNo() != null) {
            atual.getAnteriorNo().setProximoNo(atual.getProximoNo());
        }
        if (atual.getProximoNo() != null) {
            atual.getProximoNo().setAnteriorNo(atual.getAnteriorNo());
        }
        if (atual == ultimoNo) {
            ultimoNo = atual.getAnteriorNo();
        }
        atualizaIndice();
        tamanho--;
        return dado;
    }

    public void removeInicio(){
        if(primeiroNo == null){
            System.out.println("Lista vazia");
        } else {
            System.out.println();
            // T temp;
            primeiroNo = primeiroNo.getProximoNo();
            if(primeiroNo != null){
                primeiroNo.setProximoNo(null);
            } else{
                ultimoNo = null;
            }
        }
        atualizaIndice();
        tamanho--;
        
    }

    public void removeFinal(){
        if (ultimoNo == null ){
            System.out.println("vazialista");
        }else{
            ultimoNo = ultimoNo.getAnteriorNo();
            if(ultimoNo != null){
                ultimoNo.setProximoNo(null);
            } else{
                primeiroNo = null;
            }
            tamanho--;
        }
    }
}