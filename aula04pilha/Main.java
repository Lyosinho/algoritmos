public class Main{
    public static void main(String [] args){
        Pilha<String> pilha = new Pilha<String>("Letras");
        // Pilha<Integer> pilhaa = new Pilha<Integer>(50);

        // System.out.println(pilhaa.getIdade());
        // System.out.println(pilha.getNome());

        pilha.push("java");
        pilha.push("javascript");
        pilha.push("typescript");
        pilha.imprimePilha();
        pilha.pop();
        pilha.push("python");
        pilha.push("c#");
        pilha.imprimePilha();


    }
}