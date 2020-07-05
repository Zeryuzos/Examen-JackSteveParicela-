package pe.edu.upeu.jpp.examen;

import pe.edu.upeu.jpp.utils.LeerTeclado;

public class ResolucionExamen{
    LeerTeclado teclado = new LeerTeclado();
    public void GerenteCostos() {
        int numero;
        double total1 = 0, total2 = 0,total3 = 0, Tfinal = 0;
        for(int j = 1;j <= 3;j++){
            numero= teclado.leer(0,"Ingrese la cantidad de autos en "+j+" categoria: ");
            if(numero > 0){
                for(int i = 0;i < numero;i++){
                if(j == 1) {
                    double categoria1[] = new double[numero];
                    categoria1[i] = teclado.leer(0,"Ingrese el costo del "+(i+1)+" auto ");
                    total1 += categoria1[i] * 0.1;
                    System.out.println("El 10% es: "+total1);
                }else if(j == 2){
                    double categoria2[] = new double[numero];
                    categoria2[i] = teclado.leer(0,"Ingrese el costo del "+(i+1)+" auto ");
                    total2 += categoria2[i] * 0.07;
                    System.out.println("El 10% es: "+total2);
                }else{
                    double categoria3[] = new double[numero];
                    categoria3[i] = teclado.leer(0,"Ingrese el costo del "+(i+1)+" auto ");
                    total3 += categoria3[i] * 0.05;
                    System.out.println("El 10% es: "+total3);
                }
                }
            }
        }
        Tfinal = total1+total2+total3;
        System.out.println("El total de la categoria 1 es: "+total1);
        System.out.println("El total de la categoria 2 es: "+total2);
        System.out.println("El total de la categoria 3 es: "+total3);
        System.out.println("El toal final es: "+Tfinal);
    }

    public void TablaMultiplicar() {
        int total = 0;
        for(int dato1 = 1; dato1 <= 20;dato1++){
            for(int dato2 = 1; dato2 <= 10;dato2++){
            total = dato1 * dato2;
            System.out.println(dato1+" X "+dato2+" = "+total);
            }
        }
        System.out.println("\n");
    }
    public void NumerosPerfectos(int numero) {
        int i = 1;
        while(i<numero){
            if(numero%1 == 0){
                System.out.println("Es divisor: "+i);
            }else{
                System.out.println("No es divisor: "+i);
            }
            i++;
        }
    }
    public int PotenciaRecurciva(int base, int exp){
        if(exp == 0){
            return 1;
        } 
        else{
            return base * (int)Math.pow(base,exp -1);
        }
    }

}
