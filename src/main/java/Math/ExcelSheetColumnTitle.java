package Math;

public class ExcelSheetColumnTitle {

    public static String convertToTitle(int columnNumber) {


        int no= columnNumber;
        int a=65;
        char x= (char) a;
        String result = "";
        while(columnNumber>0)
        {
            char c= (char)  (a + (columnNumber-1)%26);
            result= Character.toString(c) + result;
            columnNumber= (columnNumber-1)/26;
        }
        return result;
    }

    public static void main(String[] z){

        System.out.println(convertToTitle(703));
    }
}
