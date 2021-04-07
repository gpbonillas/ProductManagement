/*
 * Copyright (C) 2021 gpbonillas
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package labs.pm.app;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Locale;
import labs.pm.data.Drink;
import labs.pm.data.Food;
import labs.pm.data.Product;
import labs.pm.data.ProductManager;
import labs.pm.data.Rating;

/**
 * {@code Shop} class represents an application that manages Products
 * @version 4.0
 * @author gpbonillas
 */
public class Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ProductManager pm = new ProductManager(Locale.UK);
        
        Product p1 = pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.NOT_RATED);        
        pm.printProductReport(p1);       
        p1 = pm.reviewProduct(p1, Rating.FOUR_STAR, "Nice hot cup of tea");
        p1 = pm.reviewProduct(p1, Rating.TWO_STAR, "Rather weak tea");
        p1 = pm.reviewProduct(p1, Rating.FOUR_STAR, "Fine tea");
        p1 = pm.reviewProduct(p1, Rating.FOUR_STAR, "Good tea");
        p1 = pm.reviewProduct(p1, Rating.FIVE_STAR, "Perfect tea!");
        p1 = pm.reviewProduct(p1, Rating.THREE_STAR, "Just add some lemon");
        
        pm.printProductReport(p1);
        
        Product p2 = pm.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        
        p2 = pm.reviewProduct(p2, Rating.THREE_STAR, "Coffee was ok");
        p2 = pm.reviewProduct(p2, Rating.ONE_STAR, "Where is the milk?");        
        p2 = pm.reviewProduct(p2, Rating.FIVE_STAR, "It's perfect with ten spoons of sugar!");
        pm.printProductReport(p2);
        
        Product p3 = pm.createProduct(103, "Cake", BigDecimal.valueOf(3.99), Rating.NOT_RATED, LocalDate.now().plusDays(2));
        
        p3 = pm.reviewProduct(p3, Rating.FIVE_STAR, "Very nice cake");
        p3 = pm.reviewProduct(p3, Rating.FOUR_STAR, "It good, but I've expected more chocolate");
        p3 = pm.reviewProduct(p3, Rating.FIVE_STAR, "This cake is perfect!");
        pm.printProductReport(p3);
        
        
        Product p4 = pm.createProduct(104, "Cookie", BigDecimal.valueOf(2.99), Rating.NOT_RATED, LocalDate.now());
        
        p4 = pm.reviewProduct(p4, Rating.THREE_STAR, "Just another cookie");
        p4 = pm.reviewProduct(p4, Rating.THREE_STAR, "Ok");
        pm.printProductReport(p4);
        
        Product p5 = pm.createProduct(105, "Hot Chocolate", BigDecimal.valueOf(2.50), Rating.NOT_RATED);
        
        p5 = pm.reviewProduct(p5, Rating.FOUR_STAR, "Tasty!");
        p5 = pm.reviewProduct(p5, Rating.FOUR_STAR, "No bad at all");
        pm.printProductReport(p5);


        Product p6 = pm.createProduct(106, "Chocolate", BigDecimal.valueOf(2.50), Rating.NOT_RATED, LocalDate.now().plusDays(3));
        
        p6 = pm.reviewProduct(p6, Rating.TWO_STAR, "Too sweet");
        p6 = pm.reviewProduct(p6, Rating.THREE_STAR, "Better then cookie");
        p6 = pm.reviewProduct(p6, Rating.TWO_STAR, "Too bitter");
        p6 = pm.reviewProduct(p6, Rating.ONE_STAR, "I don't get it!");
        pm.printProductReport(p6);
            
        
        
//        Product p3 = pm.createProduct(103, "Cake", BigDecimal.valueOf(3.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));      
//        Product p4 = pm.createProduct(105, "Cookie", BigDecimal.valueOf(3.99), Rating.TWO_STAR, LocalDate.now());
//        Product p5 = p3.applyRating(Rating.THREE_STAR);       
//        Product p6 = pm.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99),  Rating.FIVE_STAR);
//        Product p7 = pm.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99),  Rating.FIVE_STAR, LocalDate.now().plusDays(2));       
//        Product p8 = p4.applyRating(Rating.FIVE_STAR);       
//        Product p9 = p1.applyRating(Rating.TWO_STAR);       
//        System.out.println(p6.equals(p7));        
//        System.out.println(p1.toString());
//        System.out.println(p2);
//        System.out.println(p3);
//        System.out.println(p4);
//        System.out.println(p5);        
//        System.out.println(p6);
//        System.out.println(p7);
//        System.out.println(p8);
//        System.out.println(p9);
        
    }
    
}
