import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<String> ipes;

    public List<String> restoreIpAddresses(String s) {
        ipes = new ArrayList<>();
        int l = s.length();
        // An IP address has between 4 and 12 digits
        if (l < 4 || l > 12) return ipes; 
        
        f(s, 0, "", 0, l);
        return ipes;
    }

    private boolean isIp(String ip) {
        if (ip.length() > 3 || ip.length() == 0) return false;
        if (ip.length() > 1 && ip.charAt(0) == '0') return false;
        int val = Integer.parseInt(ip);
        return val >= 0 && val <= 255;
    }

    private void f(String s, int index, String ip, int dot, int l) {
        if (index > l) return;

        if (dot == 3) {
            String remaining = s.substring(index);
            if (isIp(remaining)) {
                ipes.add(ip + remaining);
            }
            return;
        }

        for (int i = index; i < l && i < index + 3; i++) {
            String part = s.substring(index, i + 1);
            if (isIp(part)) {
                f(s, i + 1, ip + part + ".", dot + 1, l);
            }
        }
    }
}
