package football.repository.impl;

import football.model.Team;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import football.repository.TeamDAO;

import java.util.ArrayList;

@Repository
public class TeamDAOImpl implements TeamDAO {       // Data Access Object

//    ArrayList<Team> teams = new ArrayList<Team>();

    @Autowired
    private SessionFactory sessionFactory;

//    public void save(Team team) {
//        teams.add(team);
//        System.out.println(teams);
//    }



    public void save(Team team){
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.save(team);
        tx.commit();
        session.close();
    }

    public Team getTeamById(int id) {
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        Team team = (Team)session.getById(id);
        tx.commit();
        session.close();

    }

}
