package Recursion.src;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Recursion {
    public static void main(String[] args) {

        recursion(1 , 5);
    }

    private static void recursion(int i, int j) {
        if (i <= j){
            System.out.println(i);
            i++;
            recursion(i , j);
        }
    }
}