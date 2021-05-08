package Concreate;


import Abstract.PlayerCheckService;
import Entity.Player;

public class PlayerCheckManager implements PlayerCheckService {
    public boolean CheckIfRealPerson(Player player) {

        return true;
    }
}
