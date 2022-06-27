package examengccc;

/**
 * pregunta4
 */
public class pregunta4 {

    public static void main(String[] args) {
        int p[]=new int[6];
        int b=0, a,k,i,x;
        String cad="";
         for(k=2;k<702;k++){
             a=0;
             for(i=1;i<(k+2);i++){
                 if(k%i==0){
                     a=a+i;
                      if((a-k)==k){
                        p[b]=k;
                        b++;
                       }
                 }
             }             
         }
        for(x=0;x<b;x++){
            cad=cad+" "+p[x]+" Es un numero perfecto\n";
        }
        System.out.println(cad);
    }
}