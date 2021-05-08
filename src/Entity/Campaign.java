package Entity;

public class Campaign {
    private int id;
    private String campaignName;
    private int discountAmount;

    public Campaign(int id, String campaignName, int discountAmount) {
        super();
        this.setId(id);
        this.setCampaignName(campaignName);
        this.setDiscountAmount(discountAmount);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public int getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(int discountAmount) {
        this.discountAmount = discountAmount;
    }
}
