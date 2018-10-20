import java.io.*;
public class Ejemplo6_lectura{
public static void main(String args[]) throws IOException{
 InputStreamReader isr = new InputStreamReader(System.in);
 BufferedReader br = new BufferedReader(isr);
 String cantidad de dinero;
 int ;
 
 
 System.out.println("Como te llamas? ");
 nombre = br.readLine();
 System.out.println("Cual es tu edad? ");
 edad = Integer.parseInt(br.readLine());
 System.out.println("Tu nombre es "+ nombre);
 System.out.println("Tu edad es "+edad);
 }}