import java.util.Scanner;

public class Unique {
    public static int main(int [] arr) {

        int uniques = 1;
        if(arr.length == 0){
            System.out.println("No elements given");
        }
        for(int i = 0; i < arr.length; i++){

            if(i != arr.length-1){

                if(arr[i] != arr[i + 1]){

                    uniques++;

                }


            }

        }

        return uniques;
    }
}
