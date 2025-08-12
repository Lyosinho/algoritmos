public class Professor extends Pessoa{
    private int id;

    public Professor(){
        this("", 0,0l, 0);
    }

    public Professor(String nome, int idade, long cpf, int id){
        super(nome, idade, cpf);
        this.id = id;
    }

    public void setId(int id){
        this.id = id;
    }

}