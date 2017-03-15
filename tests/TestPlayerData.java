import Players.InitPlayers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static Players.InitPlayers.USAInit;
import static Players.InitPlayers.russiaInit;


/**
 * @ authors: Alexandria Southern, Mike Bastian, and Marley Powers
 *
 * CS 222 - S2 David Largent
 *
 * This class tests all of the initial player data
 */
public class TestPlayerData {

    private InitPlayers nullCharacter = new InitPlayers();

    @Before
    public void initialize(){
        USAInit();
        russiaInit();
        //somaliaInit();
        //southKoreaInit();
        //penguinsInit();
    }

    @Test
    public void noCountryTester() {
        Assert.assertEquals("", nullCharacter.getLeader());
    }
///////////////////////////////////////////////////USA///////////////////////////////////////////////////
    @Test
    public void USALeaderTest(){
        Assert.assertEquals("Donald Trump",USAInit().getLeader());}
    @Test
    public void USAGovTest(){
        Assert.assertEquals("Constitutional Federal Republic",USAInit().getGovType());}
    @Test
    public void USADescriptionTest(){
        Assert.assertEquals("The United States was founded in 1776 and has the strongest military in the world.",USAInit().getDescription());}
    @Test
    public void USAProsTest(){
        Assert.assertEquals("Strongest",USAInit().getPros());}
    @Test
    public void USAConsTest(){
        Assert.assertEquals("The United States can only attack every other turn but when they do the attacks are devastating to the enemy",USAInit().getCons());}
    @Test
    public void USAHealthTest(){
        Assert.assertEquals(0,USAInit().getHealth());}
    @Test
    public void USAStaminaTest(){
        Assert.assertEquals(0,USAInit().getStamina());}
    @Test
    public void USAAttackTest(){
        Assert.assertEquals(0,USAInit().getAttack());}
    @Test
    public void USAMoneyTest(){
        Assert.assertEquals(0,USAInit().getMoney());}
///////////////////////////////////////////////////RUSSIA///////////////////////////////////////////////////

    @Test
    public void russiaPlayerTest(){
        Assert.assertEquals("Vladimir Putin",russiaInit().getLeader());}
    @Test
    public void russiaGovTest(){
        Assert.assertEquals("Semi-Presidential Republic",russiaInit().getGovType());}
    @Test
    public void russiaDescriptionTest(){
        Assert.assertEquals("Russia is the worlds largest nation and is the third-largest producer of oil.",russiaInit().getDescription());}
    @Test
    public void russiaProsTest(){
        Assert.assertEquals("Slow population increase over time",russiaInit().getPros());}
    @Test
    public void russiaConsTest(){
        Assert.assertEquals("Lacking resources",russiaInit().getCons());}
    @Test
    public void russiaHealthTest(){
        Assert.assertEquals(0,russiaInit().getHealth());}
    @Test
    public void russiaStaminaTest(){
        Assert.assertEquals(0,russiaInit().getStamina());}
    @Test
    public void russiaAttackTest(){
        Assert.assertEquals(0,russiaInit().getAttack());}
    @Test
    public void russiaMoneyTest(){
        Assert.assertEquals(0,russiaInit().getMoney());}
/*

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
