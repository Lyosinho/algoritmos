public class Main{
    public static void main(String[] args){
        Fila<String> fila = new Fila<String>("fila nomes");
        fila.enfileirar("Alex");
        fila.enfileirar("Alexx");
        fila.enfileirar("Alexxx");
        fila.imprimeFila();
        fila.desenfileirar();
        fila.enfileirar("Alexxxx");
        fila.enfileirar("Alexxxxx");
        fila.imprimeFila();
    }
}