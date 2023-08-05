package brew.crew.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import brew.crew.app.Entities.Team;

@SpringBootApplication
@RestController
public class StarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(StarterApplication.class, args);
        System.out.println("App Started \n");
    }

    //This display the team name to localhost:8080/misc webpage
    @GetMapping("/")
    public String showBrewTeam() {
        Team team = new Team();
        return team.getTeamName();
    }

}
