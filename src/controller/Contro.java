
package controller;
import java.util.ArrayList;
import java.util.Scanner;

import model.Khachhang;
import model.Person;
import model.Thongtindonhang;
import model.Thongtinsanpham;

public class Contro {
    private static ArrayList<Thongtindonhang> ttdh=new ArrayList<>();
    private static ArrayList<Thongtinsanpham> cuahang= new ArrayList<>();
    private static ArrayList<Khachhang> listkhachhang= new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
    }
    public static void addSanPham(){
       
        System.out.println("ten SP");
        String ten=sc.nextLine();
        System.out.println("id");
        String id= sc.nextLine();
        System.out.println("gia");
        double gia=Double.parseDouble(sc.nextLine());
        
                
        Thongtinsanpham sanpham=new Thongtinsanpham(ten, id, gia);
        cuahang.add(sanpham);
    }
    
    
    public static void capnhapgia (){
        
        System.out.println("id");
        String id=sc.nextLine();
        Thongtinsanpham tt= new Thongtinsanpham(null, id, 0);
        
               
                for (Thongtinsanpham tungsanpham: cuahang) {
            if(tungsanpham.getId().compareTo(tt.getId())==0) {
                System.out.println("gia moi:");
                Double giamoi=Double.parseDouble(sc.nextLine());
                tungsanpham.setGia(giamoi);
                System.out.println("thanh cong");
            } else {
                System.out.println("khong ton tai san pham");
            
            }
        }               
    }
    
    
    public static Thongtinsanpham searchsanpham(Thongtinsanpham tt){
        for (Thongtinsanpham tungsanpham: cuahang) {
            if(tungsanpham.getId().compareTo(tt.getId())==0) {
                System.out.println("thanh cong");
                return tungsanpham;
            }
        }
        System.out.println("khong ton tai san pham");
        return null;
    }
    
    
    public static void incuahang(){
        for (Thongtinsanpham thongtincuahang : cuahang) {
            System.out.println(thongtincuahang.toString());
        }
    }
    
    
    public static Khachhang addkhachhang(){
        System.out.println("ten khach hang:");
        String ten=sc.nextLine();
        System.out.println("tuoi");
        String tuoi= sc.nextLine();
        System.out.println("gioi tinh");
        String gioitinh=sc.nextLine();
        System.out.println("nation(VN,USA,jp)");
        String nation=sc.nextLine();
        Khachhang kh=new Khachhang(ten, tuoi, gioitinh, nation);
        listkhachhang.add(kh);
        return kh;
    }
    
    
    public static void adddonhang(){
        Khachhang khachhang= addkhachhang();
        System.out.println("order id:");
        String orderid=sc.nextLine();
        System.out.println("ngay tao");
        String ngaytao=sc.nextLine();
        int x=1;
        ArrayList<Thongtinsanpham> listsanphamduocchon = new ArrayList<>();
        do{
        System.out.println("id san pham duoc chon");
        String id=sc.nextLine();
        Thongtinsanpham sanphamduocchon=new Thongtinsanpham(null, id, 0);
        
        sanphamduocchon=searchsanpham(sanphamduocchon);
        listsanphamduocchon.add(sanphamduocchon);
            System.out.println("chon 1 de chon them san pham,0 de ket thuc");
            x= Integer.parseInt(sc.nextLine());
        }while (x!=0);
        Thongtindonhang addonhang= new Thongtindonhang(orderid, ngaytao, khachhang, listsanphamduocchon);
        
        ttdh.add(addonhang);
    }
    
    
    public static void indonhangtheoid (){
        
        System.out.println("id");
        String orderid=sc.nextLine();
        int x=0,y=0;
         
        
               
                for (Thongtindonhang iddonhang: ttdh) {
                   
                   
            if(iddonhang.getOrderid().equals(orderid)) {
                System.out.println(iddonhang.toString());
                iddonhang.listspdc();
                x=1;
            } 
            
        }               
//                for (int i = 0; i < ttdh.size(); i++) {
//            if(ttdh.get(i).getOrderid().equals(orderid));
//                    System.out.println(ttdh.get(i).toString());
//                    x=1;
//        }
                if(x==0) System.out.println("khong ton tai don hang");
    }
    public static void xapxepsanpham(){
        int n=cuahang.size();
        Thongtinsanpham temp=new Thongtinsanpham(null,null,0);
        for (int i = 0; i < (n-1); i++) {
            for (int j = 0; j < (n-i-1); j++) {
                
               int t= cuahang.get(j).compareTo(cuahang.get(j+1));
               if(t>0){
                   temp=cuahang.get(j);
                   cuahang.set(j, cuahang.get(j+1));
                   cuahang.set(j+1, temp);
               }
            }
        }
    }
    public static void inkhachhang(){
        for (Khachhang khachhang : listkhachhang) {
            System.out.println(khachhang.toString());
            
        }
    }
    
    public static void menu(){
        int x=0;
        do{
        System.out.println("1.add san pham;2.cap nhap gia san pham;3.danh sach san pham co san trong cua hang");
        System.out.println("4.tao don hang;5.in don hang theo id;6.sap xep gia san pham tang dan;7.in ra list khach hang");
        System.out.println("8.out menu");
        x=Integer.parseInt(sc.nextLine());
            switch (x) {
                case 1:
                    addSanPham();
                    break;
                case 2:
                    capnhapgia();
                    break;
                case 3:
                    incuahang();
                    break;
                case 4:
                    adddonhang();
                    break;
                case 5:
                    indonhangtheoid();
                    break;
                case 6: 
                    xapxepsanpham();
                    break;                  
                case 7:
                    inkhachhang();
                    break;
                default:
                    throw new AssertionError();
            }
        }while(x!=8);
    }
    
}
