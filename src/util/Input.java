package util;

import java.util.Scanner;

public class Input {
    private static Scanner sc = new Scanner(System.in);
    public static int getValue(String message){
        int intNumber;
        while (true){
            try{
                System.out.print(message);
                intNumber = Integer.parseInt(sc.nextLine());
                if(intNumber >= 0){
                    return intNumber;
                }
            }catch(Exception exception) {
                System.out.println("nInput invalid!");
            }
        }
    }
    public static String getString(String message){
        String result;
        while (true){
            try{
                System.out.print(message);
                result = sc.nextLine();
                if (result.isEmpty()){
                    throw new Exception();
                }
                return result;
            }catch(Exception check){
                System.out.println("Your Input invalid!");
            }
        }
    }
    public static boolean getBoolean(String message){
        boolean result;
        String input;
        while (true){
                System.out.print(message);
                input = sc.nextLine();
                if(input.equals("true")){
                    return true;
                } else if (input.equals("false")){
                    return false;
                }
                System.out.println("Your Input invalid!");
        }
    }
}
