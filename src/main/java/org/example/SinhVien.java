package org.example;

public class SinhVien {
    private String Ten;
    private int NamSinh;

    public String getTen() {
        // Dinh dang du lieu, truoc khi tra ve
        return this.Ten;
    }

    public void setTen(String ten) {
        // tiền xử lý
        // Kiểm duyệt dữ liệu
        this.Ten = ten;
    }

    public int getNamSinh () {
        return this.NamSinh;
    }

    public void setNamSinh (int namSinh) throws Exception {
        int year_now = java.time.Year.now().getValue();
        int tuoi = year_now - namSinh;
        if (tuoi < 18)
            throw new Exception("Lỗi nhập liệu!");
        this.NamSinh = namSinh;
    }

    public void Hello (){
        System.out.print("Hello World!");
    }
}
