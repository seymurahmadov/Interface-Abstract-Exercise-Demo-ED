import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class Main {
    public static void main(String[] args) {

LocalDate birthday =  LocalDate.of(1999,05,20);
        LocalDate birthday2 =  LocalDate.of(1999,05,20);


        Customer customer1 = new Customer(1,"Seymur" , "Ahmadov", birthday   , "5125155");
        Customer customer2 = new Customer(2,"Vusal" , "Ahmadov", birthday2,"515415");

        LocalDate yearOfGame1 =  LocalDate.of(2012,05,20);
        LocalDate yearOfGame2 =  LocalDate.of(2018,05,20);


        Game game1 = new Game("PS22",145, yearOfGame1, 150);
        Game game2 = new Game("Fifa" , 100, yearOfGame2,250);

        Campaign campaign1 = new Campaign("FSSV" , 155000,275);

        CustomerManager customerManager1 = new CustomerManager();
        customerManager1.register(customer1);
        customerManager1.update(customer1);
        customerManager1.delete(customer1);

        GameManager gameManager1 = new GameManager();
        gameManager1.sellGame(game1,customer1,campaign1);

        CampaignManager campaignManager = new CampaignManager();
        campaignManager.newCampaignSign(campaign1);
        campaignManager.update(campaign1);
        campaignManager.delete(campaign1);




    }
}
