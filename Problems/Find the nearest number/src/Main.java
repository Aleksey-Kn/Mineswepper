import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] start = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = scan.nextInt();
        int val = Integer.MAX_VALUE;
        List<Integer> list = new LinkedList<>();
        for (int j : start) {
            if (Math.abs(j - n) < val) {
                val = Math.abs(j - n);
                list.clear();
                list.add(j);
            } else if (Math.abs(j - n) == val) {
                list.add(j);
            }
        }
        list.sort(Comparator.naturalOrder());
        for(int now: list){
            System.out.print(now + " ");
        }
    }
}
