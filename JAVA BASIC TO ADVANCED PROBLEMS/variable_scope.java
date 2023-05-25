
class VariableScope{
    // this both variables come under class level scope and can be accessed wherever inside the class
    int a = 1;
    int b = 3;

    void result(){
        if(a<b){
            // this variable come under block level scope and can only be accessed inside the block
            boolean ans = a<b;
            System.out.println(ans);
        }
    }

    int sum(){
        return a+b;
    }

    int sub(){
        return a-b;
    }

    int mul()
    {
        // this both variables come under method level scope and can be accessed inside the method only.
        int p=5;
        int q=2;
        return p*q;
    }

    
}

public class variable_scope {
    public static void main(String[] args) {
        VariableScope vs = new VariableScope();
        System.out.println(vs.sum());
        System.out.println(vs.mul());
        vs.result();
    }
}
