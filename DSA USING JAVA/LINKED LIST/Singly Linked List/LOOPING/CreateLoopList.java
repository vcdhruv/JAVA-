public class CreateLoopList{
    public List head;
    class List{
        public int data;
        public List next;
        public List(int data){
            this.data = data;
        }
    }
    public void loopCreation(){
        List first = new List(1);
        List second = new List(2);
        List third = new List(3);
        List fourth = new List(4);
        List fifth = new List(5);
        List sixth = new List(6);
        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
    }
    
    public static void main(String[] args) {
        CreateLoopList cl = new CreateLoopList();
        cl.loopCreation();
    }
}