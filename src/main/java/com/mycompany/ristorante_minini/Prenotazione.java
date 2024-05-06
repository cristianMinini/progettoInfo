/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ristorante_minini;

import java.time.LocalDateTime;

/**
 *
 * @author 39349
 */
public class Prenotazione 
{
    private String nome;
    private LocalDateTime dataOra;
    private String allergie;
    private String tipoCucina;
    private int idPrenotazione;

    public Prenotazione(String nome, LocalDateTime dataOra, String allergie, String tipoCucina, int idPrenotazione) 
    {
        this.nome = nome;
        this.dataOra = dataOra;
        this.allergie = allergie;
        this.tipoCucina = tipoCucina;
        this.idPrenotazione = idPrenotazione;
    }
    public Prenotazione(Prenotazione prenotazione)
    {
        this.nome=prenotazione.getNome();
        this.dataOra=prenotazione.getDataOra();
        this.allergie=prenotazione.getAllergie();
        this.tipoCucina=prenotazione.getTipoCucina();
        this.idPrenotazione=prenotazione.getIdPrenotazione();
                
    }
            

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public void setDataOra(LocalDateTime dataOra) 
    {
        this.dataOra = dataOra;
    }

    public void setAllergie(String Allergie) 
    {
        this.allergie = Allergie;
    }

    public void setTipoCucina(String tipoCucina) 
    {
        this.tipoCucina = tipoCucina;
    }

    public void setIdPrenotazione(int idPrenotazione) 
    {
        this.idPrenotazione = idPrenotazione;
    }

    public String getNome() 
    {
        return nome;
    }

    public LocalDateTime getDataOra() 
    {
        return dataOra;
    }

    public String getAllergie() 
    {
        return allergie;
    }

    public String getTipoCucina() 
    {
        return tipoCucina;
    }

    public int getIdPrenotazione() 
    {
        return idPrenotazione;
    }

    @Override
    public String toString() 
    {
        return "Prenotazione{" + "nome=" + nome + ", dataOra=" + dataOra + ", Allergie=" + allergie + ", tipoCucina=" + tipoCucina + ", idPrenotazione=" + idPrenotazione + '}';
    }
    
}
