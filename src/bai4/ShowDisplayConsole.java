package bai4;

import java.text.ParseException;

public class ShowDisplayConsole {
    public static void main(String[] args) throws ParseException {
        BangDiem bangDiem = new BangDiem();
        bangDiem.inputData();
        System.out.println(bangDiem);
    }
}
