package Entities;

import java.time.LocalDate;

public class Game {
    private String nameOfGame;
    private int levelsOfGame;
    private LocalDate yearOfGame;
    private double priceOfGame;

    public Game(){

    }

    public Game(String nameOfGame, int levelsOfGame, LocalDate yearOfGame,double priceOfGame){
        this.setNameOfGame(nameOfGame);
        this.setLevelsOfGame(levelsOfGame);
        this.setYearOfGame(yearOfGame);
        this.setPriceOfGame(priceOfGame);
    }


    public String getNameOfGame() {
        return nameOfGame;
    }

    public void setNameOfGame(String nameOfGame) {
        this.nameOfGame = nameOfGame;
    }

    public int getLevelsOfGame() {
        return levelsOfGame;
    }

    public void setLevelsOfGame(int levelsOfGame) {
        this.levelsOfGame = levelsOfGame;
    }

    public LocalDate getYearOfGame() {
        return yearOfGame;
    }

    public void setYearOfGame(LocalDate yearOfGame) {
        this.yearOfGame = yearOfGame;
    }

    public double getPriceOfGame() {
        return priceOfGame;
    }

    public void setPriceOfGame(double priceOfGame) {
        this.priceOfGame = priceOfGame;
    }
}
