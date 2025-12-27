package com.leetcode.coding.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComplimentNumber {
    public static void main(String[] args) {
        complimentNew(2147483647);
        compliment(2147483647);
    }

    private static int complimentNew(int num){
        int bit = 0;
        while (bit>=num){
            bit<<=2;
        }
        System.out.println(bit);
        return 0;
    }

    private static int compliment(int num){
        int power=1;
        List<Integer> list = new ArrayList<>();
        list.add(1);

        while(num>power){
            int temp = power;
            temp*=2;
            if(num<temp && num>power) {
                break;
            }
            power=temp;
            //System.out.println(power);
            list.add(power);
        }

        int arr[] = new int[list.size()];
        int sum=0;
        //System.out.println("list.size : " +list.size());
        for (int i=list.size()-1;i>=0;i--){
            sum+=list.get(i);
            if(sum<=num){
                arr[i]=1;
            }else {
                sum-=list.get(i);
            }
        }

        //System.out.println(Arrays.toString(arr));
        sum=0;
        for(int i=0;i<arr.length;i++) {
            arr[i] = arr[i] == 1 ? 0 : 1;
            if (arr[i]==1) {
                sum+=list.get(i);
            }
        }

        //System.out.println(Arrays.toString(arr));
        //System.out.println(sum);
        return sum;
    }
}
