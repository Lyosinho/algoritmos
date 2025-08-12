public class Principal {
    public static void main(String[] args) {
        Pessoa obj1 = new Pessoa("Alex", 30);
        Professor obj2 = new Professor("Maria", 40, 12345678901L, 101);
        String nome = obj1.getNome();
        System.out.println(nome);
        int id = obj2.setId(202);
        System.out.println("ID set to: " + id);
 }
}