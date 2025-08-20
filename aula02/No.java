class No<T>{
    private T dado;
    private No<T> nextNo;
    private No<T> previousNo;

    public No(T dado){
        this(dado,null,null);
    }

    public No(T dado, No<T> nextNo, No<T> previousNo){
        this.dado = dado;
        this.nextNo = nextNo;
        this.previousNo = previousNo;
    }

    public void setDado(T dado){
        this.dado = dado;
    }

    public T getDado(){
        return this.dado;

    }

    public No<T> getNextNo(){
        return this.nextNo;
    }

    public void setNextNo(No<T> nextNo){
        this.nextNo = nextNo;
    }

    public No<T> getPreviousNo(){
        return this.previousNo;
    }

    public void setPreviousNo(No<T> previousNo){
        this.previousNo = previousNo;
    }

    @Override
    public String toString(){
        return "dado{"+getDado()+"}";
    }
}