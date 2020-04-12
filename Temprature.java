package PracArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        int sum = 0, numDay = 0;
        List<Integer> temDays = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Input number days: ");
        int n = input.nextInt();
        for (int i = 0; i < n ; i ++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input temperature day " + (i+1));
            int temp = scanner.nextInt();
            temDays.add(temp);
            sum += temp;
        }
        for (int i = 0; i < n; i++){
            if (temDays.get(i) > (sum/n)){
                numDay++;
            }
        }
        System.out.println("Temperature of all days is : " + temDays);
        System.out.println("Average temperature of the day is : " + (sum / n));
        System.out.println("Number days if temperature more than Average temperature of the day is : " + numDay);
    }
}
