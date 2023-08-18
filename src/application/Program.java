package application;

import entities.Department;
import entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1, "Books");

        Seller seller = new Seller(21, "Lucas", "Lucas@gmail.com", new Date(), 300.0, obj);
        System.out.println(seller);

    }
}
