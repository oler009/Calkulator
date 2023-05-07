import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s=scanner.nextLine();
        s=s.replaceAll("\\s+","");

        String[] stringToIntPlus = s.split("[+]");
        String[] stringToIntMinus = s.split("-");
        String[] stringToIntDelit = s.split("/");
        String[] stringToIntMojit = s.split("[*]");
        if(stringToIntPlus.length == 2)
        {
            int[] pervoeInt =Convertcicloandproverka(stringToIntPlus[0]);
            int[] VtoroeInt =Convertcicloandproverka(stringToIntPlus[1]);
            if (pervoeInt[1] != 3 & VtoroeInt[1] != 3 & pervoeInt[1] == VtoroeInt[1] ) {

                if(pervoeInt[1] == 1 | VtoroeInt[1] == 1)
                    System.out.println((pervoeInt[0] + VtoroeInt[0]));
                else
                    System.out.println(Convertcicloandproverka(pervoeInt[0] + VtoroeInt[0]));

            }
            else {
                System.out.println("throws Exception");
            }
            
        } else if(stringToIntMinus.length == 2) {
            int[] pervoeInt =Convertcicloandproverka(stringToIntMinus[0]);
            int[] VtoroeInt =Convertcicloandproverka(stringToIntMinus[1]);
            if (pervoeInt[1] != 3 & VtoroeInt[1] != 3 & pervoeInt[1] == VtoroeInt[1] ) {

                if(pervoeInt[1] == 1 | VtoroeInt[1] == 1)
                    System.out.println((pervoeInt[0] - VtoroeInt[0]));
                else
                    System.out.println(Convertcicloandproverka(pervoeInt[0] - VtoroeInt[0]));

            }
            else {
                System.out.println("throws Exception");
            }
        }
        else if(stringToIntDelit.length == 2) {
            int[] pervoeInt =Convertcicloandproverka(stringToIntDelit[0]);
            int[] VtoroeInt =Convertcicloandproverka(stringToIntDelit[1]);
            if (pervoeInt[1] != 3 & VtoroeInt[1] != 3 & pervoeInt[1] == VtoroeInt[1] ) {

                if(pervoeInt[1] == 1 | VtoroeInt[1] == 1)
                    System.out.println((pervoeInt[0] / VtoroeInt[0]));
                else
                    System.out.println(Convertcicloandproverka(pervoeInt[0] / VtoroeInt[0]));

            }
            else {
                System.out.println("throws Exception");
            }
        }
        else if(stringToIntMojit.length == 2) {
            int[] pervoeInt =Convertcicloandproverka(stringToIntMojit[0]);
            int[] VtoroeInt =Convertcicloandproverka(stringToIntMojit[1]);
            if (pervoeInt[1] != 3 & VtoroeInt[1] != 3 & pervoeInt[1] == VtoroeInt[1] ) {

                if(pervoeInt[1] == 1 | VtoroeInt[1] == 1)
                    System.out.println((pervoeInt[0] * VtoroeInt[0]));
                else
                    System.out.println(Convertcicloandproverka(pervoeInt[0] * VtoroeInt[0]));

            }
            else {
                System.out.println("throws Exception");
            }
        }
        else System.out.println("throws Exception");
        scanner.close();
        }
    public static int[] Convertcicloandproverka(String cnislo){
        int[] cnisloArr = new int[255];
        if (cnislo.equals("I") | cnislo.equals("II") | cnislo.equals("III") | cnislo.equals("IV") | cnislo.equals("V") | cnislo.equals("VI") | cnislo.equals("VII") | cnislo.equals("VIII") | cnislo.equals("IX") | cnislo.equals("X"))
        {
            cnisloArr[0] = 0;
            cnisloArr[1] = 2;
            switch (cnislo) {
                case "I" -> cnisloArr[0] = 1;
                case "II" -> cnisloArr[0] = 2;
                case "III" -> cnisloArr[0] = 3;
                case "IV" -> cnisloArr[0] = 4;
                case "V" -> cnisloArr[0] = 5;
                case "VI" -> cnisloArr[0] = 6;
                case "VII" -> cnisloArr[0] = 7;
                case "VIII" -> cnisloArr[0] = 8;
                case "IX" -> cnisloArr[0] = 9;
                case "X" -> cnisloArr[0] = 10;
                default -> cnisloArr[1] = 3;
            }


        }
        else {
            try {
                int i = Integer.parseInt(cnislo);
                if(i <11) {

                    cnisloArr[0] = i;
                    cnisloArr[1] = 1;
                }
                else {
                    cnisloArr[0] = 0;
                    cnisloArr[1] = 3;
                }
            } catch (NumberFormatException nfe) {
                cnisloArr[0] = 0;
                cnisloArr[1] = 3;
            }
        }
        return cnisloArr;

    }
    public static String Convertcicloandproverka(Integer cnislo){
        String cnisloString ="";
        if(cnislo > 90 & cnislo < 100)
        {
            cnisloString="XC";
            cnislo -=90;
        } else if (cnislo > 80) {
            cnisloString="LXXX";
            cnislo -=80;
        } else if (cnislo > 70) {
            cnisloString="LXX";
            cnislo -=70;
        } else if (cnislo > 60) {
            cnisloString="LX";
            cnislo -=60;
        } else if (cnislo > 50) {
            cnisloString="L";
            cnislo -=50;
        } else if (cnislo > 40) {
            cnisloString="XL";
            cnislo -=40;
        } else if (cnislo > 30) {
            cnisloString="XXX";
            cnislo -=30;
        } else if (cnislo > 20) {
            cnisloString="XX";
            cnislo -=20;
        }

        switch (cnislo) {
            case 1 -> cnisloString += "I";
            case 2 -> cnisloString += "II";
            case 3 -> cnisloString += "III";
            case 4 -> cnisloString += "IV";
            case 5 -> cnisloString += "V";
            case 6 -> cnisloString += "VI";
            case 7 -> cnisloString += "VII";
            case 8 -> cnisloString += "VIII";
            case 9 -> cnisloString += "IX";
            case 10 -> cnisloString += "X";
            case 11 -> cnisloString += "XI";
            case 12 -> cnisloString += "XII";
            case 13 -> cnisloString += "XIII";
            case 14 -> cnisloString += "XIV";
            case 15 -> cnisloString += "XV";
            case 16 -> cnisloString += "XVI";
            case 17 -> cnisloString += "XVII";
            case 18 -> cnisloString += "XVIII";
            case 19 -> cnisloString += "XIX";
            case 20 -> cnisloString += "XX";
            default -> cnisloString = "throws Exception";
        }
        if(cnisloString.equals("LXXXXX")) cnisloString = "C";
        if(cnisloString.equals("LXXXX")) cnisloString = "XC";

        return cnisloString;
    }
    }
