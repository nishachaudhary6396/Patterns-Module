// Pattern 1 ...
package Patterns;
import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows & columns");
        int m = sc.nextInt();
        int n = sc.nextInt();
        for(int i = 1;i<=m;i++){
            for(int j = 1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// Pattern 2 [ABCDE]...
package Patterns;
import java.util.Scanner;
public class PatternABCD {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print((char)(i+64) + " ");
            }
            System.out.println();
        }
    }
}

// Pattern 3 [Number Triangle]
package Patterns;
import java.util.Scanner;
public class NumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
    }

// Pattern 4 [Alphabet Square]

package Patterns;
import java.util.Scanner;
public class AlphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
    }
}


// Pattern 4 [ Mixture Triangle]..
package Patterns;
import java.util.Scanner;
public class MixtureTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print((char)(j+64)+" ");
                } else {
                   System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}

// Pattern 5 [Number Square]..
package Patterns;
import java.util.Scanner;
public class NumberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

// Pattern 5 [Number Triangle]..
package Patterns;
import java.util.Scanner;
public class NumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
    }

// Pattern 6 []pattern abcd]..
package Patterns;
import java.util.Scanner;
public class Patterabcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print((char)(j+96) + " ");
            }
            System.out.println();
        }
    }
}


// Pattern 7 [Star square]..
package Patterns;
import java.util.Scanner;
public class starSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//Pattern 8[Triangle Ques]..
package Patterns;
import java.util.Scanner;
public class TraingleQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}


//Pattern 9 [Triangle reverse]..
package Patterns;
import java.util.Scanner;
public class TriangleReverse {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a no. : ");
     int n = sc.nextInt();
     for(int i = 1;i<=n;i++){
         for(int j = 1;j<=n+1-i;j++){
             System.out.print("*");
         }
         System.out.println();
     }
    }
}

//Pattern 10 [Triangle reverse 2]..
package Patterns;
import java.util.Scanner;
public class TriangleReverse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
        for(int j = 1;j<=n+1-i;j++){
        System.out.print(j+ " ");
        }
        System.out.println();
        }
    }
}

//Pattern 11 [Triangle reverse 3]..
package Patterns;
import java.util.Scanner;
public class TriangleReverse3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a no: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
}

//Pattren 12[Number bridge]..
package CompositePatterns;
import java.util.Scanner;
public class NumberBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.: ");
        int n = sc.nextInt();
        for(int i =1;i<=2*n-1;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        n--;
        for(int i=1;i<=n;i++){
            int a=1;
            for(int j =1;j<=n+1-i;j++){
                System.out.print(a+++" ");
            }
            for(int j =1;j<=2*i-1;j++){
                System.out.print(" "+" ");
                a++;
            }
            for(int j =1;j<=n+1-i;j++){
                System.out.print(a+++" ");
            }
            System.out.println();
        }
    }
}

//Pattern 13[Number pyramid pallindrome]..
package CompositePatterns;
import java.util.Scanner;
public class NumberPyramidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for(int i =1; i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" "+" ");
                }
                for(int j =1;j<=i;j++){
                    System.out.print(j+" ");
                }
                for(int j=i-1;j>=1;j--){
                    System.out.print(j+" ");
                }
        System.out.println();
        }
    }
}

//Pattern 14[Number Spiral]..
package CompositePatterns;
import java.util.Scanner;
public class NumberSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int n = sc.nextInt();
        for(int i =1;i<=2*n-1;i++){
            for(int j =1;j<=2*n-1;j++){
                System.out.print(Math.min(i,j)+" ");
            }
            System.out.println();
        }
    }
}

//Pattren 15[Rhombus]..
package CompositePatterns;
import java.util.Scanner;
public class Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number" );
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

//Pattern 16[Star bridge]..
package CompositePatterns;
import java.util.Scanner;
public class StarBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr a number: ");
        int n = sc.nextInt();
        for(int i=1;i<=2*n-1;i++){
            System.out.print("*"+" ");
        }
        System.out.println();
        n--;
        for(int i =1; i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print("*"+" ");
            }
            for(int j =1;j<=2*i-1;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=n+1-i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}


//Pattern 17[Star diamond]..
package CompositePatterns;
import java.util.Scanner;
public class StarDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int n = sc.nextInt();
        int nsp=n-1;
        int nst = 1;
        for(int i =1;i<=n;i++){
           for(int j =1;j<=nsp;j++){
               System.out.print(" "+" ");
           }
           for(int j=1;j<=nst;j++){
               System.out.print("*"+" ");
           }
           nsp--;
           nst+=2;
           System.out.println();
        }

        nsp = 1;
        nst = nst-4;
        for(int i =1;i<=n-1;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" "+" ");
            }
            for(int j =1;j<=nst;j++){
                System.out.print("*"+" ");
            }
            nsp++;
            nst-=2;
            System.out.println();
        }
    }
}


//Pattern 18 [Star pyramid]..
package CompositePatterns;
import java.util.Scanner;
public class StarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" "+" ");
            }
            for(int j =1;j<=2*i-1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}

//Pattren 19[Star Triangle Composite]..
package CompositePatterns;
import java.util.Scanner;
public class StarTriangleComposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++) {
                System.out.print(" " + " ");
            }
            for(int j=1;j<=i;j++){
                System.out.print((char)(i+96)+" ");
            }
            System.out.println();
        }
    }
}


//Pattern 20[Star Triangle Pyramid 2]..
package CompositePatterns;
import java.util.Scanner;
public class StarTrianglePyramid_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int nsp = n-1;
        int nst = 1;
        for(int i = 1;i<=n;i++){
            for(int j =1;j<=nsp;j++){
                System.out.print(" "+" ");
            }
            for(int j =1;j<=nst;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
            nsp--;
            nst+=2;
        }
    }
}


 



