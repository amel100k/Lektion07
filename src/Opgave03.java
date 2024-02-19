import java.util.ArrayList;
import java.util.List;

public class Opgave03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("Janus","Markus","Peter","Line","Mads","Søren","Mathias","Trine","Anders"));
        System.out.println("countLengthN(list,5) = " + countLengthN(list, 5));
        lengthN(list,5);
        System.out.println("listLengthN(list,5) = " + listLengthN(list, 5));
    }
    public static int countLengthN(List<String> s, int n){
        return countLengthN(s,n,0,s.size() - 1);
    }
    private static int countLengthN(List<String> s, int n, int low, int high){
        if (low == high && s.get(low).length() == n){
            return 1;
        }
        else if (s.get(low).length() != n){
            return 0;
        }

        int mid = (low + high) / 2;
        int leftZero = countLengthN(s,n,low,mid);
        int rightZero = countLengthN(s,n,mid + 1, high);

        return rightZero + leftZero;
    }
    public static void lengthN(List<String> s, int n){
        lengthN(s,n,0,s.size() - 1);
    }
    private static void lengthN(List<String> s, int n, int low, int high){
        if (low == high) {
            if (s.get(low).length() == n) {
                System.out.println(s.get(low));
            }
        }
        else {
            int mid = (low + high) / 2;
            lengthN(s,n,low,mid);
            lengthN(s,n,mid + 1, high);
        }
    }
    public static ArrayList<String> listLengthN(List<String> s, int n){
        return listLengthN(s,n,0,s.size() - 1);
    }
    private static ArrayList<String> listLengthN(List<String> s, int n, int low, int high){
        ArrayList<String> leftList = new ArrayList<>();
        ArrayList<String> rightList = new ArrayList<>();
        ArrayList<String> newList = new ArrayList<>();
        if (low == high){
            if (s.get(low).length() == n){
                return new ArrayList<String>(List.of(s.get(low)));
            }
        }
        else {
            int mid = (low + high) / 2;
            leftList = listLengthN(s,n,low,mid);
            rightList = listLengthN(s,n,mid + 1, high);
        }
        newList.addAll(leftList);
        newList.addAll(rightList);
        return newList;
    }
}
