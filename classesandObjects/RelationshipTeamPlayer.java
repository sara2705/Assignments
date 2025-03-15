package classesandObjects;

import java.util.ArrayList;
import java.util.List;

public class RelationshipTeamPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player1 = new Player("MS Dhoni","Wicketkeeper-Batsman",7);
        Player player2 = new Player("Rutraj Gaikwad", "Batsman", 31);
        Player player3 = new Player("Ravichandran Ashwin", "All-Rounder", 99);
        Player player4 = new Player("Ravindra Jadeja", "All-rounder", 8);
        Player player5 = new Player("Shivam Dube", "All-rounder", 21);
        

        List<Player> playerList1 = new ArrayList<>();
        playerList1.add(player1);
        playerList1.add(player2);
        playerList1.add(player3);
        playerList1.add(player4);
        playerList1.add(player5);

        
        Team team1 = new Team("Chennai Super Kings", "Chennai", "T20", playerList1);

        Player player6 = new Player("Rohit Sharma", "Batsman", 45);
        Player player7 = new Player("Suryakumar Yadav", "Batsman", 63);
        Player player8 = new Player("Jasprit Bumrah", "Bowler", 93);
        Player player9 = new Player("Hardik Pandya", "All-rounder", 33);
        Player player10 = new Player("Tilak Varma", "Batsman", 9);
        
        List<Player> playerList2 = new ArrayList<>();
        playerList2.add(player6);
        playerList2.add(player7);
        playerList2.add(player8);
        playerList2.add(player9);
        playerList2.add(player10);
        Team team2 = new Team("Mumbai Indians", "Mumbai", "T20", playerList2);

        team1.displayTeamInfo();
        team2.displayTeamInfo();
	}

}
