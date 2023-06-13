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
public class datasetkonsumen {
    private ArrayList<String> idkonsumen;
    private ArrayList<String> namauser;
    private ArrayList<String> password;
    private ArrayList<String> emailuser;
    private ArrayList<String> alamatuser;
    private ArrayList<String> namaproduk;
    private ArrayList<String> kodeposuser;
    private ArrayList<String> kotauser;
    private ArrayList<String> telpon;
    private ArrayList<String> tanggal;
    private ArrayList<String> jumlah;
    private ArrayList<String> total;
    
    public datasetkonsumen(){
        idkonsumen = new ArrayList<>();
        namauser = new ArrayList<>();
        password = new ArrayList<>();
        emailuser = new ArrayList<>();
        alamatuser = new ArrayList<>();
        namaproduk = new ArrayList<>();
        kodeposuser = new ArrayList<>();
        kotauser = new ArrayList<>();
        telpon = new ArrayList<>();
        tanggal = new ArrayList<>();
        jumlah = new ArrayList<>();
        total = new ArrayList<>();
    }
    
    public void addidkonsumen(String value){
        this.idkonsumen.add(value);
    }
    
    public ArrayList<String> getidkonsumen(){
        return this.idkonsumen;
    }
    
    public void addnamauser(String value){
        this.namauser.add(value);
    }
    
    public ArrayList<String> getnamauser(){
        return this.namauser;
    }
    
    public void addpassword(String value){
        this.password.add(value);
    }
    
    public ArrayList<String> getpassword(){
        return this.password;
    }
    
    public void addemailuser(String value){
        this.emailuser.add(value);
    }
    
    public ArrayList<String> getemailuser(){
        return this.emailuser;
    }
    
    public void addalamatuser(String value){
        this.alamatuser.add(value);
    }
    
    public ArrayList<String> getalamatuser(){
        return this.alamatuser;
    }
    
    public void addnamaproduk(String value){
        this.namaproduk.add(value);
    }
    
    public ArrayList<String> getnamaproduk(){
        return this.namaproduk;
    }
    
    public void addkodeposuser(String value){
        this.kodeposuser.add(value);
    }
    
    public ArrayList<String> getkodeposuser(){
        return this.kodeposuser;
    }
    
    public void addkotauser(String value){
        this.kotauser.add(value);
    }
    
    public ArrayList<String> getkotauser(){
        return this.kotauser;
    }
    
    public void addtelpon(String value){
        this.emailuser.add(value);
    }
    
    public ArrayList<String> gettelpon(){
        return this.telpon;
    }
    
    public void addtanggal(String value){
        this.tanggal.add(value);
    }
    
    public ArrayList<String> gettanggal(){
        return this.tanggal;
    }
    
    public void addjumlah(String value){
        this.jumlah.add(value);
    }
    
    public ArrayList<String> getjumlah(){
        return this.jumlah;
    }
    
    public void addtotal(String value){
        this.total.add(value);
    }
    
    public ArrayList<String> gettotal(){
        return this.total;
    }
    
   
}  
