package ui;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        System.out.println("Segumiento 3 Complejidad");
        Main main = new Main();
        // Prueba 1: Encontrar valores repetidos en una lista ordenada
        int[] lista1 = {1, 2, 2, 3, 4, 4, 4, 5, 6, 6};
        ArrayList<Integer> repetidos = encontrarRepetidos(lista1);
        System.out.println("Lista de repetidos: " + repetidos);

        // Prueba 2: Verificar si una palabra es un palíndromo
        String palindromoTrue = "reconocer";
        String palindromoFalse = "hola";
        System.out.println("¿'reconocer' es palíndromo?: " + main.esPalindromo(palindromoTrue));
        System.out.println("¿'hola' es palíndromo?: " + main.esPalindromo(palindromoFalse));

        // Prueba 3: Contar bits '1' en una cadena binaria
        String cadenaBits = "1011001";
        int cantidadBits1 = contarBits1(cadenaBits);
        System.out.println("Número de bits '1': " + cantidadBits1);
    }

    public static ArrayList<Integer> encontrarRepetidos(int[] lista1){  //O(1)
        ArrayList<Integer> lista2= new ArrayList<>(); //O(1)
        for(int i=0; i < lista1.length; i++){ //O(n)
            if(i>0 && lista1[i] != lista1[i-1]){ //O(n)
                if(lista1[i] == lista1[i+1]){  //O(n)
                    lista2.add(lista1[i]); //O(n)
                }
            }
        }
        return lista2; //O(1)
    }


    public boolean esPalindromo(String palabra) {
        //apunta al primer carácter de la palabra
        int left = 0; //O(1)
        //apunta al último carácter de la palabra
        int right = palabra.length() - 1; //O(1)

        //Se ejecuta hasta la mitad de la palabra. Se repite hasta llegar a left == right
        while (left < right) { //O(n/2)
            //Si en cualquier puntosabemos que NO es un palíndromo y devolvemos false de inmediato
            if (palabra.charAt(left) != palabra.charAt(right)) { //O(n/2)
                return false; //O(1) mejor caso
            }
            //Avanzamos left hacia la derecha y retrocedemos right hacia la izquierda
            left++; //O(n/2)
            right--; //O(n/2)
            //Esto hace que el bucle se repita n/2 veces.
        }
        //Si terminamos el bucle sin encontrar diferencias, la palabra es un palindromo y devolvemos true
        return true; //O(1)
    }

    public static int contarBits1(String cadena){
        //contara cuantos '1' hay en la cadena
        int cont = 0; //O(1)
        for(int i=0; i < cadena.length(); i++){ //O(n)
            //En cada iteracion se compara si el caracter en la posición i es '1'
            if(cadena.charAt(i) == '1'){ //O(n)
                //Si el caracter es '1', se incrementa el contador
                cont++; //O(n)
            }
        }
        return cont; //O(1)
    }

}