package suleymanatilgan;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        startBot(new ChatBot("Gweny"));
    }

    public static void startBot (ChatBot chatBot) {
        chatBot.greet();
        chatBot.remindName();
        chatBot.guessUserAge();
        chatBot.count();
        chatBot.test();
        chatBot.end();
    }
}

class ChatBot {
    final String botName;
    private String userName;
    private static Scanner input;
    public ChatBot(String botName){
        this.botName = botName;
        input = new Scanner(System.in);
    }

    public void greet() {
        System.out.printf("""
                Hello! My name is %s.
                I was created in 2021.
                """, botName);
    }

    public void remindName() {
        System.out.println("Please, remind me your name");
        setUserName(input.nextLine());
        System.out.printf("What a great name you have, %s!", getUserName());
    }

    public void guessUserAge() {
        int remainder3, remainder5, remainder7;
        System.out.print("""
                
                Let me guess your age.
                Enter remainders of dividing your age by 3, 5 and 7.
                """);
        remainder3 = input.nextInt();
        remainder5 = input.nextInt();
        remainder7 = input.nextInt();
        int userAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.printf("Your age is %d; that's a good time to start programming!\n", userAge);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void count() {
        System.out.print("Now I will prove to you that I can count to any number you want.\n");
        int countTo = input.nextInt();
        for (int i = 0; i <= countTo; i++) {
            System.out.println(i + "!");
        }
    }

    public void test() {
        int userAnswer = 0;
        System.out.println("""
                Why do we use methods?
                1. To repeat a statement multiple times.
                2. To decompose a program into several small subroutines.
                3. To determine the execution time of a program.
                4. To interrupt the execution of a program.""");
        while (userAnswer !=2) {
            userAnswer = input.nextInt();
            if (userAnswer != 2) {
                System.out.println("Please, try again.");
            }
        }
    }

    public void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}