package org.collection.list;

import javax.crypto.spec.PSource;
import java.util.Scanner;
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        int choice = 0;
        int position, element;

        Scanner sc = new Scanner(System.in);

        while (choice <= 4) {
            System.out.println("Stack Operation : ");
            System.out.println("1 Push an element");
            System.out.println("2 Pop an element");
            System.out.println("3 Search an element");
            System.out.println("Your choice :");

            choice = Integer.parseInt(sc.next());

            switch (choice) {
                case 1:
                    System.out.println("In");
                    element = Integer.parseInt(sc.next());
                    st.push(element);
                    break;

                case 2 :

                    Integer obj = st.pop();
                    System.out.println("object popped : " + obj);
                    break;

                case 3 :
                    System.out.println("insert element to search : ");
                    element = Integer.parseInt(sc.next());
                    position = st.search(element);
                    if (position == -1)
                        System.out.println("element not found..");
                    else
                        System.out.println("element found at position = " + position);

                    break;

                default:
                    return;

            }

            System.out.println("Stack contest : " + st);


        }

    }
}
