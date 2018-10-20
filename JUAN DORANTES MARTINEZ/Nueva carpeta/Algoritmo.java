import java.io.*;

public class Algoritmo {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        double cantidad_de_pesos_mexicanos, dolares;
        System.out.print("Ingrese el valor de cantidad de pesos mexicanos: ");
        cantidad_de_pesos_mexicanos = Double.parseDouble(in.readLine());
        dolares=cantidad_de_pesos_mexicanos/18.7189;
        System.out.println("Valor de dolares: " + dolares);
        in.close();
    }

}

