
public class TESTESCH3 {
    public static void main (String[] args){
        for(int i = 2; i < 1000; i++){
            if (i%2 == 0 && i%3==0){
                System.out.println(i + " é múltiplo de 3 e 2");
            }
            if (i%6==0){
                System.out.println(i + " é múltiplo de 6");
            }
        }
    }
}
