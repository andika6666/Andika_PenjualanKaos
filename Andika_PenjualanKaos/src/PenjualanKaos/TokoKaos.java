/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PenjualanKaos;

/**
 *
 * @author Andika Dewa
 */
public class TokoKaos {
    String judul;
    String motif;
    String penutup;
    
    
    public void setJudul(String judul){
        this.judul = judul;
    }
    
    public String getJudul(){
        System.out.println(judul);
        return judul;
    }
    
    public void setMotif(String motif){
        this.motif = motif;
    }
    
    public String getMotif(){
        System.out.println(motif);
        return motif;
    }
    
    public void setPenutup(String penutup){
        this.penutup = penutup;
    }
    
    public String getPenutup(){
        System.out.println(penutup);
        return penutup;
    }
}
