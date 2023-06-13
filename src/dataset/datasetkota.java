/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;
/**
 *
 * @author Asus
 */
public class datasetkota {
    private ArrayList<String> idkota;
    private ArrayList<String> namakota;
    private ArrayList<String> ongkoskirim;
        
    public datasetkota(){
        idkota = new ArrayList<>();
        namakota = new ArrayList<>();
        ongkoskirim = new ArrayList<>();
    }
    
    public void addIdkota(String value){
        this.idkota.add(value);
    }
    
    public ArrayList<String> getIdkota(){
        return this.idkota;
    }
    
    public void addnamakota(String value){
        this.namakota.add(value);
    }
    
    public ArrayList<String> getnamakota(){
        return this.namakota;
    }
    
    public void addongkoskirim(String value){
        this.ongkoskirim.add(value);
    }
    
    public ArrayList<String> getongkoskirim(){
        return this.ongkoskirim;
    }
    
    
    
}
 

