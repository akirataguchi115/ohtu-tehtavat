package ohtuesimerkki;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StatisticsTest {

    Reader readerStub = new Reader() {

        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<>();

            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri", "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));

            return players;
        }
    };

    Statistics stats;

    @Before
    public void setUp() {
        // luodaan Statistics-olio joka käyttää "stubia"
        stats = new Statistics(readerStub);
    }

    @Test
    public void testi() {
        assertEquals(10, 10);
    }

    @Test
    public void searchReturnsList() {
        assertEquals("Semenko", stats.search("Semenko").getName());
    }

    @Test
    public void playerNotFoundReturnsNull() {
        assertEquals(null, stats.search("kajdkfjad"));
    }

    @Test
    public void playersOfTeam() {
        assertEquals(3, stats.team("EDM").size());
    }

    @Test
    public void TopScorers() {
        assertEquals("Gretzky", stats.topScorers(1).get(0).getName());
    }
}