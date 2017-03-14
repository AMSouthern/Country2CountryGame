import Players.InitPlayers;
import org.junit.Assert;
import org.junit.Test;

import static Players.InitPlayers.USAInit;


/**
 * @ authors: Alexandria Southern and Marley Powers
 *
 * CS 222 - S2 David Largent
 *
 * This class tests all of the initial player data
 */
public class TestPlayerData {

    private InitPlayers nullCharacter = new InitPlayers();

    @Test
    public void noCountryTester() {
        Assert.assertEquals("", nullCharacter.getLeader());
    }

    @Test
    public void USALeaderTest(){
        USAInit();
        Assert.assertEquals("Donald Trump",USAInit().getLeader());
    }

    @Test
    public void USADescriptionTest(){
        USAInit();
        Assert.assertEquals("The United States was founded in 1776 and has the strongest military in the world.",USAInit().getDescription());
    }

 /*
    @Test
    public void russiaPlayerTest(){
        //russiaInit();
        Assert.assertEquals("Vladimir Putin",russiaInit().getLeader());
    }


    @Test
    public void USANoInitTest(){
        Assert.assertEquals("Donald Trump",getLeader());
    }

    @Test
    public void southKoreaPlayerTest(){

    }
    @Test
    public void somaliaPlayerTest(){

    }

    @Test
    public void penguinsPlayerTest(){

    }
    */
}
