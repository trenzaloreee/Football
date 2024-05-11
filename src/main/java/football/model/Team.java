package football.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;

@Data
@Entity
public class Team {

    @Id
    private int id;
    private String name;
    private ArrayList<Player> players;

    public ArrayList<Player> getPlayers() {
        return players;
    }
}

//{
//    "name" : "MyTeam",
//    "players" : [
//                {
//                    "name":"Soccer",
//                    "lastName" : "Player"
//                },
//                    {
//                    "name": "Soccer",
//                    "lastName" : "Halfback"
//                        }
//            ]
//        }