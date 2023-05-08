package JavaDoc;


public class J02_method_tags {
    /**
     *
     * @param args These are arguments supplied to the command line..
     */
    public static void main(String[] args) {
        System.out.println("I am main method");
    }

    /**
     *
     * @param i This is the 1st number to add
     * @param j This is the 2nd number to add
     * @return sum of 2 numbers as an integer
     * @throws Exception if i==0 it will throw Exception
     * @deprecated This method is deprecated so please use + operator
     */
    public int add(int i,int j) throws Exception{
        if(i==0){
            throw new Exception();
        }
        int c;
        c=i+j;
        return c;
    }
}
