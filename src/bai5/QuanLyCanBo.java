package bai5;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyCanBo {
    private ArrayList<CanBo> staffLists = new ArrayList<>();

    public ArrayList<CanBo> getStaffLists() {
        return staffLists;
    }

    public void setStaffLists(ArrayList<CanBo> staffLists) {
        this.staffLists = staffLists;
    }

    public QuanLyCanBo inputData() throws ParseException {
        for (int i = 0; i < 1; i++) {
            System.out.println("Nhập thông tin cán bộ thứ " + (i + 1));
            this.staffLists.add(new CanBo().inputData(new Scanner(System.in)));
        }
        return this;
    }

    @Override
    public String toString() {
        String output = "Thông tin cán bộ và lương:\n";
        output += "STT\tMã cán bộ\tHọ tên\t\t\t\t\t\t\tNgày sinh\tSố giờ làm việc trong tháng" +
                "\tSố giờ làm thêm\tLương dự kiến\n";
        for (int i = 0; i < this.staffLists.size(); i++) {
            int salary = this.staffLists.get(i).getSoNC() * 350000 + this.staffLists.get(i).getGioLT() * 45000;
            output += String.format("%-3d\t%-91s%\t-11s\n", i + 1, this.staffLists.get(i),
                    new DecimalFormat("###,###,###").format(salary));
        }
        return output;
    }
}
