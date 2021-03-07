public class ThisKey {

    private int x;
    public ThisKey(int x){
       this.x = SetX(x);
    }

    private int SetX(int x) {
        if(x>0)
            return x;
        else
            return 0;

    }
    
    public static void main(String[] args) {
        ThisKey tk1 = new ThisKey(10);
        System.out.println(tk1.x);
    }
}
