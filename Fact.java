class Fact {
    int factorial(int n) {
        if(n==0) return 1;
        return n * factorial(n-1);
    }
    public static void main(String args[]) {
        Fact f = new Fact();
        System.out.println(f.factorial(1));
    }
}
