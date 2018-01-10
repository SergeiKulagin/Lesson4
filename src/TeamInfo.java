import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeamInfo {

    private static Map<Team, String> teamInfoMap = new HashMap<>();

    public void addTeamInfo(Team team) {
        if (!teamInfoMap.containsKey(team)) {
            teamInfoMap.put(team, team.getLegalAddress());
        } else System.out.println("Team's information has been changed");
    }

    public void removeTeamInfo(Team team) {
        if (teamInfoMap.containsKey(team)) {
            teamInfoMap.remove(team);
        } else System.out.println("There isn't this team");
    }

    public void removeAllInfo() {
        if (!teamInfoMap.isEmpty()) {
            teamInfoMap.clear();
        }
    }

    public void updateTeamInfo(Team team, String legalAddress) {
        String oldAddress = team.getLegalAddress();
        if (!oldAddress.equals(legalAddress)) {
            teamInfoMap.replace(team, legalAddress);
            team.setLegalAddress(legalAddress);
        } else System.out.println("Team's information has not changed");
    }

    public String chooseLongestAddress() {
        Team team = new Team();
        String legalAddress = "";
        List<Integer> length = new ArrayList<>();
        for (Map.Entry<Team, String> entry : teamInfoMap.entrySet()) {
            String address = entry.getValue();
            if ((address != null) && (address.length() > legalAddress.length())) {
                legalAddress = address;
                team = entry.getKey();
            }
        }
        return teamInfoMap.get(team);
    }
}

