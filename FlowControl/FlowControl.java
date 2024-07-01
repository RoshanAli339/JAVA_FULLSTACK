class Question1 {
    public static void main(String[] args) {
        if (args.length == 1) {
            int a = Integer.parseInt(args[0]);
            if (a > 0)
                System.out.println("Positive");
            else if (a < 0)
                System.out.println("Negative");
            else
                System.out.println("Zero");
        } else if (args.length == 2) {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(a % 10 == b % 10);
        } else {
            System.out.println("Upto 2 arguments are only allowed!");
        }
    }
}

class Question2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        if ((a & 1) == 1)
            System.out.println("Odd");
        else
            System.out.println("Even");
    }
}

class Question3 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No values");
        } else {
            for (int i = 0; i < args.length - 1; i++)
                System.out.print(args[i] + ",");
            System.out.println(args[args.length - 1]);
        }
    }
}

class Question4 {
    public static void main(String[] args) {
        char c = 'r';
        char d = 'c';

        if (c > d)
            System.out.println(d + "," + c);
        else
            System.out.println(c + "," + d);
    }
}

class Question5 {
    public static void main(String[] args) {
        char a = '{';

        if (Character.isDigit(a))
            System.out.println("Digit");
        else if (Character.isLetter(a))
            System.out.println("Alphabet");
        else
            System.out.println("Special character");
    }
}

class Question6 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Only 2 arguments are allowed");
            return;
        }
        String gender = args[0];
        int age = Integer.parseInt(args[1]);

        switch (gender) {
            case "Female":
                if (age >= 1 && age <= 58)
                    System.out.println("Percentage of interest is 8.2%");
                else if (age >= 59 && age <= 100)
                    System.out.println("Percentage of interest is 9.2%");
                break;

            case "Male":
                if (age >= 1 && age <= 58)
                    System.out.println("Percentage of interest is 8.4%");
                else if (age >= 59 && age <= 100)
                    System.out.println("Percentage of interest is 10.5%");
                break;
        }
    }
}

class Question7 {
    public static void main(String[] args) {
        char c = 'a';

        if (Character.isLowerCase(c)) {
            System.out.println(Character.toUpperCase(c));
        } else if (Character.isUpperCase(c)) {
            System.out.println(Character.toLowerCase(c));
        }
    }
}

class Question8 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Only 1 character argument is allowed!");
            return;
        }
        char code = args[0].charAt(0);
        switch (code) {
            case 'R':
                System.out.println("Red");
                break;

            case 'B':
                System.out.println("Blue");
                break;

            case 'G':
                System.out.println("Green");
                break;

            case 'O':
                System.out.println("Orange");
                break;

            case 'Y':
                System.out.println("Yellow");
                break;

            case 'W':
                System.out.println("White");
                break;

            default:
                System.out.println("Invalid Code");
        }
    }
}

class Question9 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("only 1 argument is allowed!");
            return;
        }

        int month = Integer.parseInt(args[0]);
        switch (month) {
            case 1:
                System.out.println("january");
                break;

            case 2:
                System.out.println("february");
                break;

            case 3:
                System.out.println("march");
                break;

            case 4:
                System.out.println("april");
                break;

            case 5:
                System.out.println("may");
                break;

            case 6:
                System.out.println("june");
                break;

            case 7:
                System.out.println("july");
                break;

            case 8:
                System.out.println("august");
                break;

            case 9:
                System.out.println("september");
                break;

            case 10:
                System.out.println("october");
                break;

            case 11:
                System.out.println("november");
                break;

            case 12:
                System.out.println("december");
                break;

            default:
                System.out.println("invalid month");
        }
    }
}

class Question10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++)
            System.out.print(i + "\t");
        System.out.println();
    }
}

class Question11 {
    public static void main(String[] args) {
        for (int i = 23; i <= 57; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}

class Question12 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not Prime Number");
        }
    }
}

class Question13 {
    public static void main(String[] args) {
        for (int i = 10; i <= 99; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.println(i);
        }
    }
}

class Question14 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Only 1 argument allowed");
            return;
        }
        int num = Integer.parseInt(args[0]);

        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println(sum);

    }
}

class Question15 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please enter an integer number");
            return;
        }

        int n = Integer.parseInt(args[0]);

        for (int i = 1; i <= n; i++) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
        }
    }
}

class Question16 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please enter an integer");
            return;
        }

        int num = Integer.parseInt(args[0]);
        boolean negative = num < 0;
        num = negative ? -num : num;
        int rev = 0;

        while (num != 0) {
            rev = (rev * 10) + (num % 10);
            num /= 10;
        }

        rev = negative ? -rev : rev;

        System.out.println(rev);
    }
}

class Question17 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please enter an integer");
            return;
        }

        int num = Integer.parseInt(args[0]);
        boolean negative = num < 10;
        num = negative ? -num : num;
        int dup = num;
        int rev = 0;

        while (dup != 0) {
            rev = (rev * 10) + (dup % 10);
            dup /= 10;
        }

        rev = negative ? -rev : rev;
        num = negative ? -num : num;

        if (rev == num)
            System.out.println(num + " is a palindrome number");
        else
            System.out.println(num + " is not a palindrome number");

    }
}
