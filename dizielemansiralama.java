package HarmonikOrt;
import java.util.Arrays;
import java.util.Scanner;
public class dizielemansiralama {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Dizi boyutu giriniz:");
        int scale= inp.nextInt();
        int[] list= new int[scale];
        int startindex=0;
        for(int i=1; i<=scale ; i ++){
            System.out.println(i+". elemanı giriniz:");
            int number= inp.nextInt();
            list[startindex++]=number;
        }


        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
