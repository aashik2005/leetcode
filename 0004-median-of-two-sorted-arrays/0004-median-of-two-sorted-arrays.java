class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int size=m+n;
        int i=0;
        int j=0;
        int middle=(m+n)/2;
        int val1=0;
        int val2=0;
        int count=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                if(count==middle){
                    val1=nums1[i];
                }
                if(count==middle-1){
                    val2=nums1[i];
                }
                count++;
                i++;
            }
            else{
                if(count==middle){
                    val1=nums2[j];

                }
                if(count==middle-1){
                    val2=nums2[j];
                }
                j++;
                count++;
            }
        }
        while(j<n){
            if(count==middle){
                val1=nums2[j];
            }
            if(count==middle-1){
                    val2=nums2[j];
                }
                j++;
                count++;
        }
        while(i<m){
            if(count==middle){
                val1=nums1[i];
            }
            if(count==middle-1){
                    val2=nums1[i];
                }
                i++;
                count++;
        }

        if(size%2==0){
            return (double)(val1+val2)/2;
        }
        else{
            return (double)val1;
        }
    }  
}