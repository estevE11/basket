package cat.tecnocampus.resteve.basket.basket.domain;

import java.util.UUID;

public class Player {
    private String id = UUID.randomUUID().toString();
    private String name;
    private float height;
    private int baskets;
    private int rebounds;
    private int shirtNumber;

    public Player(String name, float height, int baskets, int rebounds, int shirtNumber) {
        this.name = name;
        this.height = height;
        this.baskets = baskets;
        this.rebounds = rebounds;
        this.shirtNumber = shirtNumber;
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
