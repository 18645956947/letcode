package zhx.day1216;

/**
 * ��ת�ַ���
 * @author lenovo
 *
 */
public class Solution {
	
	public String reverseString(String s) {
		if(s.length()<1 || s==null) return s;
		char[] s2 = s.toCharArray();
		char t1 = 0;
		for(int i = 0;i<s2.length/2;i++) {
			t1 = s2[i];
			s2[i] = s2[s2.length-i-1];
			s2[s2.length-i-1] = t1;
		}
		for(int i = 0;i<s2.length;i++) {
			System.out.println(s2[i]);
		}
		return String.valueOf(s2);
    }
	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		Solution s1 = new Solution();
		s1.reverseString(s);
	}
}
