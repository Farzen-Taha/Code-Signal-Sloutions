
package Intro;
public class findEmailDomain {
    public static void main(String[] args) {
        //Find Domaing of an email.(Everthing that comes after @)
        String address="prettyandsimple@example.com";
        String s="";
        String s1="";
/*        int ind = address.lastIndexOf("@");
     return address.substring(ind+1);
*/   for(int i=address.length()-1;i>=0;i--){
    if(address.charAt(i)!='@')
         s+=address.charAt(i);
    else
     break;

} 
for(int i=s.length()-1;i>=0;i--){
   s1+= s.charAt(i);
}
        System.out.println("s1: "+s1); ;
    }
    
}
