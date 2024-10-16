1.Sweets Shop


import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Read initial amount of money (X) and number of laddus bought (N)
        int X = sc.nextInt();  // Initial amount of money
        int N = sc.nextInt();  // Number of laddus bought

        // Calculate the remaining money after buying N laddus
        int remainingMoney = X - (N * 10);  // Each laddu costs Rs. 10

        // Calculate how many jalebis Sushil can buy with the remaining money
        int jalebis = remainingMoney / 20;  // Each jalebi costs Rs. 20

        // Output the number of jalebis
        System.out.println(jalebis);

        // Close the scanner
        sc.close();
    }
}





2.Long Queue



  import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        // Read number of test cases
        int T = sc.nextInt();
        
        // Loop over each test case
        while (T-- > 0) {
            // Read the number of people in the queue (including Sushil)
            int N = sc.nextInt();
            
            // Read the wealth of each person in the queue
            int[] wealth = new int[N];
            for (int i = 0; i < N; i++) {
                wealth[i] = sc.nextInt();
            }
            
            // Sushil is the last person in the queue (at position N-1) with wealth of wealth[N-1]
            int sushilWealth = wealth[N - 1];
            int position = N; // Start from the last position
            
            // Traverse from the second last person to the first person
            for (int i = N - 2; i >= 0; i--) {
                // Check if Sushil can bully this person
                if (wealth[i] <= sushilWealth / 2) {
                    position--; // Sushil moves forward
                } else {
                    break; // Sushil cannot bully this person, stop
                }
            }
            
            // Output the final position of Sushil
            System.out.println(position);
        }
        
        sc.close();
    }
}



3.Even Numbers Hate

  import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int T = sc.nextInt();
        
        while (T-- > 0) {
            // Read the size of the array
            int N = sc.nextInt();
            
            int[] A = new int[N];
            int oddCount = 0, evenCount = 0;
            
            // Read the array and count odd and even numbers
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                if (A[i] % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
            
           
            if (oddCount > 0) {
               System.out.println(evenCount+(oddCount+1)/2);
            }
            else
            System.out.println(0);
        }
        
        sc.close();
    }
}


4.Partition Score


  import java.util.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine()); // Number of test cases
        
        while (T-- > 0) {
            // Read N and K
            String[] firstLine = br.readLine().split(" ");
            int N = Integer.parseInt(firstLine[0]);
            int K = Integer.parseInt(firstLine[1]);
            
            // Read the array A
            String[] arrayInput = br.readLine().split(" ");
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(arrayInput[i]);
            }
            
            // Sort the array
            Arrays.sort(A);
          if(K==1){
               System.out.println(2*A[N-1]+A[0]+A[N-2]);
          }else {
               System.out.println(A[0]+A[N-K-1]+A[N-1]+A[N-2]);
          }
        }
        
    }
}




5.Count Triplets

  import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt(); // Number of test cases
        
        while (t-- > 0) {
            int n = sc.nextInt(); // Size of the array
            
            long[] vec = new long[n + 1]; // Using long to match 'int long long' in C++
            for (int i = 1; i <= n; i++) {
                vec[i] = sc.nextLong();
            }
            
            long ans = 0;
            
            for (int i = 1; i <= n; i++) {
                // Check forward (i + j)
                for (int j = 0; j <= 99 && i + j <= n; j++) {
                    int index = i + j;
                    long diff = Math.abs(vec[i] - vec[index]);

                    if (diff < j) {
                        continue;
                    }

                    if (diff == j) {
                        ans += (j + 1);
                    } else if (diff > j && (diff - j) % 2 == 0) {
                        long mid1 = (i + index - diff) / 2;
                        long mid2 = (i + index + diff) / 2;

                        if ((i + index - diff) % 2 == 0 && mid1 >= 1 && mid1 <= n) {
                            ans += 1;
                        }

                        if ((i + index + diff) % 2 == 0 && mid2 >= 1 && mid2 <= n) {
                            ans += 1;
                        }
                    }
                }

                // Check backward (i - j)
                for (int j = 1; j <= 99 && i - j >= 1; j++) {
                    int index = i - j;
                    long diff = Math.abs(vec[i] - vec[index]);

                    if (diff < j) {
                        continue;
                    }

                    if (diff == j) {
                        ans += (j + 1);
                    } else if (diff > j && (diff - j) % 2 == 0) {
                        long mid1 = (i + index - diff) / 2;
                        long mid2 = (i + index + diff) / 2;

                        if ((i + index - diff) % 2 == 0 && mid1 >= 1 && mid1 <= n) {
                            ans += 1;
                        }

                        if ((i + index + diff) % 2 == 0 && mid2 >= 1 && mid2 <= n) {
                            ans += 1;
                        }
                    }
                }
            }

            System.out.println(ans);
        }

        sc.close(); // Close the scanner
    }
}




