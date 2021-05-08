package Concreate;

import Abstract.GameService;
import Entity.Game;
import MernisServiceAdapter.MernisServiceAdapter;

public class GameManager implements GameService {
    public GameManager(MernisServiceAdapter mernisServiceAdapter) {
    }

    @Override
    public void add(Game game) {
     System.out.println(game.getGameName()+"successfully  added.");
    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getGameName()+"successfully  deleted.");
    }

    @Override
    public void update(Game game) {
        System.out.println(game.getGameName()+" successfully  updated.");
    }
}
