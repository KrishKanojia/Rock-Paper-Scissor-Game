package com.company;

import java.util.Random;
import java.util.Scanner;

public class Ex2_Rock_Paper_Scissor {
    public static void main(String[] args) {


        Scanner name = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Let's Play Game :");
        System.out.println("Enter the player name : ");
        String take = name.nextLine();
        int num;
        int tem;
        int comp = 0;
        int user = 0;
        int i = 0;
        while (i < 3) {
            System.out.println("Choose the number between (1-3)");
            System.out.println("\nPress 1. for Rock\nPress 2. for Paper\nPress 3. for Scissor\n");
            num = name.nextInt();
            tem = rnd.nextInt(3);

            switch (num - 1) {
                case 0:
                    if ((num - 1) < tem) {
                        if (tem == 1) {
                            System.out.println("Compter choose Paper.\n");
                            System.out.println("Computer get 1 point\n");
                            comp++;
                        } else if (tem == 2) {
                            System.out.println("Computer choose Scissor.\n");
                            System.out.println(take + " get 1 point.\n");
                            user++;
                        }
                    } else if ((num - 1) == tem) {
                        System.out.println("Computer choose Rock.\n");
                        System.out.println("Match Draw.\n");
                    }
                    break;
                case 1:
                    if ((num - 1) > tem) {
                        if (tem == 0) {
                            System.out.println("Computer choose Rock.\n");
                            System.out.println(take + " get 1 point.\n");
                            user++;
                        }

                    } else if ((num - 1) < tem) {
                        if (tem == 0) {
                            System.out.println("Computer choose Scissor.\n");
                            System.out.println("Computer get 1 point\n");
                            comp++;
                        }
                    } else if ((num - 1) == tem) {
                        System.out.println("Computer choose paper.\n");
                        System.out.println("Match Draw.\n");
                    }

                    break;

                case 2:
                    if ((num - 1) > tem) {
                        if (tem == 0) {
                            System.out.println("Computer choose Rock.\n");
                            System.out.println("Computer get 1 point.\n");
                            comp++;
                        } else if (tem == 1) {
                            System.out.println("Computer choose Paper.\n");
                            System.out.println(take + " get 1 point.\n");
                            user++;
                        }
                    } else if ((num - 1) == tem) {
                        System.out.println("Compute choose Scissor.\n");
                        System.out.println("Match Draw.\n");
                    }
                    break;

            }
            i++;
        }
        if (user > comp) {
            System.out.println(take + " wins the series.\n");
        } else {
            System.out.println("Computer wins the series.\n");
        }
        System.out.println("Star Pattern : ");
    }
}
