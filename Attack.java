package Players;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Marley on 3/14/2017.
 */
public class Attack {
    //private String nameOfAttack;
    //private String descriptionOfAttack;
    //private int powerOfCountry; //power of country to determine the total attack power
    //private int deaths;

    public ArrayList<Attack> countryAttacks;

    public Attack() {
        this.nameOfAttack = "";
        this.descriptionOfAttack = "";
        //this.powerOfCountry = 0;
        //this.deaths = 0;
        this.countryAttacks = new ArrayList<>(Arrays.asList(new Attack(), new Attack(), new Attack(), new Attack()));
    }

    public String nameOfAttack, descriptionOfAttack, powerOfCountry, deaths; {
        this.countryAttacks = countryAttacks;
        //this.nameOfAttack = ;
        //this.descriptionOfAttack = attackMoveSetDescription;
        //this.powerOfCountry = 0;
        //this.deaths = 0 //number of population loss
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