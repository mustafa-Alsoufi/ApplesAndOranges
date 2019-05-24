import java.util.Scanner;

public class AppleAndOrange {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	System.out.print("Enter The location of the house: ");
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);
        System.out.print("Enter the location of the apple and orange trees: ");
        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);
        System.out.print("Enter the number of apples and oranges fells on the ground: ");
    
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);
        
        int[] apples = new int[m];
        System.out.print("Enter the location of the apples: ");
        String[] applesItems = scanner.nextLine().split(" ");

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }

        int[] oranges = new int[n];
        System.out.print("Enter the location of the oranges: ");
        String[] orangesItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    }

	private static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		
		int appleCounter=0,orangesCounter=0,result=0;

        // 
        for (int i=0;i<apples.length;i++)
        {
            result = a + apples[i];

            if (result >= s && result <= t)
            {
                appleCounter++;
            }
        }
        
        for (int j=0;j<oranges.length;j++)
        {
            result = b + oranges[j];
            if (result >= s && result <= t)
            {
                orangesCounter++;
            }
        }

		
		System.out.println("\nNumber of Apples fells in the house: "+appleCounter);
		System.out.println("Number of Oranges fells in the house: "+orangesCounter);
		
	}

}
