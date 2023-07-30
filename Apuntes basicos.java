                                //Apuntes Java de w3 

public class Main 
{
  public static void main(String[] args) 
  {
    System.out.println("Hello World");
    //println() método para imprimir una línea de texto en la pantalla
  }
}

/*
Cada línea de código que se ejecuta en Java debe estar dentro de un archivo class. 
En nuestro ejemplo, llamamos a la clase Main . Una clase siempre debe comenzar con una primera letra mayúscula.

Nota: Java distingue entre mayúsculas y minúsculas: "MyClass" y "myclass" tienen un significado diferente.
El nombre del archivo java debe coincidir con el nombre de la clase. Al guardar el archivo, guárdelo con el nombre de la clase 
y agregue ".java" al final del nombre del archivo.

*/
                            //Trabajo de texto
//Cuando trabaja con texto, debe estar entre comillas dobles ""

System.out.println("This sentence will work!");

                            //Imprimir numeros

//También puede usar el println()método para imprimir números.
class HelloWorld {
    public static void main(String[] args) {
        System.out.println(3);
        System.out.println(358);
        System.out.println(50000);
        //Podemos realizar calculos matematicos dentro
        System.out.println(3 + 5); //Suma
        System.out.println(3 - 5); //Resta
        System.out.println(3 * 5); //Multiplicacion
    }
}

/* 
                            Variables Java

En Java, existen diferentes tipos de variables, por ejemplo:

String- almacena texto, como "Hola". Los valores de cadena están entre comillas dobles
int- almacena enteros 
float- almacena flotantes
char- almacena caracteres individuales, como 'a' o 'B'. Los valores de char están entre comillas simples
boolean- almacena valores con estado: verdadero o falso

*/

//Declaracion unica
float primeVar = 13.5;

//Declaracion multiple
int x = 5, y = 6, z = 50;

//Impresion de la suma de los valores
System.out.println(x + y + z);

//También puede asignar el mismo valor a múltiples variables en una línea:

int x, y, z; //Definimos todo de tipo entero
x = y = z = 50; //Cada variable vale 50
System.out.println(x + y + z); //La salida sera 150

//Tipos de datos

int myNum = 5;               // Integer (whole number)
float myFloatNum = 5.99f;    // Floating point number
char myLetter = 'D';         // Character
boolean myBool = true;       // Boolean
String myText = "Hello";     // String

//Numeros 

short myNum = 5000; //Corto
int myNum = 100000; //Enteros
long myNum = 15000000000L; //El longtipo de datos puede almacenar números enteros
float myNum = 5.75f; //Flotante
double myNum = 19.99d; 

/*
La precisión de un valor de punto flotante indica cuántos dígitos 
puede tener el valor después del punto decimal. 
La precisión de floates de sólo seis o siete dígitos decimales, 
mientras que doublelas variables tienen una precisión de unos 15 dígitos. 
Por lo tanto, es más seguro usarlo doublepara la mayoría de los cálculos. 
*/

/*                                         Conversión de tipos de Java
La conversión de tipos es cuando asigna un valor de un tipo de datos primitivo a otro tipo.

En Java, hay dos tipos de conversión:

Ampliación de conversión (automáticamente): conversión de un tipo más pequeño a un tamaño de tipo más grande
byte-> short-> char-> int-> long-> float->double

Narrowing Casting (manualmente): conversión de un tipo más grande a un tipo de tamaño más pequeño
double-> float-> long-> int-> char-> short->byte

                                             Caracteres

Se utiliza para almacenar un solo carácter. 

El carácter debe estar entre comillas simples, como 'A' o 'c':

*/

//Impresion de un caracter simple
char myGrade = 'B';
System.out.println(myGrade);


//Alternativamente, si está familiarizado con los valores ASCII, puede usarlos para mostrar ciertos caracteres:

char myVar1 = 65, myVar2 = 66, myVar3 = 67;
System.out.println(myVar1); //A
System.out.println(myVar2); //B
System.out.println(myVar3); //C


/*  Ensanchamiento de fundición
La fundición ampliada se realiza automáticamente al pasar un tipo de tamaño más pequeño a 
un tipo de tamaño más grande*/


public class Main 
{
    public static void main(String[] args) 
    {
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0
    }
}

//Fundición de estrechamiento
//Debe hacerse manualmente colocando el tipo entre paréntesis delante del valor:

public class Main 
{
    public static void main(String[] args) 
    {
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int
        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9
    }
}


                                //Longitud de la cadena

/*Una cadena en Java es en realidad un objeto, 
que contiene métodos que pueden realizar ciertas operaciones en cadenas. 
Por ejemplo, la longitud de una cadena se puede encontrar con el metodo length() 
Siempre se hace la concatenacion con el simbolo + y el nombre de la variable

*/


public class Main 
{
    public static void main(String[] args) 
    {
        String originalString = "Hola, este es un ejemplo de cadena en Java.";

        // 1. length(): Obtiene la longitud de la cadena.
        int length = originalString.length();
        System.out.println("Longitud de la cadena: " + length);

        // 2. charAt(int index): Obtiene el carácter en una posición específica.
        char charAtIndex = originalString.charAt(0);
        System.out.println("Carácter en la posición 0: " + charAtIndex);

        // 3. substring(int startIndex, int endIndex): Obtiene una subcadena desde startIndex (incluido) hasta endIndex (excluido).
        String subString = originalString.substring(6, 10);
        System.out.println("Subcadena desde la posición 6 hasta 10: " + subString);

        // 4. indexOf(String str): Encuentra la primera aparición de str en la cadena.
        int indexOfWord = originalString.indexOf("ejemplo");
        System.out.println("Índice de la primera aparición de 'ejemplo': " + indexOfWord);

        // 5. lastIndexOf(String str): Encuentra la última aparición de str en la cadena.
        int lastIndexOfWord = originalString.lastIndexOf("Java");
        System.out.println("Índice de la última aparición de 'Java': " + lastIndexOfWord);

        // 6. contains(CharSequence sequence): Verifica si la cadena contiene la secuencia dada.
        boolean containsWord = originalString.contains("cadena");
        System.out.println("¿La cadena contiene la palabra 'cadena'? " + containsWord);

        // 7. replace(CharSequence target, CharSequence replacement): Reemplaza todas las ocurrencias de 'target' con 'replacement'.
        String replacedString = originalString.replace("Java", "Python");
        System.out.println("Cadena después de reemplazar 'Java' con 'Python': " + replacedString);

        // 8. toUpperCase(): Convierte la cadena en mayúsculas.
        String upperCaseString = originalString.toUpperCase();
        System.out.println("Cadena en mayúsculas: " + upperCaseString);

        // 9. toLowerCase(): Convierte la cadena en minúsculas.
        String lowerCaseString = originalString.toLowerCase();
        System.out.println("Cadena en minúsculas: " + lowerCaseString);

        // 10. trim(): Elimina los espacios en blanco al principio y al final de la cadena.
        String stringWithWhitespace = "   Hola, esta cadena tiene espacios en blanco.   ";
        String trimmedString = stringWithWhitespace.trim();
        System.out.println("Cadena original: '" + stringWithWhitespace + "'");
        System.out.println("Cadena sin espacios en blanco: '" + trimmedString + "'");
    }
}

//También puede usar el concat()método para concatenar dos cadenas:

String firstName = "John ";
String lastName = "Doe";
System.out.println(firstName.concat(lastName));


//                              Metodo Math en Java
public class Main {
    public static void main(String[] args) {
        // 1. Math.abs(): Devuelve el valor absoluto de un número.
        int absoluteValue = Math.abs(-10);
        System.out.println("Valor absoluto de -10: " + absoluteValue);

        // 2. Math.max(): Devuelve el mayor de dos números.
        int maxValue = Math.max(20, 30);
        System.out.println("El mayor número entre 20 y 30 es: " + maxValue);

        // 3. Math.min(): Devuelve el menor de dos números.
        int minValue = Math.min(40, 50);
        System.out.println("El menor número entre 40 y 50 es: " + minValue);

        // 4. Math.pow(): Devuelve el resultado de elevar un número a una potencia.
        double powerResult = Math.pow(2, 3);
        System.out.println("2 elevado a la potencia 3 es: " + powerResult);

        // 5. Math.sqrt(): Devuelve la raíz cuadrada de un número.
        double squareRoot = Math.sqrt(25);
        System.out.println("La raíz cuadrada de 25 es: " + squareRoot);

        // 6. Math.round(): Redondea un número al entero más cercano.
        long roundedValue = Math.round(3.7);
        System.out.println("3.7 redondeado es: " + roundedValue);

        // 7. Math.ceil(): Redondea un número hacia arriba al siguiente entero.
        double ceilValue = Math.ceil(4.2);
        System.out.println("4.2 redondeado hacia arriba es: " + ceilValue);

        // 8. Math.floor(): Redondea un número hacia abajo al entero más cercano.
        double floorValue = Math.floor(5.8);
        System.out.println("5.8 redondeado hacia abajo es: " + floorValue);

        // 9. Math.random(): Genera un número decimal aleatorio entre 0 (incluido) y 1 (excluido).
        double randomValue = Math.random();
        System.out.println("Número decimal aleatorio entre 0 y 1: " + randomValue);

        // 10. Math.sin(), Math.cos(), Math.tan(): Funciones trigonométricas.
        double angleInRadians = Math.toRadians(45); // Convertimos 45 grados a radianes.
        double sinValue = Math.sin(angleInRadians);
        double cosValue = Math.cos(angleInRadians);
        double tanValue = Math.tan(angleInRadians);
        System.out.println("Seno de 45 grados: " + sinValue);
        System.out.println("Coseno de 45 grados: " + cosValue);
        System.out.println("Tangente de 45 grados: " + tanValue);
    }
}

//                                   Switch
int day = 4;
switch (day) 
{
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
}

//                                  for-each
//También hay un ciclo " for-each ", que se usa exclusivamente 
//para recorrer elementos en una matriz :


for (type variableName : arrayName) 
{
  // code block to be executed
}

//El siguiente ejemplo genera todos los elementos en la matriz de autos , usando un bucle " para cada uno ":

String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) 
{
  System.out.println(i); //Imprime cada elemento del vector
}


                                //Break and continue
//Break
for (int i = 0; i < 10; i++) 
{
  if (i == 4) 
  {
    break; //Detiene el ciclo cuando se cumple la condicion
  }
  System.out.println(i);
}


for (int i = 0; i < 10; i++) {
  if (i == 4) 
  {
    continue; //Interrumpe la iteracion y continua el ciclo
  }
  System.out.println(i);
}

/*                            Matrices de Java

Las matrices se utilizan para almacenar múltiples valores en una sola variable, 
en lugar de declarar variables separadas para cada valor.

Para declarar una matriz, defina el tipo de variable con corchetes : */

String[] cars;
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

//Ahora una matriz numerica
int[] numbers;
int[] myNum = {10, 20, 30, 40};

//Para cambiar el elemento de una matriz hacemos lo siguiente
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
cars[0] = "Opel";
System.out.println(cars[0]); // Now outputs Opel en lugar de Volvo

//Para averiguar cuántos elementos tiene una matriz, use la lengthpropiedad:
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars.length);

//También podemos usar un for loop dentro de otro for loop
//para obtener los elementos de una matriz bidimensional 
//(todavía tenemos que señalar los dos índices):

public class Main 
{
  public static void main(String[] args) 
  {
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    for (int i = 0; i < myNumbers.length; ++i) 
    {
      for(int j = 0; j < myNumbers[i].length; ++j) 
      {
        System.out.println(myNumbers[i][j]);
      }
    }
  }
}





























































