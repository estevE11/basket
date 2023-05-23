package cat.tecnocampus.resteve.basket.basket.api;

import cat.tecnocampus.resteve.basket.basket.application.TeamController;
import cat.tecnocampus.resteve.basket.basket.application.dto.PlayerDTO;
import cat.tecnocampus.resteve.basket.basket.application.dto.TeamDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teams/{teamID}")
public class PlayerRestController {

    @GetMapping("/players")
    public List<PlayerDTO> getAllPlayers(@PathVariable String teamID) {
        return TeamController.getPlayersByTeam(teamID);
    }
    @PostMapping("/players")
    public PlayerDTO createPlayer(@PathVariable String teamID, @RequestBody PlayerDTO player) {
        return TeamController.addPlayer(teamID, player.getName(), player.getHeight(), player.getShirtNumber());
    }
}
