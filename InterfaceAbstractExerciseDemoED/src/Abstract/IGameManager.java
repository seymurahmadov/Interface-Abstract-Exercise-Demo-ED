package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface IGameManager {
    void sellGame(Game game, Customer customer, Campaign campaign);

}
