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
import java.util.Comparator;
import java.util.Locale;
import labs.pm.data.Drink;
import labs.pm.data.Food;
import labs.pm.data.Product;
import labs.pm.data.ProductManager;
import labs.pm.data.Rating;

/**
 * {@code Shop} class represents an application that manages Products
 *
 * @version 4.0
 * @author gpbonillas
 */
public class Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductManager pm = new ProductManager("en-GB");

        pm.createProduct(164, "Kombucha", BigDecimal.valueOf(1.99), Rating.NOT_RATED);

        pm.reviewProduct(164, Rating.TWO_STAR, "Looks like tea but is it?");
        pm.reviewProduct(164, Rating.FOUR_STAR, "Fine tea");
        pm.reviewProduct(164, Rating.FOUR_STAR, "This is not tea");
        pm.reviewProduct(164, Rating.FIVE_STAR, "Perfect!");
        pm.printProductReport(164);

        pm.printProductReport(101);
        pm.printProductReport(104);

        pm.printProducts(p -> p.getPrice().floatValue() < 2,
                (p1, p2) -> p2.getRating().ordinal() - p1.getRating().ordinal());

        pm.getDiscounts().forEach((rating, discount)
                -> System.out.println(rating + "\t" + discount)
        );
    }
}
