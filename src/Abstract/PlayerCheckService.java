package Abstract;

import Entity.Game;
import Entity.Player;

public interface PlayerCheckService {
    boolean CheckIfRealPerson(Player player) throws Exception;

}
