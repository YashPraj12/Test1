package com.example.test1;
import java.util.List;
import java.util.Arrays;
public class Food {

    private String name;
    private int calories;
    private double price;
    private int protein;

    public Food(String name, int calories, double price, int protein) {
        setName(name);
        this.calories = calories;
        this.price = price;
        this.protein = protein;
    }

    public void setName(String name){
        if(name.length()>=2){
            this.name=name;
        }
        else {
            throw new IllegalArgumentException( "  Please enter 2 or more characters ");
        }

        public void setCalories(int calories){
            if(calories<0 || calories>2000){
                throw new IllegalArgumentException( " Please enter number between 0 to 2000");
            }
            else{
                    this.calories=calories;
             }
        }
        public void setPrice(double price){
            if(price<0 || price>150){
                throw new IllegalArgumentException( " please enter number between 0 to 150")
            }
            else{
                this.price = price;
            }
        }
        public void setProtein(int protein) {
            if(protein<0 || protein>100){

                throw new IllegalArgumentException(" Please enter a number between 0 to 100");
            }
            else{

                this.protein=protein;
            }
        }

    }


}
