class Solution {
    ArrayList<String> findString(String first, String second) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < first.length(); i++) {
            for(int j = 0; j < second.length(); j++) {
                list.add("" + first.charAt(i) + second.charAt(j));
            }
        }
        return list;
    }

    ArrayList<String> findString(String first, String second, String third) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < first.length(); i++) 
            for(int j = 0; j < second.length(); j++) 
                for(int k = 0; k < third.length(); k++) 
                    list.add("" + first.charAt(i) + second.charAt(j) + third.charAt(k));
        return list;
    }

    ArrayList<String> findString(String first, String second, String third, String fourth) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < first.length(); i++) 
            for(int j = 0; j < second.length(); j++) 
                for(int k = 0; k < third.length(); k++) 
                    for(int l = 0; l < fourth.length(); l++) 
                        list.add("" + first.charAt(i) + second.charAt(j) + third.charAt(k) + fourth.charAt(l));
        return list;
    }

    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0)
            return new ArrayList<>();
            
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        ArrayList<String> res = new ArrayList<>();

        if(digits.length() == 2) {
            String first = map.get(digits.charAt(0));
            String second = map.get(digits.charAt(1));

            res = findString(first, second);
        }
        else if(digits.length() == 3) {
            String first = map.get(digits.charAt(0));
            String second = map.get(digits.charAt(1));
            String third = map.get(digits.charAt(2));

            res = findString(first, second, third);
        }
        else if(digits.length() == 4) {
            String first = map.get(digits.charAt(0));
            String second = map.get(digits.charAt(1));
            String third = map.get(digits.charAt(2));
            String fourth = map.get(digits.charAt(3));

            res = findString(first, second, third, fourth);
        }
        else {
            String first = map.get(digits.charAt(0));

            for(char c: first.toCharArray()) res.add(Character.toString(c));
        }

        return res;
    }
}