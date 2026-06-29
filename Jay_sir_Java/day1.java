import java.util.Scanner;

public class day1 {
    public static void print(int n){
        if(n==0) return;
        print(n-1);
        System.out.println(n);
    }
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
        // int r = sc.nextInt();
        // int u = sc.nextInt();
        // int n = sc.nextInt();
        // int arr[] = new int[n+1];
        // for(int i=1; i<=n; i++){
        //     arr[i]= sc.nextInt();
        // }
        // int tot = r*u;
        // int cur=0;
        // for(int i=1; i<=n; i++){
        //     cur+=arr[i];
        //     if(cur>=tot){
        //         System.out.println(i);
        //         break;
        //     }
        // }
        // if(cur<tot){
        //     System.out.println(-1);
        // }
        // String str = "abdea";
        // String str2= "abead";
        // int arr[] = new int[26];
        // for(int i=0; i<str.length(); i++){
        //     arr[str.charAt(i)-'a']++;
        // }
        // for(int i=0; i<str2.length(); i++){
        //     arr[str2.charAt(i)-'a']--;
        // }
        // boolean f= true;
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i]!=0){
        //         System.out.println("No");
        //         f=false;
        //         break;
        //     }
        // }
        // if(f){
        //     System.out.println("Anagram");
        // }
        // StringBuffer has 16 has default space in it .  Formula for further -> 16*2 +2 -> 34*2+2 sp on...
        // for(int j=1; j<4; j++){
        //     for(int i=1; i<10; i++){
        //         if(i%2==0) break;
        //         System.out.println("ineer"+i);
        //     }
        //     System.out.println("Outer"+j);
        // }

        // linear search-
        int arr[] = {1,4,5,2,4,6,7};
        int n= arr.length , trg = 7;
        // for(int i=0; i<n; i++){
        //     if(arr[i]==trg){
        //         System.out.println(arr[i]+"index: "+i);
        //         break;
        //     }
        // }
        // binary - H.W. - Capacity to ship (Leetcode).
        // int l=0, h=arr.length;
        // while(l<=h){
        //     int mid = l+(h-l)/2;
        //     if(arr[mid]==trg){
        //         System.out.println(mid);
        //         break;
        //     }else if(arr[mid]>trg){
        //         h=mid-1;
        //     }else{
        //         l=mid+1;
        //     }
        // }

        // bubble sort - 
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int a : arr){
            System.out.print(a+" ");
        }
        // selection sort -
        System.out.println("Selection Sort: ");

        for(int i=0; i<n-1; i++){
            int min = i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        int len=10;
        print(len);
        
        
        
        

    }
}