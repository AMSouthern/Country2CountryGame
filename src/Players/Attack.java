package Players;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ authors: Alexandria Southern, Mike Bastian, and Marley Powers
 *
 * CS 222 - S2 David Largent
 *
 * This class initiates countries attack moves.
 */
public class Attack {
    private String nameOfAttack;
    private String descriptionOfAttack;
    private int powerOfCountry; //power of country to determine the total attack power
    private int deaths;

    public ArrayList<Attack> countryAttacks;

    public Attack() {
        this.nameOfAttack = "";
        this.descriptionOfAttack = "";
        this.powerOfCountry = 0;
        this.deaths = 0;
        this.countryAttacks = new ArrayList<>(Arrays.asList(new Attack(), new Attack(), new Attack(), new Attack()));
    }

    public void Attack(String nameOfAttack, String descriptionOfAttack, int powerOfCountry, int deaths) {
        this.countryAttacks = countryAttacks;
        this.nameOfAttack = "";
        this.descriptionOfAttack = descriptionOfAttack;
        this.powerOfCountry = powerOfCountry;
        this.deaths = deaths; //number of population loss
    }
    public String getNameOfAttack(){
        return this.nameOfAttack;
    }

    public String getDescriptionOfAttack() {
        return this.descriptionOfAttack;
    }

    public int getPowerOfCountry() {
        return this.powerOfCountry;
    }

    public int getDeaths(){
        return this.deaths;
    }
}