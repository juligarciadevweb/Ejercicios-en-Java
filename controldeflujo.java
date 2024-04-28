public class controldeflujo {
    public static void main(String[] args) {
        //primer uso del for
        int n = 8;
        int contador = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Primer uso del for");
        }

        //<> primer uso del while
        int x = 0;        
        while (x < n) {
            System.out.println("uso del while");
            x++;
        }

        //uso de la estructura do while
        do {
            System.out.println("uso de la estructura do while");
            n++;
        } while (n < 15);

        //uso del condicional if
        if (n < 30) {
            System.err.println("are you listening??");
        } else{
            System.out.println("no estas escuchando?");
        }
           
        if(n < 15 && n > 3){
            contador++;
            System.out.println("Se cumplio la compuerta AND");
        }

    }
}
