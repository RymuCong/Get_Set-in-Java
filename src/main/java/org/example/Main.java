package org.example;
import java.util.Scanner;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) throws Exception {
        var scan = new Scanner(System.in);
        SinhVien a = new SinhVien();

        System.out.print("Nhập tên: ");
        var ten = scan.nextLine();
        a.setTen(ten);

        while (true)
        {
            try {
                System.out.print("Nhập năm sinh: ");
                var namSinh = scan.nextInt();
                a.setNamSinh(namSinh);
                break;
            } catch (Exception e) {
                System.out.print("Ối dồi ơi! Nhập ngu thế !\n");
                continue;
            }
        }


    }
}