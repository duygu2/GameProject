package Concreate;

import Abstract.CampaignService;
import Entity.Campaign;

public class CampaignManager implements CampaignService {
    @Override
    public void add(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+" successfully added.");
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+" successfully deleted.");
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+" successfully updated.");
    }
}
