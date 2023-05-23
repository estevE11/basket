package cat.tecnocampus.resteve.basket.basket.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

public class Team {

    private String id = UUID.randomUUID().toString();
    private String name;
    private String shirtColor;

    private HashSet<Player> players = new HashSet<>();

    public Team(String name, String shirtColor) {
        this.name = name;
        this.shirtColor = shirtColor;
    }

    public void addPlayer(Player player) {
       this.players.add(player);
    }

    public List<Player> getPlayers() {
        return new ArrayList<>(this.players);
    }

    public float getReboundAvg() {
        return (float) this.players.stream().mapToDouble(Player::getRebounds).average().getAsDouble();
    }

    public float getBasketAvg() {
        return (float) this.players.stream().mapToDouble(Player::getRebounds).average().getAsDouble();
    }

    public String getID() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public String getShirtColor() {
        return shirtColor;
    }
}
