public class Main {
    public static void main(String[] args) {
        double [] number = {12.3, -8.28, 74.3, -6.65, 7.21, 53.2, 46.8, 75.47, 53.8, 96.3, -34.6, 34.3, 54.3,0.77,5.55,43.67};
        int FirstPositiveNum = 0;
        double SecondPositiveNum =  0;
        boolean sum = false;
        for (double num: number) {
            if ( num < 0){
                sum = true;
            } else if ( sum ) {
                SecondPositiveNum += num ;
                FirstPositiveNum++ ;
            }
        }
        System.out.println(SecondPositiveNum);
        System.out.println(FirstPositiveNum);
        System.out.println("Answer" + FirstPositiveNum/ SecondPositiveNum);
    }
}
