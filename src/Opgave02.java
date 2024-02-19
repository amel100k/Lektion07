import java.util.ArrayList;
import java.util.List;

public class Opgave02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(0);
        list.add(2);
        list.add(0);
        System.out.println("numberOfZeros(list) = " + numberOfZeros(list));
    }
    public static int numberOfZeros(List<Integer> candidates){
        return numberOfZeros(candidates,0,candidates.size()-1);
    }
    private static int numberOfZeros(List<Integer> candidates, int low, int high){
        if (low == high && candidates.get(low) == 0){
            return 1;
        }
        else if (low == high && candidates.get(low) != 0){
            return 0;
        }
        int mid = (low + high) / 2;
        int leftZero = numberOfZeros(candidates, low, mid);
        int rightZero = numberOfZeros(candidates, mid + 1, high);

        return rightZero + leftZero;
    }
}
