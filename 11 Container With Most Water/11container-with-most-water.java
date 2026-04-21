class Solution {
    public int maxArea(int[] height) {
        int mac = 0;
        int s = 0;
        int end = height.length-1;
        while(s<=end){
            int area = Math.min(height[s],height[end])*(end-s);
            System.out.println(end);
            System.out.println(s);
            mac = Math.max(mac,area);
            if(height[s]<height[end]){
                s++;
            }else{end--;}
        }
        return mac;
    }
}