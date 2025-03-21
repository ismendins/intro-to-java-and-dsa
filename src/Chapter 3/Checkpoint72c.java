//How do you generate a random integer i such that 10 <= i <= 50?
public class Checkpoint72c {
    public static void main (String[] args){
    int a = (int)(Math.random()*50);
    System.out.println(a);
    if (a<10){
        while(a<10){
            a = (int)(Math.random()*50);
        }
    }
    System.out.println(a);
    }
}
