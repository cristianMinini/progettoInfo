/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ristorante_minini;

/**
 *
 * @author 39349
 */
public class Ristorante 
{
    private Prenotazione[] elencoPrenotazioni;
    private final static int NUM_MAX_PRENOTAZIONI=15;
    private int numeroPrenotazioniPresenti;

    public Ristorante(Prenotazione[] elencoPrenotazioni, int numeroPrenotazioniPresenti) 
    {
        this.elencoPrenotazioni = elencoPrenotazioni;
        this.numeroPrenotazioniPresenti = numeroPrenotazioniPresenti;
    }

    public static int getNUM_MAX_PRENOTAZIONI() 
    {
        return NUM_MAX_PRENOTAZIONI;
    }

    public int getNumeroPrenotazioniPresenti() 
    {
        return numeroPrenotazioniPresenti;
    }

    public void setNumeroPrenotazioniPresenti(int numeroPrenotazioniPresenti) 
    {
        this.numeroPrenotazioniPresenti = numeroPrenotazioniPresenti;
    }
    public int aggiungiPrenotazione(Prenotazione prenotazione,int posizione)
    {
       
        if(elencoPrenotazioni[posizione]==null)
        {
            elencoPrenotazioni[posizione]=new Prenotazione(prenotazione);
            return 1;
        }
        else
            return 0;
    }
    public Prenotazione getPrenotazione(int posizione)
    {
        if ((posizione>0 && posizione<NUM_MAX_PRENOTAZIONI) && elencoPrenotazioni[posizione]!=null)
        {
            return new Prenotazione(elencoPrenotazioni[posizione]);
        }
        else
            return null;
    }
    
    public Prenotazione cercaPrenotazione(String nome)
    {
        for(int i=0;i<NUM_MAX_PRENOTAZIONI;i++)
        {
            if(elencoPrenotazioni[i].getNome().equals(nome))
                return new Prenotazione(elencoPrenotazioni[i]);
        }
        return null;
    }
    
    public String stampaPrenotazione(int posizione)
    {
        return getPrenotazione(posizione).toString();
    }
    public int modificaPrenotazione(String nome, int id)
    {
        for(int i=0;i<NUM_MAX_PRENOTAZIONI;i++)
        {
            if(elencoPrenotazioni[i].getIdPrenotazione()==id)
            {
                elencoPrenotazioni[i].setNome(nome);
                return 1;
            }           
        }
        return 0;
    }
    public int eliminaPrenotazione(int posizione)
    {
        if(elencoPrenotazioni[posizione]!=null)
        {
            elencoPrenotazioni[posizione]=null;
            return 1;
        }
        return 0;
    }
    
   

    
    
}
