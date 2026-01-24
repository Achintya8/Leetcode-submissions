class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0,ten=0,twen=0;
        int i=0;
        while(i<bills.length){
                if(bills[i]==5){
                    five++;
                    i++;
                }else if(bills[i]==10){
                    if(five==0){
                        return false;
                    }else{
                        ten++;
                        five--;
                        i++;
                    }
                }else if(bills[i]==20){
                    if(five!=0 && ten != 0){
                        twen++;
                        five--;
                        ten--;
                        i++;
                    }else if(five >= 3){
                        twen++;
                        five -= 3;
                        i++;
                    }
                    else{
                        return false;
                    }
                }else{
                    i++;
                }
        }return true;
    }
}