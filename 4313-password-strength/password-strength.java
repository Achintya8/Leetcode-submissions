class Solution {
    public int passwordStrength(String password) {
         String clean = "";
         for(int i=0;i<password.length();i++){
            char ch = password.charAt(i);
            if(clean.indexOf(ch)==-1){
                clean += ch;
            }
         }
        int ans = 0;
        for(int j=0;j<clean.length();j++){
            if(Character.isLowerCase(clean.charAt(j))){
                ans += 1;
            }else if(Character.isUpperCase(clean.charAt(j))){
                ans += 2;
            }else if(Character.isDigit(clean.charAt(j))){
                ans += 3;
            }else if(String.valueOf(clean.charAt(j)).matches("[!@#$]")){
                ans+= 5;
            }
            
        }
        return ans;
    }
}