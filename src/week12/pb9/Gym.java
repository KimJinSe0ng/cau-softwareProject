package week12.pb9;

import java.util.Scanner;

public class Gym {
    private SoccerPlayer[] sc;
    private BasketBallPlayer[] bsk;
    private Scanner scanner = new Scanner(System.in);
    private static int playerLength = 16;

    Gym() {
        sc = new SoccerPlayer[playerLength + 1]; // 1~16 범위 사용
        bsk = new BasketBallPlayer[playerLength + 1];
//        for (int i = 0; i < playerLength; i++) {
//            sc[i] = new SoccerPlayer("", 0);
//            bsk[i] = new BasketBallPlayer("");
//        }
    }

    private void reserve() {
        System.out.printf("SoccerPlayer: 1, BasketBallPlayer: 2 >> ");
        int playerType = scanner.nextInt();
//        if (playerType != 1 || playerType != 2) {
//            System.out.println("invalid number");
//            return;
//        }
        System.out.printf("room number >> ");
        int roomNumber = scanner.nextInt();
        if (roomNumber > playerLength) {
            System.out.println("invalid number");
            return;
        }
        System.out.printf("name >> ");
        String name = scanner.next();
        if (playerType == 1) {
            System.out.printf("kickSpeed >> ");
            double kickSpeed = scanner.nextDouble();
            sc[roomNumber] = new SoccerPlayer(name, kickSpeed);
            System.out.printf("speed >> ");
            double speed = scanner.nextDouble();
            scanner.nextLine();
            sc[roomNumber].setSpeed(speed);
            System.out.printf("tools >> ");
            String tools = scanner.nextLine();
            String[] toolsList = tools.split(",");
            sc[roomNumber].setTools(toolsList);
        } else if (playerType == 2) {
            System.out.printf("jump >> ");
            double jump = scanner.nextDouble();
            bsk[roomNumber] = new BasketBallPlayer(name);
            bsk[roomNumber].setJump(jump);
            System.out.printf("speed >> ");
            double speed = scanner.nextDouble();
            scanner.nextLine();
            bsk[roomNumber].setSpeed(speed);
            System.out.printf("tools >> ");
            String tools = scanner.nextLine();
            String[] toolsList = tools.split(",");
            bsk[roomNumber].setTools(toolsList);
        } else {
            System.out.println("invalid number");
        }

    }

    private void search() {
        System.out.printf("SoccerPlayer: 1, BasketBallPlayer: 2 >> ");
        int playerType = scanner.nextInt();
        System.out.printf("room number >> ");
        int roomNumber = scanner.nextInt();
        if (playerType == 1) {
            if (sc[roomNumber] != null) {
                sc[roomNumber].showDetails();
            } else {
                System.out.println("no information");
            }
        } else if (playerType == 2) {
            if (bsk[roomNumber] != null) {
                bsk[roomNumber].showDetails();
            } else {
                System.out.println("no information");
            }
        } else {
            System.out.println("invalid number");
        }
    }

    private void cancel() {
        System.out.printf("name >> ");
        String name = scanner.next();
        for (int i = 0; i < playerLength; i++) {
            if (sc[i] != null && name.equals(sc[i].getName())) {
                System.out.println(name + "'s reservation has been canceled.");
                sc[i] = null;
                return;
            } else if (bsk[i] != null && name.equals(bsk[i].getName())) {
                bsk[i] = null;
                return;
            }
        }
        System.out.println("There are no customers booked as " + name + ".");
    }

    private void quit() {
        System.out.println("Thank you!");
    }

    public void run() {
        System.out.println("This is a reservation system for gym.");
        System.out.println();
        int state;
        while (true) {
            System.out.print("Reserve: 1, Search: 2, Cancel: 3, Quit: 4 >> ");
            state = scanner.nextInt();
            switch (state) {
                case 1:
                    reserve();
                    break;
                case 2:
                    search();
                    break;
                case 3:
                    cancel();
                    break;
                case 4:
                    quit();
                    return;
                default:
                    System.out.println("This is a wrong command.");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Gym gym = new Gym();
        gym.run();
//        for (int i = 0; i < playerLength; i++) {
//            System.out.println("sc["+i+"] : "+ gym.sc[i]);
//        }
    }
}
