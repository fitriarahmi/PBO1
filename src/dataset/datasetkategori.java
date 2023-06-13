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
public class datasetkategori {
    private ArrayList<String> idkategori;
    private ArrayList<String> namakategori;
    private ArrayList<String> kategori;
        
    public datasetkategori(){
        idkategori= new ArrayList<>();
        namakategori = new ArrayList<>();
        kategori = new ArrayList<>();
    }
    
    public void addIdkategori(String value){
        this.idkategori.add(value);
    }
    
    public ArrayList<String> getIdkategori(){
        return this.idkategori;
    }
    
    public void addnamakategori(String value){
        this.namakategori.add(value);
    }
    
    public ArrayList<String> getnamakategori(){
        return this.namakategori;
    }
    
    public void addkategori(String value){
        this.kategori.add(value);
    }
    
    public ArrayList<String> getDatakategori(){
        return this.kategori;
    }
    
}
