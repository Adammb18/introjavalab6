public class AverageDriver{
    public static void main(String[] args){
        Average avg= new Average();
        avg.selectionSort();
        avg.calculateMean();
        System.out.println(avg.toString());
    }
}