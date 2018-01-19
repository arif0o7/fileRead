import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static int main(String[] args) throws IOException, ParseException, Exception {
        String time = "07:50:00";
        DateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        Calendar calendar = Calendar.getInstance();
        try {

            DateFormat outputFormat = new SimpleDateFormat("HH:mm");
            DateFormat inputFormat = new SimpleDateFormat("HH:mm");

            String inputText = "05:00";
            Date date = inputFormat.parse(inputText);
            String outputText = outputFormat.format(date);
            System.out.println(outputText);

//            Date date = sdf.parse(sdf.format(time)).getTime();
//            System.out.println("Date and Time: " + date);
//
//            long systime = sdf.parse(sdf.format(calendar.getTime())).getTime();
//            System.out.println(systime);
//            System.out.println(sdf.format(calendar.getTime()));
//
//            if (systime > date){
//                System.out.println("systime is grater");
//            }else {
//                System.out.println("date is grater");
//            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return 0;
    }

                                    /* ROUTER NUMBER GENERATOR*/
//        String rn="12345678";
//        char[] cars = rn.toCharArray();
//        int[] factors = {5,7,1,5,7,1,5,7};
//        int sum = 0;
//        for(int i=0; i<8; i++){
//            sum += Integer.parseInt(String.valueOf(cars[i])) * factors[i];
//        }
//        int mod = (sum % 10);
//        int ch = ((mod == 0)?0:10) - mod;
//
//        System.out.println(ch);
//        return ch;

                                    /* ICB FILE READ AND TRIM*/
//        BufferedReader br = new BufferedReader(new FileReader("D:\\fileRead\\src\\201710180001AIF.TXT"));
//
//        try{
//            String readLine;
//            while ((readLine = br.readLine()) != null && readLine.length() > 50) {
//                System.out.println(readLine);
//
//                System.out.println(readLine.substring(0,1));
//                System.out.println(readLine.substring(1,10));
//                System.out.println(readLine.substring(10,25));
//                System.out.println(readLine.substring(25,105));
//                System.out.println(readLine.substring(105,117));
//                System.out.println(readLine.substring(117,167));
//                System.out.println(readLine.substring(167,217));
//                System.out.println(readLine.substring(217,267));
//                System.out.println(readLine.substring(267,317));
//                System.out.println(readLine.substring(317,318));
//                System.out.println(readLine.substring(318,321));
//
//            }
//        }finally {
//            br.close();
//        }


//        String input = "1999046";
//        DateFormat fmt1 = new SimpleDateFormat("yyyyDDD");
//        Date date = fmt1.parse(input);
//        DateFormat fmt2 = new SimpleDateFormat("MM/dd/yyyy");
//        String output = fmt2.format(date);
//        System.out.println(output);
//    }
}