import java.util.Scanner;

public class TimePlus15MinutesFinalCorrectVersion {




        public static void main(String[] args) {
            System.out.println("Unesite sat u formatu xx");
            Scanner input = new Scanner(System.in);
            int sat = input.nextInt();
            System.out.println("Unesite minute u formatu xx");
            int minute = input.nextInt();


            if (minute == 45) {
                if(sat>=23){         // da prebaci na 00 ako je iza ponoci
                    sat=00;


                } else {
                    sat += 1;
                }
                int dodatak = minute+15;
                dodatak = dodatak - 60;
                System.out.println("Za 15 minuta ce biti " + sat + ":" + dodatak);
            }

            else if (minute >= 46) {
                if(sat>=23){
                    sat=00;


                } else {
                    sat += 1;
                }
                minute += 15;
                if (minute > 60) {
                    int min = (minute - 60);
                    System.out.println("Za 15 minuta ce biti " + sat + ":" + min);

                }
            }
            else if (minute <= 46) {

                minute += 15;
                System.out.println("Za 15 minuta ce biti " + sat + ":" + minute);
            }

                System.out.println(".");

            }
        }


