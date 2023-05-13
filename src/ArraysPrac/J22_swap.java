package ArraysPrac;

class GFG {
    static void swap(int a, int b)
    {
        int temp = a;

        a = b;

        b = temp;

        System.out.println("Value of a in swap function "
                + a);

        System.out.println("Value of b in swap function "
                + b);
        return;
    }

    public static void main(String[] args)
    {
        int a = 5;
        int b = 10;

        // original value of a
        System.out.println("Value of the a "
                + a);

        // original value of b
        System.out.println("Value of the b "
                + b);

        // swap the numbers
        swap(a, b);

        System.out.println("Value of the a " + a);

        System.out.println("Value of the b " + b);
    }
}