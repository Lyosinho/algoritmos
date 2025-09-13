public class ListaDupla<T>{
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private String nomeLista;
    private int tamanho;

    public ListaDupla(String nomeLista){
        this.nomeLista = nomeLista;
        this.primeiroNo = primeiroNo;
        this.ultimoNo = ultimoNo;
        this.tamanho = tamanho;    
    }

    public void addInicio(T dado){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado);
        if(primeiroNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        }else{
            novoNo.setProximoNo(primeiroNo);
            primeiroNo.getAnteriorNo(novoNo);
            primeiroNo = novoNo;
        }
        atualizaIndice();
        tamanho++;
    }

    public void atualizaIndice(){
        int indice = 0;
        NoDuplo<T> atual = primeiroNo;
        while(atual != null){
            primeiroNo.setIndice(indice);
            atual = atual.getProximoNo();
            indice++;
        }
    }

    public void addFinal(T dado){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado);
        if(primeiroNo = null){
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
    public T imprimeLista(){
        No<T> aux = primeiroNo;
        while(aux != null){
            System.out.printf("%s", aux.toString);
            aux = aux.getProximoNo;
        }
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