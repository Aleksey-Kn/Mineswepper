import java.util.ArrayDeque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String mainStr = new Scanner((System.in)).nextLine();
        ArrayDeque<String> deque = new ArrayDeque<>();
        int ind = 0, startInd;
        String temp;
        while ((ind = mainStr.indexOf("</", ind + 2)) != -1){
            temp = mainStr.substring(ind + 2, mainStr.indexOf(">", ind)) + ">";
            startInd = mainStr.substring(0, ind).lastIndexOf(temp) + temp.length();
            temp = mainStr.substring(startInd, ind);
            if(!temp.equals("")){
                deque.addLast(temp);
            }
        }
        deque.forEach(System.out::println);
    }
}