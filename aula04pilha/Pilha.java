public class Pilha<T>{
    private No<T> topo;
    private String nome;
    private int idade;

    public Pilha(){
        this("",0);
    }

    public Pilha(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Pilha(String nome){
        this.nome = nome;
    }

    public Pilha(int idade){
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void push(T Dado){
        No<T> novoNo = new No<T>(Dado);

        if(topo == null){
            topo = novoNo;
        }else{
            novoNo.setNextNo(topo);
            topo = novoNo;
        }
    }

        public void imprimePilha(){
            No<T> aux = topo;
            while(aux != null){
                System.out.println(aux.getDado());
                aux = aux.getNextNo();
        }
    }

        public T pop(){
        if(topo == null){
            return null;
        }
        T dadoRemovido = topo.getDado();
        topo = topo.getNextNo();
        System.out.println("dado removido: " + dadoRemovido);
        return dadoRemovido;
    }

    @Override
    public String toString() {
        return "Pilha{nome='" + nome + "', idade=" + idade + "}";
    }
}