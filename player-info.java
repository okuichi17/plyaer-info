# player-info
public class PlayerInfo {
    private String number;
    private String name;
    private String reading;
    private String team;

    public PlayerInfo(String number, String name, String reading, String team) {
        this.number = number;
        this.name = name;
        this.reading = reading;
        this.team = team;
    }
    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getReading() {
        return reading;
    }

    public String getTeam() {
        return team;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReading(String reading) {
        this.reading = reading;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}

