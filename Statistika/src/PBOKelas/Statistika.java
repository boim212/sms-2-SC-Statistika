package PBOKelas;
public class Statistika 
{
    private double[] data;

    public Statistika(double[] data) {
        this.data = data;
    }
    
    public double getMin(){
        double min;
        min = data[0];
        for (int i = 1; i < data.length; i++) {
            if(data[i] < min){
                min = data[i];
            }
        }
        return min;
    }
    
    public double getMax(){
        double max;
        max = data[0];
        for (int i = 1; i < data.length; i++) {
            if(data[i] > max){
                max = data[i];
            }
        }
        return max;
    }
    
    public double getAvg(){
        double jumlahData = 0,sigma = 0, avg = 0;
        for (int i = 0; i < data.length; i++) {
            sigma = sigma + data[i];
        }
        return sigma / jumlahData;
    }
    public double getStdev(){
        double varians =0, Stdev = 0;
        for (int i = 0; i < data.length; i++) {
            varians = varians + ( (data[i] - getAvg() ) * (data[i] - getAvg()) );
        }
        return Math.sqrt(varians);
    }
    
    public double[] sortData(int inc) {
        double[] temp; 
        temp = new double[data.length];//coppy isi data dalam temp
        double data1;
        
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        
        if(inc >= 0){
            for (int i = 0; i < temp.length; i++){  
                for (int j = i + 1; j < temp.length; j++){  
                    if (temp[i] > temp[j]){  
                    data1 = temp[i];  
                    temp[i] = temp[j];
                    temp[j] = data1;
                    }  
                }  
            }
        }
        else{
            for (int i = 0; i < temp.length; i++) {
                for (int j = 1 + i; j < 10; j++) {
                    if(temp[i] < temp[j]){
                        data1 = temp[i];  
                        temp[i] = temp[j];
                        temp[j] = data1;
                    }
                    
                }
                
            }
        }
        return temp;
    
    }
    
}
