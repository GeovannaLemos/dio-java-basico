package tipos;

public class OperadoresTernario {
           public static void main(String[] args) {
        int a, b;
    
        a = 5;
        b = 5;

        String firstName = "Geovanna";
        String lastName = "Lemos";
        
        String name = "";
        if (firstName.equals(lastName)) {
            name = "first name must be different from last name";
            } else {
            name = (firstName + " " +  lastName);
        }
        System.out.println(name);

        String result = a==b ? "true" : "false";
         
        System.out.println(result);
    }
    }
