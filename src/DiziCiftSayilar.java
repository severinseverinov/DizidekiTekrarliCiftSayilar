import java.util.Arrays;

public class DiziCiftSayilar {
    static boolean isFind(int[] arr, int value){
        for (int i : arr){
            if(i==value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list={2,2,4,4,5,5,7,7,6,6,8,9,10,12,12};
        int[] dublicate=new int[list.length];
        int startIndex=0;

        System.out.print("Dizi : ");
        System.out.println(Arrays.toString(list));

        for(int i=0;i<list.length;i++){
            for (int j=0;j<list.length;j++){
                if((i!=j)&&(list[i]==list[j])&&(list[i]%2==0)){
                    if(!isFind(dublicate,list[i])){
                        dublicate[startIndex++]=list[i];
                    }
                    break;
                }
            }
        }
        System.out.print("Dizi içerisindeki çift sayılar : ");
        for(int value:dublicate){
            if(value!=0){
                System.out.print(value+" ");
            }
        }
    }
}
