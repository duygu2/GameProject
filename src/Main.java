import Concreate.GameManager;
import Concreate.PlayerManager;
import Concreate.ShopManager;
import Entity.Campaign;
import Entity.Game;
import Entity.Player;
import MernisServiceAdapter.MernisServiceAdapter;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Game game=new Game(1,"PUBG",50,"Mobile-Game");
        Game game2=new Game(2,"Mobile legend",100,"Mobile-Games");
        Game game3=new Game(3,"VALORANT",200,"Video-Game");

        Campaign campaign1=new Campaign(123,"Summer Campaign",30);
        Campaign campaign2=new Campaign(124,"Spring Campaign",20);

        Player player=new Player(2343,"Duygu","Orhan", LocalDate.of(2001,01,30),"26975604548");
        Player player1=new Player(2353,"Laila","Matar", LocalDate.of(2001,01,30),"99988504518");

        PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
        playerManager.add(game);

        ShopManager shopManager=new ShopManager();
        shopManager.sell(game,player);
        shopManager.sellWithCampaign(game2,player1,campaign2);


    }
}
