class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        return doubled.substring(1, doubled.length() - 1).contains(s);
    }
}

/*

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String dummy = "";
        int size = s.length();

        for(int i = 1; i < size; i++) {
            if(size % i != 0) continue;

            dummy = s.substring(0, i);
            int length = dummy.length();
            boolean valid = true;

            for(int j = i; j < size; j = j + length) {
                String check = s.substring(j, j + length);
                if(!check.equals(dummy)) {
                    valid = false;
                    break;
                } 
            }

            if(valid) return true;
        }
        return false;
    }
}

*/