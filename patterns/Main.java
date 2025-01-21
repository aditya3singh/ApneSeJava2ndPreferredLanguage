
/*
*
* *
* * *
* * * *
* * * * *

class Main {
    public static void main(String[] args) {

		for(int i= 1; i<= 5; i++) {
			for(int j= 1; j<= i; j++) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
    }
}

*/





/*
1  
0 1  
1 0 1  
0 1 0 1  
1 0 1 0 1  


class Main {
    public static void main(String[] args) {

		for(int i= 1; i<= 5; i++) {
			for(int j= 1; j<= i; j++) {
			    if((i+j) % 2 == 0){
			        System.out.print(1+ " ");
			    }else{
			        System.out.print(0+" ");
			    }
			}
			System.out.println(" ");
		}
    }
}
*/


/*
*  *  *  *  *  
*  *  *  *  
*  *  *  
*  *  
*  


class Main {
    public static void main(String[] args) {
		for(int i= 5; i>= 1; i--) {
			for(int j= i; j>= 1; j--) {
			       System.out.print(" * ");
			}   
			System.out.println(" ");
		}   
    }
}
*/


/*

1  
1 2  
1 2 3  
1 2 3 4  
1 2 3 4 5  


class Main {
    public static void main(String[] args) {

		for(int i= 1; i<= 5; i++) {
			for(int j= 1; j<= i; j++) {
				System.out.print(j+ " ");
			}
			System.out.println(" ");
		}
    }
}

*/

/*

A 
BC 
DEF 
GHIJ 
KLMNO 



class Main {
    public static void main(String[] args) {
	    char chara = 'A';
		for(int i= 1; i<= 5; i++) {
			for(int j= 1; j<= i; j++) {
			    
				System.out.print(chara);
				chara++;
			}
			System.out.println(" ");
		}
    }
}
*/

/*

FLOYD'S Triangle pattern

1  
2 3  
4 5 6  
7 8 9 10  
11 12 13 14 15  



class Main {
    public static void main(String[] args) {
        int n = 5;
        int cnt = 1;
        for(int i= 1; i<= n; i++){
            for(int j= 1; j<= i; j++){
                System.out.print(cnt+" ");
                cnt++;
            }
            System.out.println(" ");
        }
    }
}

*/


/*

Hollow Rectangle

***** 
*   * 
*   * 
***** 

import java.util.*;

class Main {
    public static void HollowRectangle(int row , int col){
        for(int i= 1; i<= row; i++){
            for(int j= 1; j<= col; j++){
                if(i==1 || i==row || j == 1 || j == col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        HollowRectangle(row, col);
        
        
    }
}


*/
