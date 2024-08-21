

import java.util.Scanner;

public class Task {

    public static void occurance(int[] numbers)
    {
        System.err.println("OCCURANCE OF EACH ELEMENT IN ARRAY: ");
        int[] visited = new int[numbers.length];

        int i , j , count;

        for(i = 0 ; i < numbers.length ; i ++)
        {
            visited[i] = 0;
        }

        for(i = 0 ; i < numbers.length ; i++)
        {


            if(visited[i] == 1)
                continue;

            count = 1;

            for(j = i+1 ; j < numbers.length ; j++)
            {
                if(numbers[i] == numbers[j])
                {
                    count++;
                    visited[j] = 1;
                }
            }

            System.out.println(numbers[i] + " found " + count + " times ");

        }



    }

    //---------------------------------------------------------------------

    public static void duplicate(int[] numbers)
    {

        // TODO Auto-generated method stub
        int i , j;
        boolean flag = false;

        System.out.print("DUPLICATE ELEMENTS IN ARRAY :");


        for(i = 0 ; i < numbers.length ; i++)
        {
            for(j = i+1 ; j < numbers.length ; j++)
            {
                if(numbers[i] == numbers[j])
                {
                    System.out.print(numbers[i] + " ");
                    flag = true;
                }


            }

        }

        if(!flag)
        {
            System.out.println("No duplicate found");
        }

//		System.out.println("-----------------------------------------------------------");
        System.out.println();
    }

    //--------------------------------------------------------------

    public static void ascending(int[] number)
    {

        System.out.print("ARRAY IN ASCENDING ORDER : ");
        int i,j,temp;

        for(i = 0; i < number.length ; i++)
        {
            for(j = i+1; j < number.length;j++)
            {
                if(number[i]>number[j])
                {
                    temp=number[i];
                    number[i]=number[j];
                    number[j] = temp;
                }
            }

        }

        for(i = 0; i <number.length; i++)
        {
            System.out.print(number[i] + " ");
        }

        System.out.println();
    }

    //-----------------------------------------------

    public static void descending(int[] numbers)
    {
        System.out.print("ARRAY IN DESCENDING ORDER : ");
        int i,j,temp;
//
//		for(i = 0; i <3; i++) {
//			System.out.println(number[i]);}
        for(i = 0; i < numbers.length ; i++)
        {
            for(j = i+1; j < numbers.length;j++)
            {
                if(numbers[i]<numbers[j])
                {
                    temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j] = temp;
                }
            }

        }

        for(i = 0; i <numbers.length; i++)
        {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

    }

    //-------------------------------------------------------

    public static void max(int[] numbers)
    {
        System.out.print("LARGEST ELEMENT IN ARRAY : ");
        int max = numbers[0];

        for(int i = 0 ; i < numbers.length ; i++)
        {
            for(int j = i+1 ; j < numbers.length ; j++)
            {
                if(numbers[i] < numbers[j])
                {
                    max = numbers[j] ;
                }

            }
        }

        System.out.println(max);
        System.out.println("-----------------------------------------------------------");


    }


    public static void min(int[] numbers)
    {
        System.out.print("SMALLEST ELEMENT IN ARRAY : ");
        int min = numbers[0];

        for(int i = 0 ; i < numbers.length ; i++)
        {
            for(int j = i+1 ; j < numbers.length ; j++)
            {
                if(numbers[i] > numbers[j])
                {
                    min = numbers[j] ;
                }

            }
        }

        System.out.println(min);
        System.out.println("-----------------------------------------------------------");


    }


    public static void sumOfElements(int[] numbers)
    {
        int sum = 0;

        System.out.print("SUM OF ALL ELEMENTS : ");
        for(int number : numbers)
        {
            sum = sum + number;
        }

        System.out.println(sum);
        System.out.println("-----------------------------------------------------------");

    }


    public static void average(int[]numbers)
    {
        int  sum = 0;

        int size = numbers.length + 1;

        for(int number : numbers)
        {
            sum += number;
        }

        double avg = (double)sum / size;

        System.out.println("AVERAGE OF ALL ELEMENTS : "+ avg);
        System.out.println("-----------------------------------------------------------");

    }


    public static void primeInArray(int[] numbers) {
        System.out.print("PRIME NUMBERS IN ARRAY: ");

        for (int number : numbers)
        {
            if (number <= 1)
            {
                continue;
            }

            boolean isPrime = true;

            for (int i = 2; i <number; i++)
            {
                if (number % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
            {
                System.out.print(number + " ");
            }
        }

        System.out.println();

        System.out.println("-----------------------------------------------------------");

    }


    public static void secondMinMax(int[] a)
    {
        int min, max, min2, max2;

        min = max = a[0];
        min2 = max2 = a[0];

        for (int i = 1; i < a.length; i++)
        {
            if (min > a[i]) {
                min2 = min;
                min = a[i];
            }
            else if (min2 > a[i])
            {
                min2 = a[i];
            }

            if (max < a[i]) {
                max2 = max;
                max = a[i];
            }
            else if (max2 < a[i]) {
                max2 = a[i];
            }
        }

//	        System.out.println("\n..............................................");
//	        System.out.println("Minimum value element is " + min);
        System.out.println("Second minimum value element is " + min2);
//	        System.out.println("Maximum value element is " + max);
        System.out.println("Second maximum value element is " + max2);

        System.out.println("-----------------------------------------------------------");

    }


    public static void reverse(int[] numbers)
    {
        System.out.print("ARRAY IN REVERSE ORDER : ");
        for(int i = numbers.length-1 ; i >= 0 ; i--)
        {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.println("-----------------------------------------------------------");

    }


    public static void composite(int[] numbers)
    {
        System.out.print("COMPOSITE NUMBERS IN ARRAY : ");
        for (int number : numbers)
        {
            if (number <= 1)
            {
                continue;
            }

            boolean isComposite = false;

            for (int i = 2; i <number; i++)
            {
                if (number % i == 0)
                {
                    isComposite = true;
                    break;
                }
            }

            if (isComposite)
            {
                System.out.print(number + " ");
            }
        }

        System.out.println();
        System.out.println("-----------------------------------------------------------");
    }

    public static void elementAtOddIndex(int[] numbers)
    {
        System.out.print("ELEMENT AT ODD INDEX : ");

        for(int i = 1 ; i < numbers.length ; i = i+2)
        {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.println("-----------------------------------------------------------");
    }


    public static void elementAtEvenIndex(int[] numbers)
    {
        System.out.print("ELEMENT AT ODD INDEX : ");

        for(int i = 0 ; i < numbers.length ; i = i+2)
        {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.println("-----------------------------------------------------------");
    }

    public static void meanModMedian(int[] number)
    {
        int i ,avg = 0;
        int sum = 0;
        for( i = 0; i < number.length ; i++)
        {
            sum+=number[i];
        }
        float mean ;
        mean =(float) sum/number.length;
        System.out.println("mean= "+mean);



        //----------------------median----------------------


        double  median;
        if(number.length%2==0)
        {
            median = (number[number.length/2 + 1] + number[number.length/2]) / 2.0;
        }
        else
        {
            median = number[number.length/2];
        }
        System.out.println( "med= "+median);


        //-----------------mode-----------------------------

        int j;
        int maxCount=0;

        int mode=number[0];
        for(i = 0; i < number.length ; i++)
        {
            int count= 0 ;

            for( j = i+1; j < number.length ; j++)
            {

                if(number[j]==number[i])
                    count++;
            }
            if (count > maxCount)
            {
                maxCount = count;
                mode = number[i];
            }
        }
        System.out.println("mod= "+mode);

    }








    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int numbers[] = {5 , 7 , 8 , 3 , 12 , 2 , 7 , 3};

        int option;

//

        while(true)
        {
            System.out.println();
            System.out.println();

            System.out.println("Choose Method : ");

            System.out.println("PRESS  1 : OCCURANCE OF EACH ELEMENT");
            System.out.println("PRESS  2 : DUPLICATE ELEMENTS");
            System.out.println("PRESS  3 : ELEMENTS IN ASCENDING ORDER");
            System.out.println("PRESS  4 : ELEMENTS IN DESCENIDNG ORDER");
            System.out.println("PRESS  5 : LARGEST ELEMENT IN ARRAY");
            System.out.println("PRESS  6 : SMALLEST ELEMENT IN ARRAY");
            System.out.println("PRESS  7 : SUM OF ELEMENTS ");
            System.out.println("PRESS  8 : AVERAGE OF ELEMENTS");
            System.out.println("PRESS  9 : PRIME NUMBERS IN ARRAY");
            System.out.println("PRESS 10 : SECOND MIN_MAX IN ARRAY");
            System.out.println("PRESS 11 : REVESRE ARRAY");
            System.out.println("PRESS 12 : COMPOSITE ELEMENTS IN ARRAY");
            System.out.println("PRESS 13 : ELEMENTS AT ODD INDEX");
            System.out.println("PRESS 14 : ELEMENTS AT EVEN INDEX");
            System.out.println("PRESS 15 : Mean Mod Median");
            System.out.println("PRESS  0 : PRESS 0 TO EXIT");

            System.out.println();
            System.out.println("CHOOSE THE OPTION : ");
            Scanner sc = new Scanner(System.in);

            option = sc.nextInt();

            switch(option)
            {
                case 0 :
                {
                    System.out.println("EXITING...");
                    return;
                }

                case 1 :
                {
                    occurance(numbers);
                    break;
                }
                case 2 :
                {
                    duplicate(numbers);
                    break;
                }
                case 3 :
                {
                    ascending(numbers);
                    break;
                }
                case 4 :
                {
                    descending(numbers);
                    break;
                }
                case 5 :
                {
                    max(numbers);
                    break;
                }
                case 6 :
                {
                    min(numbers);
                    break;
                }
                case 7 :
                {
                    sumOfElements(numbers);
                    break;
                }
                case 8 :
                {
                    average(numbers);
                    break;
                }
                case 9 :
                {
                    primeInArray(numbers);
                    break;
                }
                case 10 :
                {
                    secondMinMax(numbers);
                    break;
                }
                case 11 :
                {
                    reverse(numbers);
                    break;
                }
                case 12 :
                {
                    composite(numbers);
                    break;
                }
                case 13 :
                {
                    elementAtOddIndex(numbers);
                    break;
                }
                case 14 :
                {
                    elementAtEvenIndex(numbers);
                    break;
                }
                case 15 :
                {
                    meanModMedian(numbers);
                }
                default :

                    System.out.println("ENTER VALID OPTION");
            }

        }
    }




}

