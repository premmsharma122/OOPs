import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    //    int salary = sc.nextInt();
    //    double inc = sc.nextDouble();
    //    System.out.println("Output: ");
    //    double ans =0;
    //    if(inc>=1 && inc<=3){
    //     ans = salary*0.05;
    //    }else if(inc>=3.1 && inc<=4 ){
    //     ans = salary*0.10;
    //    }
    //    else if(inc>=4.1 && inc<=5){
    //     ans = salary*0.20;
    //    }
    //    System.out.println(salary+ans);

//     String name = "Ram";
//     String name1 = new String("Ram");
//     String name2 = "Ram";
//     String name3 = new String("Ram");
//    // System.out.println(name==name2); // true
//     //System.out.println(name1.equals(name3)); // tue
//     String name4 = new String("Ram").intern();
//     System.out.println(name2==name4); // true
//     System.out.println(name1.equals(name3)); //true
//     System.out.println(name1==name3); // false
        // String str = "Hey class Lum";
        // String arr[] = str.split(" ");
        // for(String a : arr){
        //     for(int i=a.length()-1; i>=0; i--){
        //         System.out.print(a.charAt(i));
        //     }
        //     System.out.println();
            
        // }
        // int n = sc.nextInt();
        // while(n-->0){
        //     int c = sc.nextInt();
        //     int b = sc.nextInt();
        //     int car = c*4;
        //     int bike = b*2;
        //     System.out.println(car+bike);
        // }
        int r = sc.nextInt();
        int u = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        for(int i=1; i<=n; i++){
            arr[i]= sc.nextInt();
        }
        int tot = r*u;
        int cur=0;
        for(int i=1; i<=n; i++){
            cur+=arr[i];
            if(cur>=tot){
                System.out.println(i);
                break;
            }
        }
        if(cur<tot){
            System.out.println(-1);
        }

    }
}