import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        Pessoa obj1 = new Pessoa("alex",5);
        Pessoa obj2 = new Pessoa("maria",10);
        String nome = obj1.getNome();
        // System.out.println(obj1.toString());

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>(5);
        pessoas.add(obj1);
        pessoas.add(new Pessoa(null,5));
        // System.out.println(pessoas);

        for(Pessoa p : pessoas)
        {
            System.out.println(p);
        }
    }
}