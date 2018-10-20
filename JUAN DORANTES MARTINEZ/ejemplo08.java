import java.util.*;
import java.io.*;
public class Ejemplo08 {
    public static void main(String[] args) throws IOException{
        int A,B, Resultado = 0 ;
        char operador;
        boolean calculado = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero entero:");
        A = sc.nextInt();
        System.out.print("Introduzca otro numero entero:");
        B = sc.nextInt();
        System.out.print("Introduzca un operador (+,-,*,/):");
        operador = (char)System.in.read();
        switch (operador) {
                case ,_, : Resultado = A - B;
                           break;
                case ,+, : Resultado = A + B;
                           break;
                case ,*, : Resultado = A * B;
                           break;
                case ,/, : Resultado = A / B;
                           else{
                              System.out.println("\