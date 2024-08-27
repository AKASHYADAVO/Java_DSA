

public class Linersearch {

    public static int search(int number[], int key) {

        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }

        }

        return -1;

    }

    public static void main(String[] args) {
        int number[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int key = 55;

        int index = search(number,key);

        if(index == -1){
            System.out.println("element not found");
        }
        else{
            System.out.println("element is found at index :" +index);
        }
    }

}
