package Day3.Teams;

public class MainClass {
    public static void main(String[] args) {
        Football f1 = new Football("Messi");
        Football f2 = new Football("Ronaldo");
        Cricket c1 = new Cricket("Sachin");
        Cricket c2 = new Cricket("Kohli");
        AssignTeamsAndPlayers<Cricket> t1 = new AssignTeamsAndPlayers<Cricket>("India");
        AssignTeamsAndPlayers<Football> t2 = new AssignTeamsAndPlayers<Football>("England");

        t1.AddPlayers(c1);
        t2.AddPlayers(f1);
        t1.AddPlayers(c2);
        t2.AddPlayers(f2);
        t1.AddPlayers(c1);
    }
}
