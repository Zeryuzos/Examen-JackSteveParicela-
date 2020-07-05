package pe.edu.upeu.jpp;

import pe.edu.upeu.jpp.examen.ResolucionExamen;

import pe.edu.upeu.jpp.utils.LeerTeclado;

/**
 * Autor: Jack Steve Paricela Pongo
 */
public class App {
    public static void main( String[] args ){
        LeerTeclado teclado = new LeerTeclado();
        ResolucionExamen EX = new ResolucionExamen();
        String opcion = "SI";
        int numDeAlg;
        String mensajeMenu ="1.- El problema del Gerente\n"+
                            "2.- Tabla de multiplicar\n"+
                            "3.- Fibonaci\n"+
                            "4.- Potencia con recursividad";
	    do{
            System.out.println(mensajeMenu);

            numDeAlg = teclado.leer(0, "Ingrese el Algoritmo que desea probar: ");
            
            switch(numDeAlg){
                /**caso 1 */
                case 1:
                EX.GerenteCostos();         
                break;
                /**caso 2 */
                case 2: 
                EX.TablaMultiplicar();
                break;
                /**caso 3 */
                case 3:
                int numero = teclado.leer(0,"Ingresa un numero: ");
                EX.NumerosPerfectos(numero);
                break;
		        case 4:
                int base = teclado.leer(0,"Ingresa la base: ");
                int exp = teclado.leer(0,"Ingresa el exponente: ");
                System.out.println(EX.PotenciaRecurciva(base,exp));
                break;
                /**caso default */
                default: System.out.println("Num de Algoritmo no existe!!"); break;
            }opcion = teclado.leer("", "Desea probar mas algoritmos? SI/NO");
        }while(opcion.equals("SI") || opcion.equals("si"));       

    }
}
