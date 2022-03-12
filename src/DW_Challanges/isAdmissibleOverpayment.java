
package DW_Challanges;

public class isAdmissibleOverpayment {
    public static void main(String[] args) {
        double prices[]={20, 20};
        String notes[]={"20.0% higher than in-store", 
 "20.0% lower than in-store"
};
        double x=0;
        
        double dif=0;//Differce amount of every item.
        double DiffArr[]=new double[prices.length];//array to store differnce amount of every item.
        double totalDif=0;
        
        for(int i=0;i<notes.length;i++){
            String percent="";
            if(Character.isDigit(notes[i].charAt(0))){
                String finl[]=notes[i].split(" ");
                
                for(int j=0;j<finl[0].length();j++ ){
                    if(finl[0].charAt(j)!='%'){
                        percent+=finl[0].charAt(j);
                    }
                }
                if(finl[1].charAt(0)=='h'){
                    dif=prices[i]-((100*prices[i])/(100+Double.parseDouble(percent)));
                    DiffArr[i]=dif;
                }
                else {
                     dif=((100*prices[i])/(100-Double.parseDouble(percent)))-prices[i];
                    DiffArr[i]=-dif;
                }
                
            }
            else{
                if(notes[i].charAt(0)=='s'){
                    DiffArr[i]=0;
                }
            }
            
        }
        for(int i=0;i<DiffArr.length;i++){
            System.out.println(DiffArr[i]+" ");
            totalDif+=DiffArr[i];
        }
        System.out.println("totalDif: "+totalDif);
        if(totalDif==x){
            System.out.println("Yes");
        }
        else System.out.println("No");
    }

}
