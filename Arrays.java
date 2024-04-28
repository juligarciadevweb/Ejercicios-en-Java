import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public static void main(String[] args) {
        int num22 = 77;
        String myString = "Una pequeña gran historia";
        List myList = new ArrayList();
        myList.add(myString);
        myList.add(false);
        myList.add(num22);
        myList.add("Those eyes");
        myList.add("Julia Tomasone");
        myList.add("Shot me down");
        

        System.out.println(myList);

        //Remover elementos especificando el indice
        myList.remove(4);
        myList.remove(2);
        System.out.println(myList);

        //Acceder a elementos especificos
        System.out.println(myList.get(1));
        
        
    }
}
