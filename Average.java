import java.util.Scanner;

public class Average {
    
	int data[];
    double mean;

    public Average(){
        data=new int [5];
        Scanner keyboard=new Scanner(System.in);
        for(int i=0; i<data.length; i++){
            System.out.println("Enter score number " +(i+1));
            data[i]=keyboard.nextInt();
            
        }
        
    }
    public void calculateMean(){
        int sum=0;
        for(int i=0; i<data.length; i++){
            sum += data[i];
        
        }
        mean= sum/(data.length);
    }
    public void selectionSort(){
        int n=data.length;
        for(int i=0; i<n-1; i++){
            int minn=i;
            for(int j=i+1; j<n; j++)
            if(data[j] < data[minn])
            minn=j;

            int temp;
            temp= data[minn];
            data[minn]= data[i];
            data[i]= temp;
        }
    }

    public String toString(){
        String output;
        output= "The test scores are \n";

        for(int i=0;  i<data.length; i++){
            output=output+ data[i];
        }
        output =output+ " The average is " +mean;
        return output;
    }
    
}
