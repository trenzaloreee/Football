package football.controller;

import football.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import football.service.TeamService;

@RestController
public class TeamController {   //           CRUD

    @Autowired
    TeamService teamService;

//    type    GET                 POST
//    head    /getTeam?id=10       /newTeam
//    body    ---                   json String {name ... players ...}
//                                                                                 TCP (Sockets)
//       postman --> 8080 (Tomcat) --> Controller --> Service --> DAO (Repository) --> 5433 (Postgres database)


    @PostMapping("/newTeam")
    public String save(@RequestBody Team team){
        teamService.save(team);
        return "<b>Team saved successfully!</b>";
    }

}
