package practice;

import practice.Model.*;

import java.util.Scanner;

public class MainClass implements Operations {
    Model model = new Model();

    @Override
    public void showCars() {

        model.setCardID(1);
        model.setCarName("Audi R8");
        model.setBrand("Audi");
        model.setPrice((float) 2.30);

        System.out.println("Your Dream Car specification is :\n");
        System.out.println(model.getCardID() + "\t" + model.getCarName() + "\t" + model.getBrand() + "\t" + model.getPrice() + "\t");
    }

    @Override
    public void getCar(int id, String carName, String carBrand, float price) {
        model.setCardID(id);
        model.setCarName(carName);
        model.setBrand(carBrand);
        model.setPrice(price );
    }


    @Override
    public String looksBeautiful(String beauty) {
        if (beauty.equals("Audi R8")) {
            return "This is just Awesome Car, I love it :) ('')";
        }
        return "Another awesome car!!!";

    }

    public static void main(String[] args) {

        MainClass ms = new MainClass();
        ms.showCars();
        String be = ms.looksBeautiful("Audi R8");
        System.out.println(be);
    }
}
