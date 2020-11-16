
package ohtu;

public class Player implements Comparable<Player> {
    private String name;
    private String team;
    private int goals;
    private int assists;

    public void setName(String name) {
        this.name = name;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    @Override
    public String toString() {
        return name + " team " + team + " goals " + goals + " assists " + assists + " = " + (goals + assists);
    }

    @Override
    public int compareTo(Player o) {
        return (o.getAssists() + o.getGoals() - (this.assists + this.goals));
    }
}