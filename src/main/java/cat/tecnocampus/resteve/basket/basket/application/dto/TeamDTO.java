package cat.tecnocampus.resteve.basket.basket.application.dto;

import cat.tecnocampus.resteve.basket.basket.domain.Player;
import cat.tecnocampus.resteve.basket.basket.domain.Team;

import java.util.HashSet;
import java.util.UUID;

public class TeamDTO {

    private String id;
    private String name;
    private String shirtColor;

    private HashSet<Player> players = new HashSet<>();

    public TeamDTO() {

    }

    public TeamDTO(Team team) {
        this.id = team.getID();
        this.name = team.getName();
        this.shirtColor = team.getShirtColor();
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getShirtColor() {
        return shirtColor;
    }
}
