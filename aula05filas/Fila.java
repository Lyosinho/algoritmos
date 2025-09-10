public class Fila<T>{
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private String nomeFila;

    public Fila(){
        this("");
    }

    public Fila(String nomeFila){
        this.nomeFila = nomeFila;
        this.primeiroNo = primeiroNo;
        this.ultimoNo = ultimoNo;
    }

    public void enfileirar(T dado){
        No<T> novoNo = new No<T>(dado);
        if(ultimoNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        }else{
            ultimoNo.setNextNo(novoNo);
            ultimoNo = novoNo;
        }
    }

    public T desenfileirar(){
        if(primeiroNo == null){
            System.out.println("fila vazia");
            return null;
        }else{
            T tempDado = primeiroNo.getDado();
            primeiroNo = primeiroNo.getNextNo();
            if(primeiroNo == null){
                ultimoNo = null;
            }
            return tempDado;
        }
    }

    public void imprimeFila(){
        if(primeiroNo == null){
            System.out.println("fila vazia");
        }else{
            No<T> aux = primeiroNo;
            while (aux != null){
                System.out.printf("|%s| ", aux.getDado());
                aux = aux.getNextNo();
            }
            System.out.println();
        }
    }
 }
