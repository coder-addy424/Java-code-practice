package com.nit.abstract_class;

abstract class Food {
    double proteins;
    double fats;
    double carbs;
    double tastyScore;
    abstract void getMacroNutrients();
}
class Egg extends Food
{
    double proteins;
    double fats;
    double carbs;
    int tastyScore=7;
    String type = "non-vegetarian";

    public Egg(double proteins, double fats, double carbs) {
        this.proteins = proteins;
        this.fats = fats;
        this.carbs = carbs;
    }
    String getType()
    {
        return "Egg is "+type;
    }
    int getTastyScore()
    {
        return tastyScore;
    }

    @Override
    void getMacroNutrients() {
        System.out.println("A slice of bread has "+this.proteins+" gms of protein,"+this.fats+" gms of fats and "+this.carbs+" gms of carbohydrates");
    }
}
class Bread extends Food
{
    double proteins;
    double fats;
    double carbs;
    int tastyScore=8;
    String type = "vegetarian";

    public Bread(double proteins, double fats, double carbs) {
        this.proteins = proteins;
        this.fats = fats;
        this.carbs = carbs;
    }
    String getType()
    {
        return "Bread is "+type;
    }
    int getTastyScore()
    {
        return tastyScore;
    }

    @Override
    void getMacroNutrients() {
        System.out.println("A slice of bread has "+this.proteins+" gms of protein,"+this.fats+" gms of fats and "+this.carbs+" gms of carbohydrates");
    }
}