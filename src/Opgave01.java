import java.util.ArrayList;
import java.util.List;

public class Opgave01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(8);
        list.add(28);
        list.add(156);
        list.add(89);
        //System.out.println("sumOfNumbers(list) = " + sumOfNumbers(list));
        System.out.println("sumOfNumbers2(list) = " + sumOfNumbers2(list));

    }
    public static int sumOfNumbers (ArrayList<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
        if (list.size() == 0){
            return 0;
        }
        else {
            sum += list.get(i);
        }
        }
        return sum;
    }

    public static int sumOfNumbers2(List<Integer> candidates){
        return sumOfNUmbers2(candidates,0,candidates.size()-1);
    }
    private static int sumOfNUmbers2(List<Integer> candidates, int low, int high){
        if (low == high){
            return candidates.get(low);
        }
        int mid = (low + high) / 2;
        int leftSum = sumOfNUmbers2(candidates,low,mid);
        int rightSum = sumOfNUmbers2(candidates,mid+1,high);

        return leftSum + rightSum;
    }
}
