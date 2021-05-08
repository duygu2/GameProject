package Concreate;


import Abstract.PlayerService;
import Entity.Game;
import Entity.Player;
import MernisServiceAdapter.MernisServiceAdapter;

public class PlayerManager implements PlayerService {


    public PlayerManager(MernisServiceAdapter mernisServiceAdapter) {
    }

    @Override
    public void add(Game game) {
        System.out.println(game.getGameName()+" Successfully added");
    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getGameName()+" Successfully deleted");
    }

    @Override
    public void update(Game game) {
        System.out.println(game.getGameName()+" Successfully updated");
    }
}
