package fun.func.thanks.castle;

import java.util.HashMap;
import java.util.Set;

public class Room {
    private final String description;
    private final HashMap<String, Room> nextRooms = new HashMap<>();


    public Room(String description) {
        this.description = description;
    }

    public void setExit(String direction, Room nextRoom) {
        nextRooms.put(direction, nextRoom);
    }

    public Room getNextRoom(String direction) {
        return this.nextRooms.get(direction);
    }

    public Set<String> getDirections() {
        return this.nextRooms.keySet();
    }

    @Override
    public String toString() {
        return description;
    }
}