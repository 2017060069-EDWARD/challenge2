import java.util.Arrays;

public class UserDAO {

    public static String [][] database = new String[100][5];
    public static int position = 0;


        public static void createUser(String name, String surname, String email, String dob, String id){
            database[position] = new String[]{name,surname,email,dob,id};
            position++;
        }

        public static String[] getUserByEmail(String email){
            for(String[] row :database){
                if(null != row[2] && email.equals(row[2])){
                    return row;
                }
            }
            return null;
        }

    public static String[][] findAll(){
            for(int i=0;i<position;i++)
                System.out.println(Arrays.toString(database[i]));
        return database;
    }


    public static void updateUser(
            String name,
            String surname,
            String email,
            String dob,
            String id){
        //PLEASE CODE ME

    }

    public static void deleteUser(String email){
        //PLEASE CODE ME

    }
 }
