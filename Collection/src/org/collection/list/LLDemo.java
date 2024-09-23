package org.collection.list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

// linked list
public class LLDemo {

    public static void main(String[] args) throws IOException {

        LinkedList<String> ll = new LinkedList<>();

        ll.add("Kaushik");
        ll.add("don");
        ll.add("nayak");
        ll.add("Kaushik");

        System.out.println("Linked List : " + ll);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String element;
        int position, choice = 0;

        while (choice < 4) {
            System.out.println("Linked List Operation : ");
            System.out.println("1 Add Elemenet : ");
            System.out.println("2 Remove an element : ");
            System.out.println("3 Change an element : ");
            System.out.println("4 exit");

            System.out.println("Your choice : ");
            choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1:
                    System.out.println("Enter Element : ");
                    element = br.readLine();
                    System.out.println("At what position : ");
                    position = Integer.parseInt(br.readLine());
                    break;

                case 2:
                    System.out.println("Enter Position : ");
                    position = Integer.parseInt(br.readLine());
                    ll.remove(position-1);
                    break;

                case 3 :
                    System.out.println("Enter Position : ");
                    position = Integer.parseInt(br.readLine());
                    System.out.println("Enter New Element : ");
                    element = br.readLine();
                    ll.set(position-1 , element);

                default:
                    return;


            }

            System.out.println("List = ");
            Iterator it = ll.iterator();

            while (it.hasNext())
                System.out.println(it.next() + " ");
        }

    }
}
