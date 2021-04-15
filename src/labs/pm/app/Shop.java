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
 * @version 4.0
 * @author gpbonillas
 */
public class Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        ProductManager pm = new ProductManager("en-GB");
        
        pm.parseProduct("D,101,Tea,1.99,0,2019-09-19");        
        pm.printProductReport(101);        

        pm.parseReview("101,4,Nice hot cup of tea");        
        pm.parseReview("101,2,Rather weak tea");
        pm.parseReview("101,4,Fine tea");
        pm.parseReview("101,4,Good tea");
        pm.parseReview("101,5,Perfect tea!");
        pm.parseReview("101,3,Just add some lemon");        
        pm.printProductReport(101);
        
        pm.parseProduct("F,103,Cake,3.99,0,2019-09-19");       
        pm.printProductReport(103);
          
    }
    
}
