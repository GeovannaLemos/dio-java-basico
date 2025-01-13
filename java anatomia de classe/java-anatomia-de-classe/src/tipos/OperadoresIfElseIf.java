package tipos;

public class OperadoresIfElseIf {
    public static void main(String[] args) {
        int a, b;
    
        a = 8;
        b = 6;

            String result = ""; 
            if (a == b) {
                result = "equal";
            } else if (a<b){
                 result = "a smaller than b";
            } else if(a>b){
                 result = "a greater than b";
            }
        
        System.out.println(result);
    }
}
