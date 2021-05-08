package Abstract;

import Entity.Campaign;
import Entity.Game;
import Entity.Player;

public interface ShopService {
    void sell(Game game, Player player);
    void sellWithCampaign(Game game, Player player, Campaign campaign);
}
