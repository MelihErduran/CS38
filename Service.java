import java.util.Scanner;

public class Service {
    public static void main(String[] args) {
        System.out.println("""
                Talk plans

                A: Talk (<500 min),  Text (none),  Data (none)   - $49/mon
                B: Talk (<500 min),  Text (any),   Data (none)   - $55/mon
                C: Talk (>=500 min), Text (<100),  Data (none)   - $61/mon
                D: Talk (>=500 min), Text (>=100), Data (none)   - $70/mom
                Data plans

                E: Talk (any),       Text (any),   Data (<3 GB)  - $79/mon
                F: Talk (any),       Text (any),   Data (>=3 GB) - $87/mon""");
        System.out.println("What is the maximum amount of talk minutes you need?: ");
        Scanner in = new Scanner(System.in);
        int talkInput = in.nextInt();
        System.out.println("What is the maximum amount of text messages you need?: ");
        int textInput = in.nextInt();
        System.out.println("What is the maximum amount of data you need?: ");
        int dataInput = in.nextInt();

        if (dataInput > 0) {
            if (dataInput >= 3){
                System.out.println("Plan F: Talk (>0),        Text (>0),    Data (>=3 GB) - $87/mon\n");
            }
            else {
                System.out.println("Plan E: Talk (>0),        Text (>0),    Data (<3 GB)  - $79/mon");
            }
        } else if (dataInput == 0){
            if (talkInput < 500 && textInput <= 0) {
                System.out.println("Plan A: Talk (<500 min),  Text (zero),  Data (zero)   - $49/mon");
            } else if (talkInput < 500) {
                System.out.println("Plan B: Talk (<500 min),  Text (>0),    Data (zero)   - $55/mon");
            } else if (textInput < 100) {
                System.out.println("Plan C: Talk (>=500 min), Text (<100),  Data (zero)   - $61/mon");
            } else if (talkInput >= 500) {
                System.out.println("Plan D: Talk (>=500 min), Text (>=100), Data (zero)   - $70/mon");
            } else {
                System.out.println("Invalid Entry");
            }
        } else {
            System.out.println("Invalid Entry");
        }


    }
}
