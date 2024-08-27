

public class Binarysearch {

    public static int binarySearch(int number[], int key) {
        int start = 0, end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (number[mid] == key) {
                return mid;
            }
            if(number[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
       
        return -1;
    }


    public static void main(String args[]) {

        int number[] = {1, 3, 5, 7, 8, 9, 23, 56, 78, 87, 88, 89, 90, 99};
        int key = 55;

        int value = binarySearch(number, key);
if(value!=-1){
    System.out.println("number is present at index " + value);  
}
else{
    System.out.println("your value :"+key+" is not present in th arry");
}
       

    }
}
