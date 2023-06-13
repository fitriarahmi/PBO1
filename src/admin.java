/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class admin {
    private String username, password, nama, level, email;
    public admin(){}
    
    public void setUSERNAME(String username){
        this.username=username;
    }
    
    public String getUSERNAME(){
        return this.username;
    }

    public void setPASSWORD(String password){
        this.password=password;
    }
    
    public String getPASSWORD(){
        return this.password;
    }

     public void setNAMA(String nama){
        this.nama=nama;
    }
    
    public String getNAMA(){
        return this.nama;
    }
    
    public void setLEVEL(String level){
        this.level=level;
    }
    
    public String getLEVEL(){
        return this.level;
    }

     public void setEMAIL(String email){
        this.email=email;
    }
    
    public String getEMAIL(){
        return this.email;
    }
   
}
