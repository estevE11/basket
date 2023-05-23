package cat.tecnocampus.resteve.basket.basket.application.dto;

import cat.tecnocampus.resteve.basket.basket.domain.Player;

public class PlayerDTO {

    private String id;
    private String name;
    private float height;
    private int baskets;
    private int rebounds;
    private int shirtNumber;

    public PlayerDTO() {}

    public PlayerDTO(Player player) {
        this.id = player.getID();
        this.name = player.getName();
        this.height = player.getHeight();
        this.baskets = player.getBaskets();
        this.rebounds = player.getRebounds();
        this.shirtNumber = player.getShirtNumber();
    }

    public String getID() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public float getHeight() {
        return height;
    }

    public int getBaskets() {
        return baskets;
    }

    public int getRebounds() {
        return rebounds;
    }

    public int getShirtNumber() {
        return shirtNumber;
    }
}
