import java.util.*;

import java.util.Collections;
public class SortInBuiltSortInDescendingOrder {

        public static void Arr(Integer []ar){
            for(int i=0;i<ar.length;i++){
                System.out.print(ar[i]+" ");
            }
            System.out.print(" ");
        }
        public static void main(String[] args) {
            Integer ar[]={1,2,3,4,5,6,7,8};
           //Arrays.sort(ar,Collections.reverseOrder());
           Arrays.sort(ar,0,6,Collections.reverseOrder());
           Arr(ar);
        }
        
    }
