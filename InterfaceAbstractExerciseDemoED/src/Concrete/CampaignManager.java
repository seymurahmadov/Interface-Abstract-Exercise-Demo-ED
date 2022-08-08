package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICampaignManager;
import Entities.Campaign;

public class CampaignManager implements ICampaignManager {
    @Override
    public void newCampaignSign(Campaign campaign) {
        System.out.println("Yeni kampanya girisi Kaydedildi. Yeni giris" + campaign.getNameOfCampaign() );
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getNameOfCampaign() + " Silindi");
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println(campaign.getNameOfCampaign() + " Bilgiler guncellendi");
    }
}
