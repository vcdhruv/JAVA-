public class p2 {
    int[] arr = new int[5];
    int top = -1;
    public void push(int value){
        if(top > 4){
            System.out.println("stack overflow");
        }
        else{
            top = top + 1;
            arr[top] = value;
        }
    }
    public void pop(){
        if(top == 0){
            System.out.println("stack underflow");
        }
        else{
            int result = arr[top];
            top = top - 1;
            System.out.println(result+" is deleted from the stack");
        }
    }
    public void display(){
        for(int j=top;j>=0;j--){
            System.out.println(arr[j]);
        }
    }
    public static void main(String[] args) {
        p2 p = new p2();
        p.push(4);
        p.push(3);
        p.push(2);
        p.push(1);
        p.push(10);
        p.display();
        p.pop();
        p.display();
    }
}
