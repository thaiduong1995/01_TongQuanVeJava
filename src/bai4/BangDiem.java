package bai4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class BangDiem {
    private ArrayList<ThiSinh> studentLists = new ArrayList<ThiSinh>();

    public ArrayList<ThiSinh> getStudentLists() {
        return studentLists;
    }

    public void setStudentLists(ArrayList<ThiSinh> studentLists) {
        this.studentLists = studentLists;
    }

    public void inputData() throws ParseException {
        System.out.println("Nhập bảng điểm thi:");
        for (int i = 0; i < 2; i++) {
            System.out.println("Nhập bảng điểm thí sinh thứ " + (i + 1) + ":");
            studentLists.add(new ThiSinh().inputData(new Scanner(System.in)));
        }
    }

    @Override
    public String toString() {
        String output = "Bảng điểm:\n";
        output += "STT\tSố báo danh\tHọ tên\t\t\t\t\t\t\tNgày sinh \tTổng điểm\n";
        for (int i = 0; i < this.studentLists.size(); i++) {
            float total = 0;
            for (MonThi object :
                    this.studentLists.get(i).getObjectLists()) {
                total += object.getDiem() * object.getHeSo();
            }
            output += String.format("%-3d\t%-11s\t%-30s\t%-10s\t%-4.2f\n", i + 1, this.studentLists.get(i).getSbd(),
                    this.studentLists.get(i).getHoTen(),
                    new SimpleDateFormat("dd/MM/yyyy").format(this.studentLists.get(i).getNgaySinh()), total);
        }
        return output;
    }
}
