class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        if(rows==1){
            return encodedText;
        }
        int cols=encodedText.length()/rows;
        System.out.println(cols);
        char[][] enc = new char[rows][cols];
        int ind=0;
        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                enc[r][c]=encodedText.charAt(ind);
                ind++;
            }
        }
       StringBuilder sb = new StringBuilder();
        for (int startCol = 0; startCol < cols; startCol++) {
            int r = 0, c = startCol;
            while (r < rows && c < cols) {
                sb.append(enc[r][c]);
                r++;
                c++;
            }
        }
        // for(int r=0;r<rows;r++){
        //     for(int c=rows;c<cols;c++){
                
        //             sb.append(enc[r][c++]);
        //     }
        // }
        String ans = sb.toString();
        int end=ans.length()-1;
        while(end>=0 && ans.charAt(end)==' ') end--;


        
        return ans.substring(0,end+1);
    }
}