import java.util.ArrayDeque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        char[] mas = new Scanner(System.in).next().toCharArray();
        ArrayDeque<Character> deque = new ArrayDeque<>();
        char ch;
        for(int i = 0; i < mas.length; i++){
            if(mas[i] == '(' || mas[i] == '[' || mas[i] == '{'){
                deque.addLast(mas[i]);
            }
            else{
                try {
                    ch = deque.pollLast();
                }catch (NullPointerException e){
                    System.out.println(false);
                    return;
                }
                if(!(ch == '(' && mas[i] == ')' || ch == '[' && mas[i] == ']' || ch == '{' && mas[i] == '}')){
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(deque.isEmpty());
    }
}