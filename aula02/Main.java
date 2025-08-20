public class Main{
    public static void main(String[] args){
        No<String> obj1 = new No<String>("abu");
        No<String> obj2 = new No<String>("abuu");
        No<String> obj3 = new No<String>("abuuu");
        No<String> obj4 = new No<String>("abuuuu");

        obj1.setNextNo(obj2);
        obj2.setNextNo(obj3);
        obj3.setNextNo(obj4);
        obj4.setNextNo(obj1);

        obj1.setPreviousNo(obj2);
        obj2.setPreviousNo(obj3);
        obj3.setPreviousNo(obj4);
        obj4.setPreviousNo(obj1);

        No<String> first = obj1;
        while(obj1.getNextNo() != first){
            System.out.println(obj1);
            obj1 = obj1.getNextNo();
        }
   }
}