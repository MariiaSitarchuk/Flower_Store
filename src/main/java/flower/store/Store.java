/*
package store;
import java.util.*;

public class Store {
    
    public void search() {
        Scanner scanner = new Scanner(System.in);
        FlowerBucket fl_buck = new FlowerBucket();
        boolean searching = True;

        while (searching == True) {
            boolean check = True;
            Flower flower = new Rose();
            String fl_type = "";
            int fl_amount = 0;
            
            // lets get a Flower (type)
            while (check == True) {
                System.out.println(
                    "Enter a type of flower you are searching for: "
                    );
                String fl_type_init = scanner.nextLine();
                fl_type = fl_type_init.toUpperCase();
            
                if (fl_type.equals("CHAMOMILE")) {
                    flower = new Chamomile();
                    check = False;
                }
                else if (fl_type.equals("ROSE")) {
                    check = False;
                }
                else if (fl_type.equals("TULIP")) {
                    flower = new Tulip();
                    check = False;
                }
                else {
                    System.out.println(
                        "Possible types: Chamomile, Rose, Tulip."
                        );
                }
            }
            // we have a Flower
        
            check = True;
            boolean errorer = False;
            
            // lets get an amount for a FlowerPack
        
            while (check == True) {
                System.out.println("Enter an amount of flowers you need: ");
                String fl_amount_init = scanner.nextLine();
                try {
                    int num = Integer.valueOf(fl_amount_init);
                } catch (Exception e) {
                    errorer = True;
                }

                if (errorer == True) {
                    System.out.println(
                        "The amount should be a positive integer."
                        );
                }
                else {
                    fl_amount = Integer.valueOf(fl_amount_init);
                    if (fl_amount <= 0) {
                        System.out.println(
                            "The amount should be a positive integer."
                            );
                    }
                    else {
                        check = False;
                        errorer = False;
                    }
                }
            }
         
            // we got the amount, so lets make a FlowerPack
            // and add it to the FlowerBucket
        
            FlowerPack fl_pack = new FlowerPack(flower, fl_amount);
            double pack_price = fl_pack.getPrice();
            Sysytem.out.println(
                "The price of this pack will be: " + pack_price
                );
            check = True;
            
            System.out.println("Do you want to add it to your bucket?");
            System.out.println("Please write 'Y' if Yes, 'N' if No.");
            while (check == True) {
                String user_wish_init = scanner.nextLine();
                String user_wish = user_wish_init.toUpperCase();
                if (user_wish.equals("Y")) {
                    fl_buck.add(fl_pack);
                    check = False;
                }
                else if (user_wish.equals("N")) {
                    check = False;
                }
                else {
                    System.out.println("Sorry I didn't get that.");
                    System.out.println("Please write 'Y' if Yes, 'N' if No.");
                }
            }

            check = True;

            System.out.println("Do you want to find more flowers?");
            System.out.println("Please write 'Y' if Yes, 'N' if No.");
            while (check == True) {
                String user_wish_init = scanner.nextLine();
                String user_wish = user_wish_init.toUpperCase();
                if (user_wish.equals("Y")) {
                    check = False;
                }
                else if (user_wish.equals("N")) {
                    check = False;
                    searching = False;
                }
                else {
                    System.out.println("Sorry I didn't get that.");
                    System.out.println("Please write 'Y' if Yes, 'N' if No.");
                }
            }
        }
        
        double buck_price = fl_buck.getPrice();
        Sysytem.out.println("The price of your bucket will be: " + buck_price);
    }
}

*/
