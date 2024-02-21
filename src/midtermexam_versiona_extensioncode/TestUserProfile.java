/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author gaksh
 */
public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Choice of genres:");
        UserProfile userProfile = new UserProfile();
        String[] genres = userProfile.getGenres();
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }

        System.out.print("Choose your favorite genre (enter the number): ");
        int num = scanner.nextInt();
        scanner.nextLine(); 
        scanner.close();
        if (num >= 1 && num <= genres.length) {
            String choosed = genres[num - 1];
            userProfile = new UserProfile(name, choosed);
            System.out.println("User profile created successfully!");
            System.out.println("Name: " + userProfile.getUserID());
            System.out.println("Favorite Genre: " + userProfile.getGenre());
        } else {
            System.out.println("Invalid choice!");
        }
    }
}
