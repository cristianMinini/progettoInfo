/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ristorante_minini;

import java.time.LocalDateTime;

/**
 *
 * @author 39349
 */
public class App 
{

    public static void main(String[] args) 
    {
        LocalDateTime dataOra= LocalDateTime.now();
        Prenotazione p1=new Prenotazione("Liberelli",dataOra,"lattosio","thailandese",344605);
        Prenotazione p2=new Prenotazione("mendoza",dataOra,"nessuna","cinese",645288);
        
        
        System.out.println(p1.getNome());
        System.out.println(p1.toString());
    }
    
}
