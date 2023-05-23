package cat.tecnocampus.resteve.basket.basket.persistance;

import cat.tecnocampus.resteve.basket.basket.domain.Team;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class TeamRepository {

    private static HashSet<Team> teams = new HashSet<>();

    public static void saveTeam(Team team) {
       teams.add(team);
    }

    public static List<Team> getAllTeams() {
        return new ArrayList<>(teams);
    }

    public static Team getTeam(String teamID) {
        return teams.stream().filter(x -> x.getID().equals(teamID)).findAny().get();
    }
}
