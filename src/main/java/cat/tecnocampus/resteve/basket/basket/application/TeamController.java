package cat.tecnocampus.resteve.basket.basket.application;

import cat.tecnocampus.resteve.basket.basket.application.dto.PlayerDTO;
import cat.tecnocampus.resteve.basket.basket.application.dto.TeamDTO;
import cat.tecnocampus.resteve.basket.basket.domain.Player;
import cat.tecnocampus.resteve.basket.basket.domain.Team;
import cat.tecnocampus.resteve.basket.basket.persistance.TeamRepository;

import java.util.List;
import java.util.stream.Collectors;

public class TeamController {
    public static TeamDTO createTeam(String name, String shirtColor) {
        Team team = new Team(name, shirtColor);
        TeamRepository.saveTeam(team);
        return new TeamDTO(team);
    }

    public static List<TeamDTO> getAllTeams() {
        return TeamRepository.getAllTeams().stream().map(TeamDTO::new).collect(Collectors.toList());
    }

    public static PlayerDTO addPlayer(String teamID, String name, float height, int shirtNumber) {
        Team team = TeamRepository.getTeam(teamID);
        Player player = new Player(name, height, 0, 0, shirtNumber);
        team.addPlayer(player);
        return new PlayerDTO(player);
    }

    public static List<PlayerDTO> getPlayersByTeam(String teamID) {
        Team team = TeamRepository.getTeam(teamID);
        return team.getPlayers().stream().map(PlayerDTO::new).collect(Collectors.toList());
    }
}
