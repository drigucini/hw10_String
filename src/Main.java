public class Main {
    public static void main(String[] args) {
        task0();
        task1();
        task2();
        task3();
    }


    public static void task0 () {
        System.out.println("Task 1");

        //VIDEO 1 and 2
        String phone = "+7(985)432-82-87";
        //Ctrl + shift + Enter = add a semicolon or any other logical symbol
        phone = phone.replace("-","");
        phone = phone.replace(" ","");
        phone = phone.replace(")","");
        phone = phone.replace("(","");
        phone = phone.replace(",","");
        phone = phone.replace("_","");
        phone = phone.replace("+","");

        if (phone.length()==10) {
//            phone = '7' + phone;
        } else if (phone.length() > 11 || phone.length() < 10) {
            throw new RuntimeException("Wrong phone number format, there should be 10 symbols");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Phone number should start with 7");
        }
        System.out.println("phone = " + phone);
        // Ctrl Alt T = surround smth with an operator

        //VIDEO 3

        String expectedPhone = "79854328287";
        if (phone.equals(expectedPhone)) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
        // Ctrl / deactivates a line of code


    }
    public static void task1 () {
        System.out.println("\nTask 0, Theory");
        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Employee's full name is " + fullName);

    }

    public static void task2 () {
        System.out.println("\nTask 2");
        String fullName = "Ivan Ivanovich Ivanov";
        System.out.println("Employee's name for the report is " + fullName.toUpperCase());

    }

    public static void task3 () {
        System.out.println("\nTask 3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё","е");
        System.out.println("Данные ФИО сотрудника - " + fullName);
    }
}