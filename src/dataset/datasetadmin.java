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
public class datasetadmin {
    private ArrayList<String> username;
    private ArrayList<String> password;
    private ArrayList<String> nama;
    private ArrayList<String> level;
    private ArrayList<String> email;
    
    public datasetadmin(){
        username = new ArrayList<>();
        password = new ArrayList<>();
        nama = new ArrayList<>();
        level = new ArrayList<>();
        email = new ArrayList<>();
    }
    
    public void addUsername(String value){
        this.username.add(value);
    }
    
    public ArrayList<String> getUsername(){
        return this.username;
    }
    
    public void addpassword(String value){
        this.password.add(value);
    }
    
    public ArrayList<String> getPassword(){
        return this.password;
    }
    
    public void addNama(String value){
        this.nama.add(value);
    }
    
    public ArrayList<String> getNama(){
        return this.nama;
    }
    
    public void addLevel(String value){
        this.level.add(value);
    }
    
    public ArrayList<String> getLevel(){
        return this.level;
    }
    
    public void addEmail(String value){
        this.email.add(value);
    }
    
    public ArrayList<String> getEmail(){
        return this.email;
    }
    
   
}
