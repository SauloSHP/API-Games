package br.gamesapp.service;

import br.gamesapp.model.Game;
import br.gamesapp.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @GetMapping("/games")
    public List<Game> listar() {
        return gameRepository.findAll();
    }

    @GetMapping("/games/{id}")
    public Game listarJogoPorId(@PathVariable Long id){
        return gameRepository.findById(id).get();
    }

    @PostMapping("/games")
    @ResponseStatus(HttpStatus.CREATED)
    public Game save(@RequestBody Game game) {
        return gameRepository.save(game);
    }



}
