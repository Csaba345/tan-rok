package tanarokrangsor;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author csaba
 */
public class Tanarok {

    String nev;
    int dolgozottEvekSzama;
    public enum AllasTipusa {
        ORAADO, 
        RESZMUNKA, 
        TELJES 
    };
    AllasTipusa status;
    boolean legenda;
    private String rang;
    
    public Tanarok(String nev, int dolgozottEvekSzama, boolean legenda, AllasTipusa status) {
        this.nev = nev;
        this.dolgozottEvekSzama = dolgozottEvekSzama;
        this.legenda = legenda;
        frissitRang();
    }
    
        public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getDolgozottEvekSzama() {
        return dolgozottEvekSzama;
    }

    public void setDolgozottEvekSzama(int dolgozottEvekSzama) {
        this.dolgozottEvekSzama = dolgozottEvekSzama;
        frissitRang();
    }

    public boolean isLegenda() {
        return legenda;
    }

    public void setLegenda(boolean legenda) {
        this.legenda = legenda;
    }
    
        public String getRang() {
        return rang;
    }
        
    public AllasTipusa getStatus() { return status; }
    public void setStatus(AllasTipusa status) { this.status = status; }
   
    public void frissitRang() {
        if (dolgozottEvekSzama >= 15) rang = "arany";
        else if (dolgozottEvekSzama >= 10) rang = "ezüst";
        else if (dolgozottEvekSzama >= 5)  rang = "bronze";
        else rang = "";
    }
    
}
 