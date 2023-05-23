import java.util.*;
public class practice {
    public Stack top;
    public int length;

    public class Stack{
        public Stack next;
        public int data;
        public Stack(int data){
            this.data = data;
        }
    }

    public practice(){
        top = null;
        length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }
    public int length(){
        return length;
    }
    public void push(int data){
        Stack node = new Stack(data);
        node.next = top;
        top = node;
        length++;
    }
    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        else{
            int result = top.data;
            top = top.next;
            length--;
            return result;
        }
    }
    public void display(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        else{
            Stack current = top;
            while(current != null){
                System.out.println("<pushed-->"+current.data);
                current = current.next;
            }
        }
    }
    public static void main(String[] args) {
        practice p = new practice();
        Scanner sc = new Scanner(System.in);
        p.push(5);
        System.out.println(p.length());
        p.pop();
        System.out.println(p.length());
        p.push(4);
        p.push(2);
        p.push(7);
        p.display();
        System.out.println(p.length());
    }
}
