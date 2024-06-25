/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author DELL
 */
public class Thongtinsanpham implements Comparable<Thongtinsanpham>{
    private String ten,id;
    private double gia;

    public Thongtinsanpham(String ten, String id, double gia) {
        this.ten = ten;
        this.id = id;
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Thongtinsanpham other = (Thongtinsanpham) obj;
        return Objects.equals(this.id, other.id);
    }

    

 

    @Override
    public int compareTo(Thongtinsanpham o) {
        
        return Double.compare(gia, o.gia);
        
    }

    @Override
    public String toString() {
        return "Thongtinsanpham{" + "ten=" + ten + ", id=" + id + ", gia=" + gia + '}';
    }
 
    
}
