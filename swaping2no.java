public class swap2 {
    public static void main(String[] args){
        int a = 11;
        int b = 10;
        System.out.println("Before swapping:");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swaping");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }    
}
