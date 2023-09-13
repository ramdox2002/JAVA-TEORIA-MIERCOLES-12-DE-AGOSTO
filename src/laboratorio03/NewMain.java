/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio03;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author USUARIO
 */
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        int qty;
        String code, name, product;
        double money, price;
        
        
        Map<String, Object> dictionary_1 = new HashMap<>();
        dictionary_1.put("product", "TV");
        dictionary_1.put("price", 1000.0);
        dictionary_1.put("code", "#123");
        dictionary_1.put("name", "Juanito");
        dictionary_1.put("qty", 3.0);
        
        Map<String, Object> dictionary_2 = new HashMap<>();
        dictionary_2.put("product", "Laptop");
        dictionary_2.put("price", 3000.0);
        dictionary_2.put("code", "#666");
        dictionary_2.put("name", "Pedrito");
        dictionary_2.put("qty", 30.0);
        
        List<Map<String, Object>> inventary = new ArrayList<>();

        
        inventary.add(dictionary_1);

        inventary.add(dictionary_2);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite cuanto piensa gastar: ");
        money = scanner.nextDouble();
 
                
        for (Map<String, Object> item : inventary) {
            String productName = (String) item.get("product");
            double productPrice = (double) item.get("price");
            
            if (money >= productPrice) {
                System.out.println("Puedes comprar " + productName + " porque tienes suficiente dinero.");
            } else {
                System.out.println("No puedes comprar " + productName + " porque no tienes suficiente dinero.");
            }
        }

        
        // System.out.println(inventary);
        
    }
}