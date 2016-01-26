/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecamusical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author DM3-1-15
 */
public class Auxiliar {
    
    //    función de lectura
    static String lector()
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader flujoE=new BufferedReader(isr);
        String dato="";
        try 
        {
          dato=flujoE.readLine();
        }
        catch (IOException gaizki){  
        }
        return dato;
    }
    
}
