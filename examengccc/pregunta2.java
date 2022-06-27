package examengccc;

import java.util.Scanner;

/**
 * pregunta2
 */
public class pregunta2 {

    static Scanner leerteclado=new Scanner(System.in);
    private static Object vehiculos;
    private static int categoria;{
    }
         public static void Pregunta2() {
            //Datos de entrada
            System.out.println("ingresar la categoria:");
            vehiculos=nextDouble();
            //proceso
            /*
            >=Los vehículos con categoría 1 pagan 12% de su valor
            >=Los vehículos con categoría 2 pagan 8% de su valor
            >=Los vehículos con categoría 3 pagan 5% de su valor
            */
            String estado;
            if(categoria>=1){
                estado="pagan 12% de sus valor";
            }else if(categoria>=2){
                estado="pagan 8% de sus valor";
            }else if(categoria>=3){
                estado="pagan 5% de sus valor";
            }
            //Datos de salida
            System.out.println(estado);
        }
        private static Object nextDouble() {
            return null;
        }
        public static void main(String[] args) {
            Pregunta2();
        }
    }
}