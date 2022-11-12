import java.util.Arrays;

public class MenuPrinter {
    public static int print(){
        int Choice = Integer.parseInt(Prompter.prompt( "Press 1 to Add User: \n"+"Press 2 to Delete: \n"+ "Press 3 to update user: \n"+ "Press 4 to List user: "));
        String nam, sur, ema, dob,ID, email;


        switch (Choice) {
            case 1:
                nam = Prompter.prompt("What is your name: ");
                sur = Prompter.prompt("What is your surname: ");
                ema = Prompter.prompt("What is your email: ");
                dob = Prompter.prompt("What is your date of birth YYYY/MM/DD: ");
                ID = Prompter.prompt("What is your id: ");
                if(DateValid.isValid(dob) == true){
                UserDAO.createUser(nam, sur, ema, dob,ID);
                int age = DateValid.AgeCal(dob);
                System.out.println(nam + " is "+ age + " year old");
                System.out.println("Hello "+ nam +" "+ sur + " ,your details have been saved to the database");

                break;}else { System.out.println("DATE OF BIRTH INCORRECTLY ENTERED PLEASE ADD USER AGAIN");
                     break;
                }



            case 3:



            case 4:
            int choose = Integer.parseInt(Prompter.prompt("Press 1 to find all users \n" + "Press 2 to find user by email"));
            switch(choose) {
                case 1:
                    UserDAO.findAll();
                    break;
                case 2:
                    email = Prompter.prompt("Enter the email: ");
                    String[] userFound = UserDAO.getUserByEmail(email);
                    System.out.println(Arrays.toString(userFound));

            }

        }

        return 0;
    }
}