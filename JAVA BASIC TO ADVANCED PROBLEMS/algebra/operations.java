package algebra;

// write javac -d . operations.java to create a package and then move the file to it
public class operations {
    public int add(int a,int b){
        return a+b;
    }

    private int sub(int a,int b){
        return a-b;
    }

    protected int mul(int a,int b){
        return a*b;
    }

    int div(int a,int b){
        return a/b;
    }
}

