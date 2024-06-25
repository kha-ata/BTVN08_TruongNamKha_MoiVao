/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ArrayList;
/**
 *
 * @author DELL
 */
public class Thongtindonhang implements Comparable<Thongtindonhang>{
    private String orderid,ngaytao;
 private Khachhang khachhang;  //  static ArrayList<Thongtinsanpham> sanphamdadcchon= new ArrayList<>();
 private  ArrayList<Thongtinsanpham> listsanphamdaduocchon= new ArrayList<>();
 private Thongtinsanpham san=new Thongtinsanpham(null, null, 0);
    public Thongtindonhang(String orderid, String ngaytao, Khachhang khachhang,ArrayList<Thongtinsanpham> sanphamduocchon) {
        this.orderid = orderid;
        this.ngaytao = ngaytao;
        this.khachhang = khachhang;
        this.listsanphamdaduocchon=sanphamduocchon;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(String ngaytao) {
        this.ngaytao = ngaytao;
    }

    public Khachhang getKhachhang() {
        return khachhang;
    }

    public void setKhachhang(Khachhang khachhang) {
        this.khachhang = khachhang;
    }

   @Override
    public  int compareTo(Thongtindonhang o) {
        
        return Double.compare(this.san.getGia(),o.san.getGia());
        
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
        final Thongtindonhang other = (Thongtindonhang) obj;
        return Objects.equals(this.orderid, other.orderid);
    }
    
    
    

    
    
    
    
public  void listspdc(){
    for (Thongtinsanpham ob : this.listsanphamdaduocchon) {
        System.out.println(ob);
    }
}

    @Override
    public String toString() {
        return "Thongtindonhang{" + "orderid=" + orderid + ", ngaytao=" + ngaytao + ", khachhang=" + khachhang.toString()  + '}';
    }
   
    
    
}
