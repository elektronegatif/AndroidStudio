/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author sefa_
 */
public class AndroidStudioJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean st = true;
        System.out.println(" ____  ____  ____  ____ \n"
                + "||S ||||E ||||F ||||A ||\n"
                + "||__||||__||||__||||__||\n"
                + "|/__\\||/__\\||/__\\||/__\\|");
        while (st) {
            System.out.println("******************************************");
            Scanner scan = new Scanner(System.in); //add import java.util.Scanner
            System.out.println("USER INTERFACE");
            System.out.println(" 1-) Start \n 2-) Variable \n 3-) Variable Write \n "
                    + "4-) Max Value \n 5-) Examples 1 \n 6-) Variable Convert \n 7-) Final Value \n "
                    + "8-) Char Convert \n 9-) a++ \n 10-) Examples 2 \n 11-) Examples 3 \n "
                    + "12-) EXAMPLES 4 \n 13-) Arrays \n 14-) LIST \n 15-) HASH SET \n 16-) HASH MAP \n 17-) OPERATORS \n "
                    + "18-) AND(&&) OR(||) \n 19-) IF-ELSE \n 20-) Examples 5 \n 21-) SWITCH-CASE \n "
                    + "22-) LOOPS \n 23-) EXAMPLES 6 \n 24-) Metod \n "
                    + "25-) Class ~ Constructor \n 26-) Getter - Setter \n QUİT = ANY LETTER");
            System.out.println("*******************************************");
            System.out.print(">USE: ");
            String use = scan.nextLine();
            if (use.equals("1")) {
                System.out.println("********************* Start *******************");
                System.out.println("Hello World"); //print
                System.out.println(5 * 10); //simple calcu
            } else if (use.equals("2") || use.equals("3")) {
                System.out.println("********************* Variable *******************");
                //variable >> int-float-double-string-char-boolean
                int numberInt = 10;
                // float numberFloat = 10.0; >> wrong because double
                float numberFloat = 10.2f; // f 
                double numberDouble = 10.2; // or numberDouble = 10.2d;
                //float - double difference ~  Double = 64 bit - 8byte ~ Float = 32 bit - 4 byte
                boolean bool = true;
                boolean bool2 = false;
                char c = 'c';
                String s = "Hello";
                System.out.println("********************* Variable Write *****************");

                // Write
                System.out.println("NumberInt : " + numberInt + "\n"
                        + "NumberDouble: " + numberDouble + "\n"
                        + "NumberFloat: " + numberFloat + "\n"
                        + "Boolean: " + bool + "\n"
                        + "Boolean: " + bool2 + "\n"
                        + "String:" + s + "\n"
                        + "Char:" + c);
            } else if (use.equals("4")) {
                System.out.println("******************* Max Value ********************");
                // Max Value
                //int
                System.out.println(Integer.MAX_VALUE);
                //double
                System.out.println(Double.MAX_VALUE);
                //float
                System.out.println(Float.MAX_VALUE);
                //long
                System.out.println(Long.MAX_VALUE);

                System.out.println(Byte.MAX_VALUE);

                //byte < short < int < long 
            } else if (use.equals("5")) {
                System.out.println("**************** Examples 1 ***********************");
                // examples
                // 1-) Circumference
                float pi = 3.14f;
                int r = 15;
                System.out.println(2 * pi * r);

            } else if (use.equals("6")) {
                System.out.println("**************** Variable Convert ************************");
                // variable convert

                int variableInt = 5;
                double variableDouble = 20.5;
                float variableFloat = 30.3f;
                float result;

                variableInt = (int) variableDouble;
                System.out.println(variableInt);

                variableDouble = (double) variableFloat;
                System.out.println(variableDouble);

                variableFloat = (float) variableInt;
                System.out.println(variableFloat);

                variableDouble = (double) variableInt;
                System.out.println(variableDouble);

                float resultF;
                int resultI;

                resultF = (float) (variableInt + variableInt);
                System.out.println("Result: " + resultF);

                resultI = (int) (variableFloat + variableFloat);
                System.out.println("ResultI: " + resultI);
            } else if (use.equals("7")) {
                System.out.println("***************** Final Value ***********************");

                //Final value
                final double pi2 = 3.14;

                System.out.println(pi2);

                //pi2 = 3.34; //error
            } else if (use.equals("8")) {
                System.out.println("**************** Char Convert ***********************");

                //char convert
                char cha = 100;

                System.out.println(cha);

                //character corresponding to the number
            } else if (use.equals("9")) {
                System.out.println("*************** a++ ************************");

                int aplus = 2;
                System.out.println("Aplus = " + aplus);
                aplus += 1;
                System.out.println("NewAplus = " + aplus);
                int xPlus = ++aplus;
                System.out.println("xPlus = " + xPlus);
            } else if (use.equals("10")) {

                System.out.println("**************** Examples 2 ************************");

                // examples
                // 2-) Game healt count
                int healt = 3;
                System.out.println("Healt: " + healt);
                //if trigger enemy
                healt--;
                System.out.println("NewHealt: " + healt);

                //input 
                //Scanner scan = new Scanner(System.in); //add import java.util.Scanner
                System.out.println("Enter");
                int age = scan.nextInt();

                System.out.println("Age: " + age);

                System.out.println("Enter pi");

                float piE = scan.nextFloat();

                System.out.println("Pi: " + piE); //3,14 " , "

                //if side by side
                System.out.print("Age: " + age); //println != print
            } else if (use.equals("11")) {
                System.out.println("************** Examples 3 **************************");

                // examples
                // 3-) number change
                System.out.print("Enter number 1: ");
                int number = scan.nextInt();
                System.out.print("Enter number2: ");
                int number2 = scan.nextInt();
                int temp = 0;
                temp = number;
                number = number2;
                number2 = temp;
                System.out.println(" New number1: " + number + " New number2: " + number2);
            } else if (use.equals("12")) {
                System.out.println("**************** EXAMPLES 4 ************************");
                // examples
                // 4-) Find hip
                System.out.print("Enter a: ");
                int aB = scan.nextInt();
                System.out.print("Enter b: ");
                int bB = scan.nextInt();
                double resultB = 0;

                resultB = Math.sqrt((aB * aB) + (bB * bB));

                System.out.println("Result: " + resultB);
            } else if (use.equals("13")) {
                System.out.println("*************** Arrays *************************");
                //Arrays

                //Create 1
                String[] myStringArray = new String[3];

                myStringArray[0] = "James"; //start array index = 0
                myStringArray[1] = "Harry";
                myStringArray[2] = null;
                //myStringArray[3] = "SS"; // Array Index Out Of Bounds

                System.out.println(myStringArray[0]);
                System.out.println(myStringArray[1]);
                System.out.println(myStringArray[2]);
                //System.out.println(myStringArray[3]); // Array Index Out Of Bounds

                //Create 2
                int[] intArray = {1, 2, 3, 4, 5};
                //System.out.println(intArray[5]); //error because index != 5 index = 4
                // 1 2 3 4 5
                // 0 1 2 3 4
                System.out.println("Index{4}:" + intArray[4]);
            } else if (use.equals("14")) {
                System.out.println("**************** LIST ************************");

                //List
                ArrayList<String> myFavFruit = new ArrayList<String>();

                //add
                myFavFruit.add("Apple");
                myFavFruit.add("Melon");
                myFavFruit.add("Pear");

                System.out.println("--- Add ---");

                System.out.println(myFavFruit.get(1)); //enter index number

                //remove
                System.out.println("--- Remove ---");
                myFavFruit.remove(1); //enter index number
                System.out.println(myFavFruit.get(1));

                //change index item
                System.out.println("--- Change Item ---");
                myFavFruit.add(1, "Orange");
                System.out.println(myFavFruit.get(1));
            } else if (use.equals("15")) {
                //HashSet
                System.out.println("****************** HASH SET **********************");

                HashSet<String> hasString = new HashSet<>();

                hasString.add("Banana");
                hasString.add("Apple");
                hasString.add("Banana"); //banana add hasString so size item = 2

                System.out.println("HasString Size: " + hasString.size());
            } else if (use.equals("16")) {
                System.out.println("****************** HASH MAP **********************");

                HashMap<String, String> myHashMap = new HashMap<String, String>();
                //key and value = String, String
                myHashMap.put("name", "James");
                myHashMap.put("fruit", "Apple");
                myHashMap.put("Code", "Java");
                System.out.println("----------Write Sout---------");
                System.out.println("Enter key");
                String key = scan.next(); //input key
                System.out.println(myHashMap.get(key));

                //HashMap<String, int> demoHashMap = new HashMap<String, int>(); error bucause int primitive type
                HashMap<String, Integer> demoHashMap = new HashMap<String, Integer>();
            } else if (use.equals("17")) {
                //operators
                System.out.println("****************** OPERATORS **********************");

                byte aOp = 5;
                byte bOp = 20;
                System.out.println("****************** OPERATORS WRITE **********************");
                System.out.println("a=5 > b=20" + " >> " + (aOp > bOp));
                System.out.println("a < b" + " >> " + (aOp < bOp));
                System.out.println("a >= b" + " >> " + (aOp >= bOp));
                System.out.println("a <= b" + " >> " + (aOp <= bOp));
                System.out.println("a == b" + " >> " + (aOp == bOp));
                System.out.println("a != b" + " >> " + (aOp != bOp));
            } else if (use.equals("18")) {
                System.out.println("****************** AND(&&) OR(||) **********************");

                System.out.println("(5 > 3) && (5 > 4)" + " >> " + ((5 > 3) && (5 > 4)));
                System.out.println("(5 > 3) && (5 < 4)" + " >> " + ((5 > 3) && (5 < 4)));
                System.out.println("(5 > 3) || (5 > 4)" + " >> " + ((5 > 3) || (5 > 4)));
                System.out.println("(5 > 3) || (5 < 4)" + " >> " + ((5 > 3) || (5 < 4)));
            } else if (use.equals("19")) {
                System.out.println("****************** IF-ELSE **********************");

                if (5 > 4) {
                    System.out.println("5 > 4");
                } else {
                    System.out.println("Not");
                }
                if (5 < 4) {
                    System.out.println("5 < 4");
                } else if (5 > 4) {
                    System.out.println("Else if 5 > 4");
                }
            } else if (use.equals("20")) {
                System.out.println("************** Examples 5 **************************");

                // examples
                // 5-) Age ~ 18
                System.out.println("How old are you?");
                int input_age = scan.nextInt(); //Scanner scan = new Scanner(System.in);
                int bill = 0;
                if (input_age >= 18) {
                    System.out.println("Enter a bar");
                    System.out.println("Drink?(beer, water, cola or empty)");
                    Scanner sc = new Scanner(System.in);
                    String drink = sc.nextLine();
                    System.out.println("....");
                    if (drink.equals("beer")) {
                        bill = 10;
                        System.out.println("Bill = " + bill);
                    } else if (drink.equals("water")) {
                        bill = 3;
                        System.out.println("Bill = " + bill);
                    } else if (drink.equals("cola")) {
                        bill = 4;
                        System.out.println("Bill = " + bill);
                    } else {
                        System.out.println("Bill = 0");
                    }
                } else {
                    System.out.println("Get out...");
                }
            } else if (use.equals("21")) {
                System.out.println("************** SWITCH-CASE **************************");

                System.out.println("Enter a letter");
                char alpha_index_letter = scan.next().charAt(0);

                switch (alpha_index_letter) {
                    case 'a':
                        System.out.println("1");
                        break;
                    case 'b':
                        System.out.println("2");
                        break;
                    case 'c':
                        System.out.println("3");
                        break;
                    case 'd':
                        System.out.println("4");
                        break;
                    case 'e':
                        System.out.println("5");
                        break;
                    case 'f':
                        System.out.println("6");
                        break;
                    case 'g':
                        System.out.println("7");
                        break;
                    case 'h':
                        System.out.println("8");
                        break;
                    default:
                        System.out.println("z");
                        break;
                }
            } else if (use.equals("22")) {
                System.out.println("********************* LOOPS *******************");
                //for 

                for (int i = 0; i < 10; i++) {
                    System.out.println(i + " ");
                }
                int[] loopArray = {3, 6, 9, 12, 15};
                System.out.println("**********************************************");
                for (int i = 0; i < loopArray.length; i++) {
                    float newloopArray = (loopArray[i] / 3) * 5;
                    System.out.println(i + " = " + "New Array = " + newloopArray);
                }
                System.out.println("**********************************************");
                for (int i = 1; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        int resultL = i * j;
                        System.out.println(i + " * " + j + " = " + resultL);
                    }
                }
                System.out.println("********************NEW FORMAT*********************");
                System.out.println("****************for(int number:loopArray)**********");
                for (int number : loopArray) {
                    System.out.println((number / 3) * 5);
                }
                System.out.println("********************(I*= 2) *********************");
                for (int i = 2; i < 10; i *= 2) {
                    System.out.println(i);
                }
                System.out.println("********************WHILE*********************");
                boolean loopB = true;
                while (loopB) {
                    for (int i = 0; i < 10; i++) {
                        if (i == 3) {
                            System.out.println("CONTINUE");
                            continue;
                        } else if (i == 7) {
                            System.out.println("WHILE FALSE AND BREAK");
                            loopB = false;
                            break;
                        } else {

                            System.out.println(i);
                        }
                    }
                }

            } else if (use.equals("23")) {
                System.out.println("**************** FACTORİAL ***********************");
                System.out.println("Enter number Factorial Calculator");
                Scanner sys = new Scanner(System.in);
                int numberF = sys.nextInt();
                int fac = 1;
                for (int i = 1; i <= numberF; i++) {
                    fac = fac * i;
                }
                System.out.println("Result = " + fac);

            } else if (use.equals("24")) {
                System.out.println("**************** Square Metod ***********************");
                Square();
                System.out.println("Enter two number");
                int mahtA = scan.nextInt();
                int mahtB = scan.nextInt();
                System.out.println("**************** Math Metod ***********************");
                System.out.println(math(mahtA, mahtB));
                System.out.println("**************** Overloading***********************");
                System.out.println("Enter third number");
                int mahtC = scan.nextInt();
                System.out.println("**************** Result 3 parametres***********************");
                System.out.println(math(mahtA, mahtB, mahtC));
                System.out.println("**************** Result***********************");
                System.out.println(math(mahtA));
            } else if (use.equals("25")) {
                //User input
                System.out.println("Car color = ?");
                String Ccolor = scan.nextLine();
                System.out.println("Car model = ?");
                String Cmodel = scan.nextLine();
                System.out.println("Car year = ?");
                int Cyear = scan.nextInt();
                System.out.println("Car door = ?");
                int Cdoor = scan.nextInt();
                System.out.println("Car whell = ?");
                int Cwell = scan.nextInt();
                //called
                Car c = new Car(Ccolor, Cdoor, Cmodel, Cwell, Cyear);
            }
            
            else if(use.equals("26")){
                System.out.println("Student Name = ?");
                String studentName = scan.nextLine();
                System.out.println("Student School = ?");
                String studentSchool = scan.nextLine();
                System.out.println("Student Id = ?");
                int studentId = scan.nextInt();
                System.out.println("Student Ave = ?");
                int studentAve = scan.nextInt();
                Student student = new Student(studentName, studentId, studentAve, studentSchool);
                
                
            }
            else {
                st = false;
            }

        }
    }

    public static void Square() {
        Scanner squ = new Scanner(System.in);
        System.out.println("Enter a number");
        int numberSqu = squ.nextInt();
        int resultSqu = numberSqu * numberSqu;
        System.out.println("Result: " + resultSqu);

    }

    public static int math(int a, int b) {
        System.out.println("********************* RETURN *******************");
        int result = a * b;
        return result;
    }

    public static int math(int a) {
        return a * a * a;
    }

    public static int math(int a, int b, int c) {
        return a * b / c;
    }

}
