import org.junit.Assert;
import org.junit.Test;

import static Players.InitPlayers.USAInit;
import static Players.InitPlayers.getLeader;
import static Players.InitPlayers.russiaInit;

/**
 * Created by Alexandria on 3/14/2017.
 */
public class TestPlayerData {

    @Test
    public void USAPlayerTest(){
        USAInit();
        Assert.assertEquals("Donald Trump",getLeader());
    }




    @Test
    public void russiaPlayerTest(){
        russiaInit();
        Assert.assertEquals("Vladimir Putin",getLeader());
    }

    /*
    @Test
    //This says Putin is the leader meaning we have to do an array or something instead
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
