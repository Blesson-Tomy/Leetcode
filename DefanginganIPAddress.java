class Solution {
    public String defangIPaddr(String address) {
        String o = ".";
        String n = "[.]";
        return address.replace(o,n);
    }
}