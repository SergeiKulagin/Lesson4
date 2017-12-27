import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeamInfo {

    private static Map<Team, String> teamStringMap = new HashMap<>();

    private void addTeamInfo(Team team) {
        if (!teamStringMap.containsKey(team)) {
            teamStringMap.put(team, team.getLegalAddress());
        } else System.out.println("Team's information has been changed");
    }

    private void removeTeamInfo(Team team) {
        if (teamStringMap.containsKey(team)) {
            teamStringMap.remove(team);
        } else System.out.println("There isn't this team");
    }

    private void removeAllInfo() {
        if (!teamStringMap.isEmpty()) {
            teamStringMap.clear();
        }
    }

    private void updateTeamInfo(Team team, String legalAddress) {
        String oldAddress = team.getLegalAddress();
        if (!oldAddress.equals(legalAddress)) {
            teamStringMap.replace(team, legalAddress);
            team.setLegalAddress(legalAddress);
        } else System.out.println("Team's information has not changed");
    }

    private String chooseLongestAddress() {
        Team team = new Team();
        String legalAddress = "";
        List<Integer> length = new ArrayList<>();
        for (Map.Entry<Team, String> entry : teamStringMap.entrySet()) {
            String address = entry.getValue();
            if ((address != null) && (address.length() > legalAddress.length())) {
                legalAddress = address;
                team = entry.getKey();
            }
        }
        return teamStringMap.get(team);
    }
}

