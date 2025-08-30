package PracticeProgramsHere;


import javax.management.ObjectName;

class Node {
    Object ele;
    Node next;


    public Node(Object ele) {
        this.ele = ele;
    }

    public Node(Object ele, Node next) {

        this.ele = ele;
        this.next = next;
    }
}

public class DSAImplements {

   int count;
   Node[]a=new Node[10];
   public int size(){
       return count;
   }
   public boolean isEmpty(){
       return count==0;

   }
   public void display(){
       for (int i=0;i<a.length;i++){
           Node curr=a[i];
           while (curr!=null){
               System.out.println(curr.ele);
               curr=curr.next;
           }
       }
   }

   public boolean contains(Object ele){
       int hc=Math.abs(ele.hashCode());
       int index=hc%a.length;
       Node curr=a[index];
       while (curr!=null){
           if (curr.ele.equals(ele))return true;
           curr=curr.next;
       }
       return false;
   }


   public boolean add(Object ele){
       int hc=Math.abs(ele.hashCode());
       int index=hc%a.length;
       if (a[index]==null){
           a[index]=new Node(ele);
           count++;
           return  true;
       }
       Node curr=a[index];
       Node temp=null;
       while (curr!=null){
           if (curr.ele.equals(ele))return false;
           temp=curr;
           curr=curr.next;
       }
       temp.next=new Node(ele);
       count++;
       return true;
   }





}
