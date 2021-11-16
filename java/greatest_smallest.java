import java.util.*;//working....
public class greatest_smallest {//success......
    public static void greatest_no_shortcut_logic(int arr1[]){
        Arrays.sort(arr1);
        //if we sort the array in increasing order the greatest no. is at the last of the array..
        System.out.println("the greatest no. using array Function is "+(arr1[arr1.length-1]));
    }
    public static void smallest_no_shortcut_logic(int arr2[]){
        Arrays.sort(arr2);
        //if the array is sorted small to increasing..then the smallest no. is at the first adress 
        //of the array provided it is not 0
        if(arr2[0]==0)
            System.out.println("the smallest no. using array Function is "+(arr2[1]));
        else
            System.out.println("the smallest no. using array Function is "+(arr2[0]));
    }
    public static void greatest_no_original_logic(int arr3[]){
        int temp=arr3[0];
        for(int f=1;f<(arr3.length);f++){
            if(arr3[f]>temp)
                temp=arr3[f];
        }
        System.out.println("greatest no. using original logic is "+temp);
    }
    public static void smallest_no_original_logic(int arr4[]){
        int temp2=arr4[0];
        for(int s=1;s<(arr4.length);s++){
            if(arr4[s]<temp2)
                temp2=arr4[s];
        }
        System.out.println("smallest no. using original logic "+temp2);
    }
    public static void main(String qw[]){
        Scanner nrt=new Scanner(System.in);
        System.out.println("we will find greatest and smallest no.\nenter no. of entries..");
        int n=nrt.nextInt();
        int ori[]=new int[n-1];
        System.out.println("enter the Numbers..");
        for(int t=0;t<(ori.length);t++){
            ori[t]=(nrt.nextInt());
        }
        greatest_no_shortcut_logic(ori);
        smallest_no_shortcut_logic(ori);
        greatest_no_original_logic(ori);
        smallest_no_original_logic(ori);
    }
}