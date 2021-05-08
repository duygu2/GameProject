package Concreate;

import Abstract.ShopService;
import Entity.Campaign;
import Entity.Game;
import Entity.Player;

public class ShopManager implements ShopService {
    @Override
    public void sell(Game game, Player player) {
        System.out.println("User : " + player.getFirstName() +" "+ player.getLastName());
        System.out.println("Game: " + game.getGameName());
        System.out.println(game.getPrice() + "$ bought.");
    }

    @Override
    public void sellWithCampaign(Game game, Player player, Campaign campaign) {
        System.out.println("User : " + player.getFirstName() +" "+ player.getLastName());
        System.out.println("Game : " + game.getGameName());
        System.out.println(game.getPrice()-campaign.getDiscountAmount() + "$" + campaign.getCampaignName() + " bought.");

    }

}


