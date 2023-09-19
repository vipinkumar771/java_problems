public class Nine {
    String name;
    Nine(String n){
       name= n;
    }
    public static void main(String[] args){
        Nine m1 = new Nine("guitar");
        Nine m2 = new Nine("tv");
        System.out.println(m2.equals(m1)); //false
    }
    @Override
    public  boolean equals(Object obj){
        Nine m = (Nine) obj;
        if(m.name != null){
            return true; // statement executed true
        }
        return false;
    }
}
