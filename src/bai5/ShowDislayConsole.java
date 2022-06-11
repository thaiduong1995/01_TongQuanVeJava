package bai5;

import java.text.ParseException;

public class ShowDislayConsole {
    public static void main(String[] args) throws ParseException {
        QuanLyCanBo quanLyCanBo = new QuanLyCanBo();
        quanLyCanBo.inputData();
        System.out.println(quanLyCanBo);
    }
}
