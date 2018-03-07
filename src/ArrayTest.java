import java.util.*;
public class ArrayTest {
    public static void main(String[] args) {
        int [] arr ={1,23,43,65,87,543};
        //int index=halfSearch(arr,50);
        int index1=Arrays.binarySearch(arr,60);
        System.out.println("index="+index1);
    }
    public static int halfSearch(int[] arr,int key) {
        int max, min, mid;
        min = 0;
        max = arr.length - 1;
        mid = (max + min) / 2;
        while (arr[mid] != key) {
            if (key > arr[mid])
                min = mid + 1;
            else if (key < arr[mid])
                max = mid - 1;
            if (max < min)
                return mid;
        }
        return -1;
    }

}
