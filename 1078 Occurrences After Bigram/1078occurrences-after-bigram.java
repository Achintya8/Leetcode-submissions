class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] arr = text.split(" ");
        int n = arr.length,i =0;
        ArrayList<String> ans = new ArrayList<>();
        while(i<n-2){
            if(arr[i].equals(first) && arr[i+1].equals(second)){
                ans.add(arr[i+2]);
               
            } i++;
        }
        return ans.toArray(new String[0]);
    }
}