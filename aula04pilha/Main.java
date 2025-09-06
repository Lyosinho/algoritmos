public class Main{
    public static void main(String [] args){
        Pilha<String> pilha = new Pilha<String>("Letras");
        // Pilha<Integer> pilhaa = new Pilha<Integer>(50);

        // System.out.println(pilhaa.getIdade());
        System.out.println(pilha.getNome());

        pilha.push("A");
        pilha.push("B");
        pilha.push("C");


    }
}