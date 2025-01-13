package tipos;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        int a, b;
    
        a = 5;
        b = 5;
        
        boolean trueFalse = a == b;    
        System.out.println("a equal b? " + trueFalse);

        trueFalse = a!=b;    
        System.out.println("a diferent from b? " + trueFalse);

        trueFalse = a>b;    
        System.out.println("a greater than b? " + trueFalse);
    }
    }

