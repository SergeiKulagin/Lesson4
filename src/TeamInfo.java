import java.util.HashMap;
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
      if (!teamStringMap.isEmpty()){
          teamStringMap.clear();
      }
    }
   private void updateTeamInfo (Team team, String legalAddress){
        String oldAddress = team.getLegalAddress();
        if (!oldAddress.equals(legalAddress)){
        teamStringMap.replace(team,legalAddress);
        team.setLegalAddress(legalAddress);
        } else System.out.println("Team's information has not changed");
   }
   private Team chooseLongestAddress (){
       Team team = new Team();

       return team;
   }
}
