import java.util.Scanner;
public class SortingnameDemo2
{
    public static void main(String[] args) 
    {
        int count;
        Char  temp;
        Scanner scan = new Scanner(System.in);
        
        //User will be asked to enter the count of strings 
        System.out.print("Enter number of character you would like to enter:");
        count = scan.nextInt();
        
        
        Char ch[] = new Char [count];
        Scanner scan2 = new Scanner(System.in);
        
        //User is entering the strings and they are stored in an array
        System.out.println("Enter the alphabet  one by one:");
        for(int i = 0; i < count; i++)
        {
            ch[i] = scan2.nextLine();
        }
        scan.close();
        scan2.close();
        
        //Sorting the strings
        for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) { 
                if (ch[i].compareTo(ch[j])>0) 
                {
                    temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        
        //Displaying the strings after sorting them based on alphabetical order
        System.out.print("Strings in Sorted Order:");
        for (int i = 0; i <= count - 1; i++) 
        {
            System.out.print(ch[i] + ", ");
        }
    }
}