/*
*  crated date: 04 thg 11, 2021
*  author: PhamTranQuocAnh
*/
package com.anhptq2008110037.kiemtragiuaky;
public class HocVien extends Nguoi {
    private String tenHocVien;
    private String diaChiHocVien;
    private float diemMonhoc1;
    private float diemMonhoc2;
    private int soLuongHV = 0;
    private float diemTB;
    
    HocVien(){};
    HocVien (float diemMonhoc1, float diemMonhoc2){
        this.diemMonhoc1 = diemMonhoc1;
        this.diemMonhoc2 = diemMonhoc2;
    }
    HocVien (String ten, String diaChi, float diemMonhoc1, float diemMonhoc2 ){
        super(ten, diaChi);
        this.diemMonhoc1 = diemMonhoc1;
        this.diemMonhoc2 = diemMonhoc2;
    

        
    }
    public String getTenHocVien() {
        return tenHocVien;
    }

    public String getDiaChiHocVien(){
        return diaChiHocVien;
    }

    private float setDiemTB(){
        diemTB = (diemMonhoc1 + diemMonhoc2) / 2;
        return diemTB;
    }
    public float getDiemTB(){
        return setDiemTB();
    }

    public void setDiemMonhoc1(float diemMonhoc1) {
        if (diemMonhoc1 >0 && diemMonhoc1 <10) {
            this.diemMonhoc1 = diemMonhoc1;
        } else  
            System.out.println("Vui lòng nhập lại");
    }
    public void setDiemMonhoc2(float diemMonhoc2) {
        if (diemMonhoc2 >0 && diemMonhoc2 <10) {
            this.diemMonhoc2 = diemMonhoc2;
        } else  
            System.out.println("Vui lòng nhập lại");
    }

    


    @Override
    public String toString() {
        return "Tên học viên: " + getTenHocVien() + " Địa chỉ học viên: " + getDiaChiHocVien() +
        " Điểm trung bình của học viên: " + diemTB;
    }
}
