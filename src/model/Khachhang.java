/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.Scanner;

public  class Khachhang extends Person{
    private String nation;
    public Khachhang(String ten, String tuoi, String gioitinh,String nation) {
        super(ten, tuoi, gioitinh);
        this.nation=nation;
    }
   
    

    @Override
    public String ngonNgu(String nation) {
        
        switch (nation) {
            case "VN":
                return "vietnam";
                
            case "USA":
                 return "USA";
            case "jp":
                return "JaPan";
            default:
                throw new AssertionError();
        }
        
    }

    @Override
    public String toString() {
        return "Khachhang{"+super.toString() + "nation=" + ngonNgu(nation) +'}';
    }

    
    
    
    
}
