import java.time.LocalDate;
public class DateValid {
    public static boolean isValid(String value){
        if (value.length() != 10){
            return false;
        }

        String [] pieces = value.split("/");

        if(pieces.length != 3){
            return false;
        }

        int month = Integer.parseInt(pieces[1]);
        int year = Integer.parseInt(pieces[0]);
        int day = Integer.parseInt(pieces[2]);

        if(year < 1900 || year > 2022)
            return false;

        if(month < 1 || month > 12)
            return false;

        if (day < 1 || day > 31)
            return false;


    return true;
    }

    public static int AgeCal(String value){
        LocalDate currentdate = LocalDate.now();
        int currentYear = currentdate.getYear();
        String [] pieces = value.split("/");

        int year = Integer.parseInt(pieces[0]);

        int UserAge = currentYear - year;
        return UserAge;




    }
}
