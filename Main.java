import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //ImportantVariables
            //String name
            String[] inventory = {"Golden Shovel"};
             int  gShovelCount = 0;


        //Functions




            //source code:
                 System.out.println("       ");
                System.out.println("Welcome to my spook cord week 1 project. This project is " +
                        "a command line story game, coded in java as it is a little something new. This game is based on" +
                        " Deserts and riches. Enjoy make sure to follow me on github, https://github.com/DashWYD/ ");
                System.out.println("       ");
                System.out.println("Lets get started, Enter any number to continue.");
                int start = scanner.nextInt();
                System.out.println("What is your name? Enter below");
                String name = scanner.next();
                System.out.println("Welcome " + name + "!!!");
                System.out.println("Would you like to continue? Enter any number to continue.");
                int continueOne = scanner.nextInt();
                System.out.println("You spawned in a random forrest.");
                System.out.println("       ");
                System.out.println("You found a fox and it chased you out of the forrest.");
                System.out.println("       ");
                System.out.println("Woah, you found a cliff.");
                System.out.println("       ");
                System.out.println("Press any number to continue.");
                System.out.println("       ");
                int continueTwo = scanner.nextInt();
                System.out.println("       ");
                System.out.println("Woah, you did some investigating and found a city over" +
                        " the cliff along with a massive waterfall.");
                System.out.println("       ");
                System.out.println("Lets go investigate the town.");
                System.out.println("       ");

                Timer timer = new Timer();
                TimerTask task1 = new TimerTask() {
                        @Override
                        public void run() {
                                System.out.println("You went down to see the town and you came across a man.\n" + name +
                                        ": Hello sir, what is your name?");
                        }

                };
                timer.schedule(task1, 3000);

                TimerTask task2 = new TimerTask()
                {
                        @Override
                        public void run()
                        {
                                System.out.println("My name is john.");
                        }

                };
                timer.schedule(task2, 6000);

                TimerTask task3 = new TimerTask() {
                        @Override
                        public void run(){
                                System.out.println("John: What is your name? \n " + name + ": " +"My name is " + name);
                        }

                };
            timer.schedule(task3, 8000);
            TimerTask task4 = new TimerTask() {
                    @Override
                    public void run(){
                            System.out.println("John: I have a project for you " + name + ". There is a river in a arabian " +
                                    "desert. This rivers water has the power to make any human stronger. " +
                                    "I want you to go to the river, and grab me 1 gallon of it." +
                                    " If you can do this i will give you a golden shovel. " +
                                    "Would you like to accept the offer? Press any number to continue," +
                                    " to quit the process, exit your terminal.  ");
                    }
            };
            timer.schedule(task4, 10000);

            int continueFour = scanner.nextInt();

            System.out.println("We are teleporting you to arabia, please wait.");
            System.out.print("      ");

            TimerTask task5 = new TimerTask() {
                    @Override
                    public void run(){
                            System.out.println("Successfully teleported to arabia, you landed in a random village" +
                                    " in the middle of the desert" +
                                    "You see a woman " + name+ ": "+" Hello, do you know of the river, the river that"+
                                    " enhances any humans strength?" + " Mary: Yes i do, the river of recovery," +
                                    " a very ancient river.");


                    }
            };
            timer.schedule(task5, 3000);


        TimerTask task6 = new TimerTask() {
            @Override
            public void run(){
                System.out.println( name + ": Where can i find this river? Press any number to continue");


            }
        };
        timer.schedule(task6, 5000);
        int continueFive = scanner.nextInt();


        System.out.println("Mary: Right down the road, be careful the heat is very dangerous.");
        System.out.println("      ");
        System.out.println(name + ": Can you send me the coordinates?\n" + " Mary: Sending coordinates...");
        System.out.println("      ");
        System.out.println("Thank you for the coordinates, i will be on my way.");


        TimerTask task7 = new TimerTask() {
            @Override
            public void run(){
                System.out.println("You continue on your way, it is insanely hot, and you have no water." +
                        " You begin to think you are going to pass out until you come across the river.");
                System.out.println("Finally!!!!! I made it. Now you just need a bucket.");

            }
        };
        timer.schedule(task7, 3000);
        System.out.println("   ");
        System.out.println("Press any number to continue.");
        int continueSix = scanner.nextInt();
        System.out.println("   ");
        System.out.println("You found a bucket, grab it and we will teleport you to john.");
        System.out.println("   ");
        System.out.println("Press any number to teleport to john.");
        int teleport = scanner.nextInt();
        System.out.println("Teleporting....");
        System.out.println("   ");
        System.out.println("John: Welcome back!!! " + name + " I see you listened. ");
        System.out.println("Give me the water and you shall receive your Golden Shovel. " +
                "The golden shovel is a very useful tool, very very useful for the future..");
        System.out.println("   ");
        System.out.println("Golden shovel + 1, John: thanks for the water!!");
        gShovelCount += 1;
        System.out.println("You now have 1 golden shovel now. You can use a golden shovel " +
                "in many things in future versions but for this version of axenet or axenet v1.0.0");
    }
}