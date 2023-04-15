package Ex6;

import java.util.*;

public class NumberofDays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year, month, days;

        do {
            System.out.println("Enter the year (non-negative integer): ");
            year = scan.nextInt();
        } while (year < 0);

        String monthStr = scan.nextLine();
        month = 0;
        while (month == 0) {
            System.out.println("Enter the month (Valid inputs: January, Jan., Jan, or 1): ");
            monthStr = scan.nextLine();
            monthStr = monthStr.toLowerCase();
            switch (monthStr) {
                case "january":
                case "jan.":
                case "jan":
                case "1":
                    month = 1;
                    break;
                case "february":
                case "feb.":
                case "feb":
                case "2":
                    month = 2;
                    break;
                case "march":
                case "mar.":
                case "mar":
                case "3":
                    month = 3;
                    break;
                case "april":
                case "apr.":
                case "apr":
                case "4":
                    month = 4;
                    break;
                case "may":
                case "may.":
                case "5":
                    month = 5;
                    break;
                case "june":
                case "jun.":
                case "jun":
                case "6":
                    month = 6;
                    break;
                case "july":
                case "jul.":
                case "jul":
                case "7":
                    month = 7;
                    break;
                case "august":
                case "aug.":
                case "aug":
                case "8":
                    month = 8;
                    break;
                case "september":
                case "sep.":
                case "sep":
                case "9":
                    month = 9;
                    break;
                case "october":
                case "oct.":
                case "oct":
                case "10":
                    month = 10;
                    break;
                case "november":
                case "nov.":
                case "nov":
                case "11":
                    month = 11;
                    break;
                case "december":
                case "dec.":
                case "dec":
                case "12":
                    month = 12;
                    break;
                default:
                    month = 0;
                    break;
            }
        }
        scan.close();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                days = 0;
                break;
        }

        System.out.printf("The month %d/%d has %d days.\n", month, year, days);

        System.exit(0);
    }
}