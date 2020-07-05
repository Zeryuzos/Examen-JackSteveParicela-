package pe.edu.upeu.jpp.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LeerTeclado{
    BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));
    public int leer(int data, String mensaje){
        try {
            System.out.println(mensaje);
            data=Integer.parseInt(entry.readLine());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return data;
    }
    public String leer(String mensaje1,String mensaje2){
        try {
            mensaje1=entry.readLine();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return mensaje1;
    }
}