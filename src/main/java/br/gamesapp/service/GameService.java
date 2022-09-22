package br.gamesapp.service;

import br.gamesapp.model.Game;
import br.gamesapp.repository.GameRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GameService {

    private GameRepository gameRepository;

    public void save(Game game) {
        gameRepository.save(game);
    }

}
