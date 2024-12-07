public class StarPatterns {
    public static void regularStar(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(j<=i){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    } 
    
    public static void invertedStar(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(j<n-i){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void lowHalfStarPattern(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(j<n-i-1){
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void upperHalfStarPattern(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(j<i){
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void halfPyramid(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(j<=i) {
                    System.out.print(j+1);
                }
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramid(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(j<n-i) {
                    System.out.print(j+1);
                }
            }
            System.out.println();
        }
    }

    public static void charPattern(int n) {
        char ch = 'A';
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(j<=i) {
                    System.out.print(ch);
                    ch++;
                }
            }
            System.out.println();
        }
    }

    public static void hollowRectangle(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i==0 || i==n-1 || j==0 || j==n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void floydsTriangle(int n) {
        int a=1;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(j<=i) {
                    System.out.print(a+ " ");
                    a++;
                }
            }
            System.out.println();
        }
    }

    public static void triangle01pattern(int n) {
        boolean val;
        for(int i=0; i<n; i++) {
            if(i%2==0) {
                val = true;
            } else {
                val = false;
            }
            for(int j=0; j<n; j++) {
                if(j<=i) {
                    if(val) {
                        System.out.print(1+" ");
                    } else {
                        System.out.print(0+" ");
                    }
                    val=!val;
                }
            }
            System.out.println();
        }
    }

    public static void butterflyPattern(int n) {
        for(int i=1; i<n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solidRhombus(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowRhombus(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<n; j++) {
                if(i==0 || i==n-1 || j==0 || j==n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1; i>=0; i--) {
            for(int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //ONLY FOR ODD n 
    public static void hollowDiamond(int n) {
        int a = n/2;
        for(int i=0; i<n/2; i++) {
            for(int j=0; j<n; j++) {
                if(j==a+i || j==a-i) {    
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.print("*");
        for(int i=1; i<n-1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
        for(int i=(n/2)-1; i>=0; i--) {
            for(int j=0; j<n; j++) {
                if(j==a+i || j==a-i) {    
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void numberPyramidPattern(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++) {
                System.out.print((i+1)+" ");
            }
            System.out.println();
        }
    }

    public static void palindromicNumPattern(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            } 
            for(int j=i+1; j>0; j--) {
                System.out.print(j);
            }
            for(int j=2; j<=i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    } 

    public static void main(String[] args) {
        regularStar(5);
        System.out.println("----------------------------------------");
        invertedStar(5);
        System.out.println("----------------------------------------");
        lowHalfStarPattern(5);
        System.out.println("----------------------------------------");
        upperHalfStarPattern(5);
        System.out.println("----------------------------------------");
        halfPyramid(5);
        System.out.println("----------------------------------------");
        invertedHalfPyramid(5);
        System.out.println("----------------------------------------");
        charPattern(5);
        System.out.println("----------------------------------------");
        hollowRectangle(5);
        System.out.println("----------------------------------------");
        floydsTriangle(5);
        System.out.println("----------------------------------------");
        triangle01pattern(5);
        System.out.println("----------------------------------------");
        butterflyPattern(4);
        System.out.println("----------------------------------------");
        solidRhombus(5);
        System.out.println("----------------------------------------");
        hollowRhombus(5);
        System.out.println("----------------------------------------");
        diamond(4);
        System.out.println("----------------------------------------");
        //HOLLOWDIAMOND IS ONLY FOR ODD n 
        hollowDiamond(9);
        System.out.println("----------------------------------------");
        numberPyramidPattern(5);
        System.out.println("----------------------------------------");
        palindromicNumPattern(5);
    }
}
