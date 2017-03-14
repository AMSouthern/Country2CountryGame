package Players;

/**
 * Created by Alexandria on 3/14/2017.
 */
public class InitPlayers {

    static String country;
    static String leader;
    static String government;
    static int health; //population
    static int stamina; //resources
    static int money;
    static int attack; //military power


    public static String getLeader(){
        return leader;
    }
    public static void USAInit(){
        country = "USA";
        leader = "Donald Trump";
        government = "";
        health = 0;
        stamina = 0;
        money = 0;
        attack = 0;
    }
    public static void russiaInit(){
        country = "Russia";
        leader = "Vladimir Putin";
        government = "";
        health = 0;
        stamina = 0;
        money = 0;
        attack = 0;
    }
    public static void somaliaInit(){
        country = "Somalia";
        leader = "";
        government = "";
        health = 0;
        stamina = 0;
        money = 0;
        attack = 0;
    }
    public static void southKoreaInit(){
        country = "South Korea";
        leader = "";
        government = "";
        health = 0;
        stamina = 0;
        money = 0;
        attack = 0;
    }
    public static void penguinInit(){
        country = "Antarctica";
        leader = "Emperor Penguin";
        government = "";
        health = 0;
        stamina = 0;
        money = 0;
        attack = 0;
    }
}
