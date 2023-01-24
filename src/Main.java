public class Main {
    public static void main(String[] args) {
        task0();
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
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
        System.out.println("\nTask 1");
        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Employee's full name is " + fullName);

    }

    public static void task2 () {
        System.out.println("\nTask 2");
    }

    public static void task3 () {
        System.out.println("\nTask 3");
    }

    public static void task4 () {
        System.out.println("\nTask 4");
    }

    public static void task5 () {
        System.out.println("\nTask 5");
    }

    public static void task6 () {
        System.out.println("\nTask 6");
    }

    public static void task7 () {
        System.out.println("\nTask 7");
    }

    public static void task8 () {
        System.out.println("\nTask 8");
    }
}