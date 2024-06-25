/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public abstract class Person {
    protected String ten,tuoi,gioitinh;

    public Person(String ten, String tuoi, String gioitinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

   
    public abstract String ngonNgu(String nation);
    @Override
    public String toString() {
        return "Person{" + "ten=" + ten + ", tuoi=" + tuoi + ", gioitinh=" + gioitinh + '}';
    }
    
}
