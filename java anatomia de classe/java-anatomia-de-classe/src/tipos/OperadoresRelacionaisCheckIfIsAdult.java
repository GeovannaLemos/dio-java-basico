package tipos;

public class OperadoresRelacionaisCheckIfIsAdult {

    public static void main(String[] args) {
        int a, legalAge;
    
        a = 18;
        legalAge = 18;

            String firstName = "Geovanna";
            String lastName = "Lemos";
        
            String name = "";
                if (firstName.equals(lastName)) {
                     name = "first name must be different from last name";
                } else {
                    name = (firstName + " " +  lastName); 
                }

        String result = (a>=legalAge) ? (name + " is an adult.") : (name + " is underage.");
         
        System.out.println(result);
    }
    
}
