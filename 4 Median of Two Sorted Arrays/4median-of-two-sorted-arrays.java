class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int all[] = new int[nums1.length+nums2.length];

        for(int i=0;i<nums1.length;i++){
            all[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            all[nums1.length+i]=nums2[i];
        }
        Arrays.sort(all);
        int low=0;
        int high = all.length;
        int mid =low+(high-low)/2;
        if(high%2==1){
            return all[mid];
        }else{
            System.out.println(mid);
            double a = all[mid];
            System.out.println(a);
            double b= all[mid-1];
            System.out.println(b);
            return (a+b)/2;
        }
    }
}