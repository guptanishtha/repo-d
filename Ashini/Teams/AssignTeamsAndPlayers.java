package Day3.Teams;

import java.util.ArrayList;

public class AssignTeamsAndPlayers <T extends Players> {

    public String TeamName;

    public AssignTeamsAndPlayers(String name){
        this.TeamName = name;
    }

    ArrayList<T> Members = new ArrayList<>();

    public void AddPlayers(T player){
        if(Members.contains(player)){
            System.out.println(player.getPlayerName() + " is already on the " + TeamName + " team");
        }
        else{
            Members.add(player);
            System.out.println(player.getPlayerName() + " is added in the " + TeamName + " team" );
        }
    }


}
