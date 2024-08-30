class MedianofTwoSortedArrays {
    public static void main(String[] args) {

        int[] nums1 = {-1,3};
        int[] nums2 = {-2};
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len = len1+len2;
        double ans;
        int[] newarray = new int[len];
        for(int i=0;i<len;i++)
        {
            if(i<len1)
            {
                newarray[i]=nums1[i];
            }
            else
            {
                newarray[i]=nums2[i-len1];
            }
        }

        for(int i=0;i<len-1;i++)
        {
            for(int j=i+1;j<len-1-i;j++)
            {
                if(newarray[j]>newarray[j+1])
                {
                    int temp=newarray[j];
                    newarray[j]=newarray[j+1];
                    newarray[j+1]=temp;
                }
            }
        }
        if(len%2==0)
        {
            
            ans = ((newarray[(len/2)-1]+newarray[len/2])/2.0);
            
        }
        else
        {
            
            ans= (newarray[len/2]);
            
        }

       System.out.println(ans);
    }
}