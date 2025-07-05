/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tigergreat.bookdescriptioncounter;

/**
 *
 * @author AM I
 */import java.util.Scanner;
public class BookdescriptionCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the book description:");
        String bookDescription = scanner.nextLine();
        String lowerCaseDescription = bookDescription.toLowerCase();
        String wordToCount = "uganda";
        String[] words = lowerCaseDescription.split("\\W+"); 
        int count = 0;
        for (String word : words) {
            if (word.equals(wordToCount)) {
            }
    }
}
}
