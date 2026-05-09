public class candy {
    public static void main(String[] args) {
        int jar=10;
        int order=3;
        if(order>jar){
            System.out.println("INVALID INPUT");
        } 
        else{
            jar=jar-order;
            System.out.println("No of candies left:"+jar);
        }
            if(jar<=5){
                jar=10;
                System.out.println("Jar refilled no of candies in the jar:"+jar);
            }
    }
}
