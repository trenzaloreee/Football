package football.service;

import football.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import football.repository.TeamDAO;
import football.repository.impl.TeamDAOImpl;

@Service
public interface TeamService {
    @Autowired
    TeamDAO teamDAO = new TeamDAOImpl();

    void save(Team team);
}
