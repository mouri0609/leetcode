package test.DJ;

import java.util.Scanner;

public class Coffee {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()){
            int bugNumbers = in.nextInt();
            int efficentNum = in.nextInt();
            int maxCoffee = in.nextInt();


            int[] bugTime = new int[bugNumbers];
            double sumTimes = 0;
            for (int i=0;i<bugNumbers;i++){
                bugTime[i] = in.nextInt();
                sumTimes+=bugTime[i];
            }

            //喝咖啡的实际效果
            int drunkCoffee = maxCoffee*efficentNum*60;
            int unDrunkCoffee = (8-maxCoffee)*60;

            if(sumTimes>drunkCoffee+unDrunkCoffee){
                System.out.println(0);
            }else if (sumTimes<drunkCoffee){
                System.out.println((int) Math.ceil(sumTimes/efficentNum));
            }else {
                System.out.println((int)(sumTimes-drunkCoffee)+Math.ceil(sumTimes/efficentNum));
            }
        }

    }
}
