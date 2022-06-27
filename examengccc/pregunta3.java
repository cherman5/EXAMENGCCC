package examengccc;

import java.util.Scanner;

/**
 * Main
 */
public class pregunta3 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Ingresa tamaño de la *:");
        int tamano=input.nextInt();

        if (tamano == 0)
            System.out.println("ERROR");
        else
        {
            String[][]dibujo = new String[tamano][tamano];

            for ( int i=0; i < dibujo.length ;i++){
                for (int j=0;  j<dibujo.length;j++){
                    int x = i +1;
                    if((i==j)  ||  (j == (tamano - x))){
                        dibujo[i][j] = "*";
                        System.out.print(dibujo[i][j] + " ");
                    }
                    else{
                       dibujo[i][j] = " ";
                       System.out.print(dibujo[i][j] + " ");
                    }
                }  
                System.out.println();
            }   
        }
    }
}