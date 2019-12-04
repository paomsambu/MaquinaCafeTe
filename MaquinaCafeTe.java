
package maquinacafete;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class MaquinaCafeTe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bebidas[] menu = new Bebidas [20];
        
        boolean otroMenu = true;
        int next = 0;
        
        while (otroMenu) {

           
            System.out.println("¿Qué quiere tomar?\n"
                    + "1)Café\n"
                    + "2)Té\n");
            Scanner entrada = new Scanner(System.in);
            int clase = entrada.nextInt();

            if (clase == 1) {
                
                System.out.println(""
                        + "1-Expresso\n"
                        + "2-Ristretto\n"
                        + "3-Normal\n");
                Scanner entradacafe = new Scanner(System.in);
                int tipoCafe = entradacafe.nextInt();            
                switch (tipoCafe) {
                    case 1:
                        menu[next] = new Expresso();
                        break;
                    case 2:
                        menu[next] = new Ristretto();
                        break;
                    case 3:
                        menu[next] = new Normal();
                        break;
                }

                System.out.println("¿Cuanto de azucar?0-3");
                Scanner entradaazucar = new Scanner(System.in);
                int azucar = entradacafe.nextInt();
                menu[next].setAzucar(azucar);

                System.out.println("¿Cuanto de leche?0-3");
                Scanner entradaleche = new Scanner(System.in);
                int leche = entradaleche.nextInt();
                menu[next].setLeche(leche);
            }

            if (clase == 2) {
                
                System.out.println(""
                        + "1-Negro\n"
                        + "2-Rojo\n"
                        + "3-Verde\n");
                Scanner entradacafe = new Scanner(System.in);
                int tipoTe = entradacafe.nextInt();            
                switch (tipoTe) {
                    case 1:
                        menu[next] = new Negro();
                        break;
                    case 2:
                        menu[next] = new Rojo();
                        break;
                    case 3:
                        menu[next] = new Verde();
                        break;
                }

                System.out.println("¿Cuantas cucharas de azúcar?0-3");
                Scanner entradaazucar = new Scanner(System.in);
                int azucar = entradacafe.nextInt();
                menu[next].setAzucar(azucar);

                System.out.println("¿Cuanta leche?0-3");
                Scanner entradaleche = new Scanner(System.in);
                int leche = entradaleche.nextInt();
                menu[next].setLeche(leche);
            }

            System.out.println("¿Desea algo más?\n"
                    + "1-Sí\n"
                    + "2-No\n");
            Scanner entradaOtroPedido = new Scanner(System.in);
            int otro = entradaOtroPedido.nextInt();
            if (otro == 1) {
                next++;
            } else {
                otroMenu = false;
            }

        }

        
        double subtotal = 0, total = 0;

        for (int i = 0; i < menu.length; i++) {
            
            if (menu[i] != null) {
                System.out.println(menu[i]);
                subtotal = subtotal + menu[i].getPrecio()
                        + menu[i].getAzucar() * 5
                        + menu[i].getLeche() * 5;
                
            }

        }
        total = subtotal * 1.21;
        System.out.println("Subtotal:" + subtotal);
        System.out.println("Total:" + total);
        

    }
  
    
    }
    

