package Entities;

public class Campaign {
    private String nameOfCampaign;
    private int valueOfCampaign;

    private  int price;

    public Campaign(){

    }

    public Campaign(String nameOfCampaign, int valueOfCampaign,int price){
        this.setNameOfCampaign(nameOfCampaign);
        this.setValueOfCampaign(valueOfCampaign);
        this.price=price;

    }


    public String getNameOfCampaign() {
        return nameOfCampaign;
    }

    public void setNameOfCampaign(String nameOfCampaign) {
        this.nameOfCampaign = nameOfCampaign;
    }

    public int getValueOfCampaign() {
        return valueOfCampaign;
    }

    public void setValueOfCampaign(int valueOfCampaign) {
        this.valueOfCampaign = valueOfCampaign;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
