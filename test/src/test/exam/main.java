package test.exam;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Solution s = new Solution();
		
		//System.out.println(s.solution("zAZ", 4));
		//System.out.println(s.solution(11));
		//System.out.println(s.solution("+1234"));
		Scanner sc = new Scanner(System.in);

		
	}

}

//���� ����
//�����ڴ� ������ ������ ����� �ظ��Դϴ�. ������ ���ι��� ���ǰ�翡 ���� ������ ���� ������ �մϴ�. �����ڴ� 1�� �������� ������ �������� ������ ���� ����ϴ�.
//
//1�� �����ڰ� ��� ���: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//2�� �����ڰ� ��� ���: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//3�� �����ڰ� ��� ���: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
//
//1�� �������� ������ ���������� ������ ������� ���� �迭 answers�� �־����� ��, ���� ���� ������ ���� ����� �������� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
//
//���� ����
//������ �ִ� 10,000 ������ �����Ǿ��ֽ��ϴ�.
//������ ������ 1, 2, 3, 4, 5�� �ϳ��Դϴ�.
//���� ���� ������ ���� ����� ������ ���, return�ϴ� ���� �������� �������ּ���.
//����� ��
//answers	return
//[1,2,3,4,5]	[1]
//[1,3,2,4,2]	[1,2,3]
//����� �� ����
//����� �� #1
//
//������ 1�� ��� ������ �������ϴ�.
//������ 2�� ��� ������ Ʋ�Ƚ��ϴ�.
//������ 3�� ��� ������ Ʋ�Ƚ��ϴ�.
//���� ���� ������ ���� ���� ����� ������ 1�Դϴ�.
//
//����� �� #2
//
//��� ����� 2�������� ������ϴ�.


class Solution {
    public int[] solution(int[] answers) {
       int[] answer = {};
       
       // ������ a,b,c�� �������
       //int[] a = {1,2,3,4,5};
       //int[] b = { 2, 1, 2, 3, 2, 4, 2, 5};
       //int[] c = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
       int[] a = new int[answers.length];
       int[] b = new int[answers.length];
       int[] c = new int[answers.length];
       
       for(int i=0;i<answers.length;i++) {
    	   
       }
       
       // a,b,c�� ���� ���� ��� �迭
       int scA = 0;
       int scB = 0;
       int scC = 0;
       
       for(int i=0;i<answers.length;i++) {
    	   
       }
       
       return answer;
    }
}



//class Solution {
//    public int solution(String s) {
//        int answer = 0;
//        
//        switch(s.charAt(0)) {
//        case '-': s=s.replace("-", "");answer=Integer.parseInt(s);answer*=-1;break;
//        case '+': s=s.replace("+", "");answer=Integer.parseInt(s);break;
//        default: answer=Integer.parseInt(s);break;
//        }
//        
//        return answer;
//    }
//}



//class Solution {
//    public boolean solution(int x) {
//        boolean answer = true;
//        
//        if(x>=10){
//        	 String result = String.valueOf(x);
//        	 String[] arr = result.split("");
//        	 int h=0;
//        	 for(int i=0;i<arr.length;i++) {
//     			int sum = Integer.parseInt(arr[i]);
//     			h+=sum;
//     		}
//        	 if(x%h == 0){
//        		 return answer;
//        	 }else {
//        		 answer = false;
//        	 }
//        }
//        
//        
//        
//        return answer;
//    }
//}



//class Solution {
//	public String solution(String s, int n) {
//		String answer = "";
//		
//		String[] arr = s.split("");
//		for(int i=0;i<arr.length;i++) {
//			int sum = arr[i].charAt(0) + n;
//			if((sum>90&&sum<97)||(sum>122)) {
//				sum-=26;
//			}
//			String result = String.valueOf(((char)sum));
//			answer += result;
//		}
//		
//		return answer;
//	}
//}