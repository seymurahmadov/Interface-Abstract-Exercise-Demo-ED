package Abstract;

import Entities.Campaign;

public interface ICampaignManager {
    void newCampaignSign(Campaign campaign);
    void delete(Campaign campaign);
    void update(Campaign campaign);
}
