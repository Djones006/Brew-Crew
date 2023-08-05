package brew.crew.app.services;

import brew.crew.app.Entities.Team;
import brew.crew.app.repositories.TeamRepository;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class TeamCRUDService {

    @Autowired
    private TeamRepository teamRepository;

    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    public Optional<Team> getTeamById(int id) {
        return teamRepository.findById(id);
    }


    public Team getTeamByTeamName(String teamName) {
        return teamRepository.findByTeamName(teamName);
    }

    public Team add(@Valid Team teamToAdd) throws Exception {
        Team teamSaved = null;
        try {
            teamSaved = teamRepository.save(teamToAdd);
        } catch (Exception e) {
            log.error("context", e);
            throw new Exception("There was an error adding new team.");
        }
        return teamSaved;
    }
}
