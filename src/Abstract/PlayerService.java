package Abstract;

import Entity.Game;
import Entity.Player;

public interface PlayerService {

    void add(Game game);
    void delete(Game game);
    void update(Game game);
}
