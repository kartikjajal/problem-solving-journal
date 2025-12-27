package com.leetcode.coding.questions;

import java.math.BigInteger;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Node {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder x=new StringBuilder();
        StringBuilder y=new StringBuilder();
        StringBuilder a=new StringBuilder();
        StringBuilder b=new StringBuilder();
        while(l1!=null || l2!=null)   {
            if(l1!=null){
                x.append((l1.val));
                l1=l1.next;
                a=new StringBuilder((l1.val)+a.toString());
            }
            if(l2!=null){
                y.append((l2.val));
                l2=l2.next;
            }
        }
        StringBuilder sb1=new StringBuilder();
        for(int i=x.length()-1;i>=0;i--) {
            sb1.append(x.charAt(i));
        }

        StringBuilder sb2=new StringBuilder();
        for(int i=y.length()-1;i>=0;i--) {
            sb2.append(y.charAt(i));
        }

        /*StringBuilder prefix=new StringBuilder();
        if(sb1.length()<sb2.length()){
            for (int i = sb1.length(); i<sb2.length(); i++){
                prefix.append("0");
            }
            prefix.append(sb1);
            sb1=prefix;
        }

        if(sb2.length()<sb1.length()){
            for (int i = sb2.length(); i<sb1.length(); i++){
                prefix.append("0");
            }
            prefix.append(sb2);
            sb2=prefix;
        }*/

        //System.out.println("prefix : "+prefix);

        //System.out.println(sb1);
        //System.out.println(sb2);

        BigInteger sum= new BigInteger(sb1.toString()).add(new BigInteger(sb2.toString()));
        //System.out.println(sum);

        BigInteger ix=sum;
        //System.out.println(ix);
        ListNode firstNode = null;
        ListNode currentNode = null;
        int count = new StringBuffer(ix.toString()).length();
        //System.out.println("init count : "+count);
        do {
            count-- ;
            int mod= ix.remainder(new BigInteger("10")).intValue();
            ix=ix.divide(new BigInteger("10"));

            if(firstNode==null){
                firstNode = new ListNode((int)mod, new ListNode());
                //System.out.println("NodeVal : "+mod);
                if((count) >0)
                    currentNode=firstNode.next;
                else
                    firstNode.next=null;
            }else{
                currentNode.val=(int)mod;
                //System.out.println("current node val : "+currentNode.val);
                if(count >0)
                    currentNode.next=new ListNode();
                currentNode=currentNode.next;
                //System.out.println("next node val : "+mod);
            }

            //System.out.println("count : "+count);
        } while(count >0);

        return firstNode;
    }
}