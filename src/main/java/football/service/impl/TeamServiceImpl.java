package football.service.impl;

import football.model.Team;
import football.service.TeamService;
import org.springframework.stereotype.Service;

@Service
public class TeamServiceImpl implements TeamService {
//    Team team = new Team();


    public void save(Team team){
        teamDAO.save(team);
    }

//    public void addPlayer() {
//        team.getPlayers().add(new Player("name", "lastName"));
//    }
}
