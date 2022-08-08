package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.IGameManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class GameManager implements IGameManager {
    @Override
    public void sellGame(Game game, Customer customer, Campaign campaign) {
        System.out.println(campaign.getNameOfCampaign() + " Kampaniyasinin " +  game.getNameOfGame() + " Oyunu "
                + customer.getFirstName() + " " + customer.getLastName()
                + " tarafinda satin alindi" );
    }
}
