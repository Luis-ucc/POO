public class Condicionales {

    public static void main(String[] args) {

        // 4.1

        

        int angulo = 90;

        if (angulo == 90) {
            System.out.println("el angulo es un angulo recto");
        } else {
            System.out.println("el angulo no es un angulo recto");
        }
        // --------------------------------------------------------------------

        double temperatura = 150;

        if (temperatura > 100) {
            System.out.println("por encima del punto de ebullición del agua");
        } else {
            System.out.println("por debajo del punto de ebullición del agua");
        }
        // -----------------------------------------------------------------------------

        int numero = -4;
        int positivos = 0;
        int negativos = 0;

        if (numero > 0) {
            positivos = positivos + numero;
        } else {
            negativos = negativos + numero;
        }

        System.out.println(positivos);
        System.out.println(negativos);

        // ----------------------------------------------------------------------------

        int x = 5;
        int y = 3;
        int z = 15;
        

        if (x < y && z < 20) {
            System.out.println("dale un valor a p: ");
            int p = 0;
            System.out.println("el valor de p es: " + p);
        }

         // ----------------------------------------------------------------------------
         
        int distancia = 30;
        if (distancia > 20 && distancia < 35) {
            int tiempo = 30;
            System.out.println("el tiempo es " + tiempo);
        }

        int angu = 90;
        if (angu < 90) {
            System.out.println("angulo agudo");
        } else {
            if (angu > 90) {
                System.out.println("angulo obtuso");
            } else {
                System.out.println("angulo recto");
            }
        }

    }

}
