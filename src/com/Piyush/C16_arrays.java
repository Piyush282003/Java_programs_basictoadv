package com.Piyush;

public class C16_arrays {
    public static void main(String[] args) {
        //        1.Declaration abd memory allocation:
//        int [] mrks = new int[5];


//        2;Declaration and then memory allocation:
//        int [] mrks;
//        mrks=new int[5];

//        initialization
//        mrks[0]=89;
//        mrks[1]=19;
//        mrks[2]=39;
//        mrks[3]=59;
//        mrks[4]=79;


//   3.Declaration , memory allocation and initialization together
//        int [] mrks={1,5,6,4,8};
//        System.out.println(mrks[4]);


        System.out.println("********************************************************************");

        float [] mrks = {10.5f,8.2f,9.3f,7,4};
        System.out.println(mrks.length);
        System.out.println(mrks[0]);

        String []students= {"harry","piyush","bhai"};
        System.out.println(students.length);
        System.out.println(students[0]);

        for(int i=0;i< mrks.length;i++){
            System.out.println(mrks[i]);
        }
//        quiz:
        for(int i= mrks.length-1;i>=0;i--){
            System.out.println(mrks[i]);
        }

//        for each loop
        for(float element:mrks){
            System.out.println(element);
        }




        int [][] marks = new int[2][3];
        marks[0][0]=12;
        marks[0][1]=124;
        marks[0][2]=123;
        marks[1][0]=1278;
        marks[1][1]=1289;
        marks[1][2]=1245;

        for(int i=0; i< marks.length;i++){
            for(int j=0;j<marks[i].length;j++){
                System.out.print(marks[i][j]);
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}
