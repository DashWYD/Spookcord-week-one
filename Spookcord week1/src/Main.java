import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //ImportantVariables
            //String name



        //Functions




            //source code:
                 System.out.println("       ");
                System.out.println("Welcome to my spook cord week 1 project. This project is " +
                        "a command line rpg game, coded in java as it is a little something new. This game is based on" +
                        " mystery, and magic. Enjoy make sure to follow me on github, https://github.com/DashWYD/ ");
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
                                    " enhances any humans strength?" + "Mary: Yes i do, the river of recovery," +
                                    " a very ancient river.");


                    }
            };
            timer.schedule(task5, 3000);
            //Done for tonight 10/2/2022
    }
}