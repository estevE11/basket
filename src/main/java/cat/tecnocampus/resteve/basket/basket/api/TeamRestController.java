package cat.tecnocampus.resteve.basket.basket.api;

import cat.tecnocampus.resteve.basket.basket.application.TeamController;
import cat.tecnocampus.resteve.basket.basket.application.dto.PlayerDTO;
import cat.tecnocampus.resteve.basket.basket.application.dto.TeamDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeamRestController {
    @GetMapping("/teams")
    public List<TeamDTO> getAllTeams() {
        return TeamController.getAllTeams();
    }

    @PostMapping("/teams")
    public TeamDTO createTeam(@RequestBody TeamDTO team) throws Exception {
        return TeamController.createTeam(team.getName(), team.getShirtColor());
    }

}
