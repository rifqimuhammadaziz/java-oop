package Constant;

import Constant.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Constant.APPLICATION);
        System.out.println(Constant.VERSION);
        System.out.println(
                MathUtil.sum(1,1,1,1,1)
        );

        Country.City city = new Country.City();
        city.setName("Tegal");
        System.out.println(city.getName());

        //
        System.out.println("Total of Processor: " + Application.PROCESSORS);
    }
}
