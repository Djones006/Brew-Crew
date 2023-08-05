package brew.crew.app.controllers;

import brew.crew.app.Entities.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import brew.crew.app.services.TeamCRUDService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/team")
public class TeamController {

    @Autowired
    private TeamCRUDService teamCRUDService;

    @GetMapping
    public ResponseEntity<List<Team>> getAllTeams() {
        return new ResponseEntity<List<Team>>(teamCRUDService.getAllTeams(), HttpStatus.OK);
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Optional<Team>> getTeamById(@PathVariable int id) {
//        return new ResponseEntity<Optional<Team>>(teamCRUDService.getTeamById(id), HttpStatus.OK);
//    }

    @GetMapping("/{teamName}")
    public ResponseEntity<Team> getTeamByTeamName(@PathVariable String teamName) {
        return new ResponseEntity<Team>(teamCRUDService.getTeamByTeamName(teamName), HttpStatus.OK);
    }


    @PutMapping
    public ResponseEntity<Team> addTeam(@RequestBody Team teamToAdd) throws Exception{
        return new ResponseEntity<Team>(teamCRUDService.add(teamToAdd), HttpStatus.CREATED);
    }

}
