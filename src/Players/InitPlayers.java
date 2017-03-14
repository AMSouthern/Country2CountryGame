package Players;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @ authors: Alexandria Southern and Marley Powers
 *
 * CS 222 - S2 David Largent
 *
 * This class Initiates all of the PLayer data
 */
public class InitPlayers {

    private String country;
    private String leader;
    private String government;
    private String description;
    private String pros;
    private String cons;
    private int health; //population
    private int stamina; //resources
    private int money;
    private int attack; //military power, 1 power = 100,000 deaths
    private String drawback;
    private String booster;
    private ArrayList<Attack> countryAttacks;

    //private ArrayList<Attack> countryAttacks;
    public InitPlayers(){
        this.country = "";
        this.leader = "";
        this.health = 0;
        this.stamina = 0;
        this.money = 0;
        this.attack = 0;
        this.drawback = "";
        this.booster ="";
        this.description = "";
        this.government = "";
        this.countryAttacks = new ArrayList<>();
    }

    public InitPlayers(String countryName, String leaderName, String countryBack, String countryBoost, String description, String govType,int countryHealth, int countryStamina, int countryMoney, int countryAttack){ //, ArrayList<Attack> countryAttackSet
        this.country = countryName;
        this.leader = leaderName;
        this.description = description;
        this.government = govType;
        this.drawback = countryBack;
        this.booster =countryBoost;

        this.health = countryHealth;
        this.stamina = countryStamina;
        this.money = countryMoney;
        this.attack = countryAttack;
        //this.countryAttacks = countryAttackSet;


    }

    public static InitPlayers USAInit(){
        String country = "USA";
        String leader = "Donald Trump"; // (2017)
        String government = "Constitutional Federal Republic";
        String description = "The United States was founded in 1776 and has the strongest military in the world.";
        String pros = "Strongest";
        String cons = "The United States can only attack every other turn but when they do the attacks are devastating to the enemy";

        //20pts total distributed
        int health = 0;     //pop 318.3 million;
        int stamina = 0;
        int money = 0;      //US Dollar
        int attack = 0;
/*
        ArrayList<Attack> countryAttacks = new ArrayList<>();
        countryAttacks.add(Troops());         //attack: Troops power:2 resources:
        countryAttacks.add(Drones());         //attack: power: resources:
        countryAttacks.add(Warship());        //attack: power: resources:
        countryAttacks.add(Nuke());           //attack: power: resources:
        countryAttacks = new ArrayList<>(Array.asList(Troops(), Drones(), Warship(), Nuke()));
*/
        return new InitPlayers(country, leader, pros, cons, description, government, health,stamina,money,attack); //, countryAttacks

    }


/*
    public static void russiaInit(){
        country = "Russia, Moscow";
        leader = "Vladimir Putin (2012)";
        government = "Semi-Presidential Republic";
        description = "Russia is the worlds largest nation and is the third-largest producer of oil.";
        pros = "Slow population increase over time";
        cons = "Lacking resources";
        health = 0;     //population 143.5 million
        stamina = 0;
        money = 0;      //Russian Ruble
        attack = 0;

        //ArrayList<Attack> countryAttacks = new ArrayList<>();
        countryAttacks.add(Spy());            //attack: power: resources:
        countryAttacks.add(BearAttacks());    //attack: power: resources:
        countryAttacks.add(Hacking());        //attack: power: resources:
        countryAttacks.add(Cold War());       //attack: power: resources:
        ArrayList<Attack> countryAttacks = new ArrayList<>(Arrays.asList(Spy(), BearAttacks(), Hacking(), ColdWar()));
        return new russiaInit(country, leader, government, description, pros, cons,  health, stamina, money, attack, countryAttacks);

    }


    public static void somaliaInit(){
        country = "Somalia, Mogadishu";
        leader = "Mohamed Abdullahi Mohamed";
        government = "Semi-Presidential Republic";
        description = "Although Somalia does not condone the acts of the pirates that hijack and steal in the Indian Ocean it is important to note that they are a strong force.";
        pros = "Harder to hit, 55% chance of getting hit.";
        cons = "Low health";
        health = 0;     //population 10.5 million
        stamina = 0;
        money = 0;      //Somali Shilling
        attack = 0;

        //ArrayList<Attack> countryAttacks = new ArrayList<>();
        countryAttacks.add(BoardShips);        //attack: power: resources:
        countryAttacks.add(Cannon);             //attack: power: resources:
        countryAttacks.add(Scurvy);             //attack: power: resources:
        countryAttacks.add(DavyJonesLocker);  //attack: power: resources:
        ArrayList<Attack> countryAttacks = new ArrayList<>(Arrays.asList(BoardShips(), Cannon(), Scurvy(), DavyJonesLocker()));
        return new somaliaInit(country, leader, government, description, pros, cons,  health, stamina, money, attack, countryAttacks);
    }


    public static void southKoreaInit(){
        country = "South Korea, Seoul";
        leader = "Pending";     //Prime minister Acting President Hwang Kyo-ahn
        government = "Democratic Republic";
        description = "In 1945 after the end of World War II South Korea split from North Korea and now has a booming economy and a tense relation with those in the North.";
        pros = "Critical chance to hit";
        cons = "More likely to be affected by world events.";
        health = 0;             // Population 50.22 million
        stamina = 0;
        money = 0;              //South Korean Won
        attack = 0;

        //ArrayList<Attack> countryAttacks = new ArrayList<>();
        countryAttacks.add(Robots); //attack: power: resources:
        countryAttacks.add(BiggerRobots); //attack: power: resources:
        countryAttacks.add(SuperBigRobots); //attack: power: resources:
        countryAttacks.add(MegaBigRobots); //attack: power: resources:
        ArrayList<Attack> countryAttacks = new ArrayList<>(Arrays.asList(Robots(), BiggerRobots(), SuperBigRobots(), MegaBigRobots()));
        return new southKoreaInit(country, leader, government, description, pros, cons,  health, stamina, money, attack, countryAttacks);
    }


    public static void penguinInit(){
        country = "Antarctica";
        leader = "Emperor Penguin";
        government = "Totalitarian State";
        description = "Antarctica is not claimed by any country and resides on the south pole.";
        pros = "You are a penguin";
        cons = "Global Warming is slowly killing your species. Damage taken every turn.";
        health = 0;         // 100 million penguins
        stamina = 0;
        money = 0;          //Fish
        attack = 0;

        //ArrayList<Attack> countryAttacks = new ArrayList<>();
        countryAttacks.add(HappyFeet);             //attack: power: resources:
        countryAttacks.add(Fishing);                //attack: power: resources:
        countryAttacks.add(WinterStorm);           //attack: power: resources:
        countryAttacks.add(MarchofthePenguins);  //attack: power: resources:
        ArrayList<Attack> countryAttacks = new ArrayList<>(Arrays.asList(HappyFeet(), Fishing(), WinterStorm(), MarchofthePenguins()));
        return new penguinInt(country, leader, government, description, pros, cons,  health, stamina, money, attack, countryAttacks);
    }

    //public ArrayList<Attacks> getCountryAttacks(){
        //return this.countryAttacks;
    //}


*/
    public String getCountry(){return this.country;}
    public String getLeader(){return this.leader;}
    public String getDescription(){return this.description;}
    public String getGovType(){return this.government;}
    public String getPros(){return this.pros;}
    public String getCons(){return this.cons;}
    public int getHealth(){return this.health;}
    public int getStamina(){return this.stamina;}
    public int getMoney(){return this.money;}
    public int getAttack(){return this.attack;}

}

