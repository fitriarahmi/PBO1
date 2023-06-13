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
public class datasetmodul {
  private ArrayList<String> idmodul;
    private ArrayList<String> namamodul;
    private ArrayList<String> link;
    private ArrayList<String> statickonten;
    private ArrayList<String> gambar;
    private ArrayList<String> status;
    private ArrayList<String> aktif;
    private ArrayList<String> urutan;
    
    public datasetmodul(){
        idmodul = new ArrayList<>();
        namamodul= new ArrayList<>();
        link = new ArrayList<>();
        statickonten = new ArrayList<>();
        gambar = new ArrayList<>();
        status = new ArrayList<>();
        aktif = new ArrayList<>();
        urutan = new ArrayList<>();
    }
    
    public void addidmodul(String value){
        this.idmodul.add(value);
    }
    
    public ArrayList<String> getidmodul(){
        return this.idmodul;
    }
    
    public void addnamamodul(String value){
        this.namamodul.add(value);
    }
    
    public ArrayList<String> getnamamodul(){
        return this.namamodul;
    }
    
    public void addlink(String value){
        this.link.add(value);
    }
    
    public ArrayList<String> getlink(){
        return this.link;
    }
    
    public void addstatickonten(String value){
        this.statickonten.add(value);
    }
    
    public ArrayList<String> getstatickonten(){
        return this.statickonten;
    }
    
    public void addgambar(String value){
        this.gambar.add(value);
    }
    
    public ArrayList<String> getgambar(){
        return this.gambar;
    }
    
    public void addstatus(String value){
        this.status.add(value);
    }
    
    public ArrayList<String> getstatus(){
        return this.status;
    }
    
    public void addaktif(String value){
        this.aktif.add(value);
    }
    
    public ArrayList<String> getaktif(){
        return this.aktif;
    }
    
    public void addurutan(String value){
        this.urutan.add(value);
    }
    
    public ArrayList<String> geturutan(){
        return this.urutan;
    }
    
}
