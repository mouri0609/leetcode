package test.shangtang;

/**
 * @Author: Agile����Mouri
 * @Date: 2019/8/19
 */
public class Main {
    public static String add(String a,String b){
        StringBuilder sb=new StringBuilder();
        int x=0;
        int y=0;
        int pre=0;//��λ
        int sum=0;//�洢��λ��������λ�ĺ�

        while(a.length()!=b.length()){//�����������Ƶ���λ������,�ڶ̵�ǰ����0
            if(a.length()>b.length()){
                b="0"+b;
            }else{
                a="0"+a;
            }
        }
        for(int i=a.length()-1;i>=0;i--){
            x=a.charAt(i)-'0';
            y=b.charAt(i)-'0';
            sum=x+y+pre;//�ӵ�λ���ӷ�
            if(sum>=2){
                pre=1;//��λ
                sb.append(sum-2);
            }else{
                pre=0;
                sb.append(sum);
            }
        }
        if(pre==1){
            sb.append("1");
        }
        return sb.reverse().toString();//��ת����
    }

    public static void main(String[] args) {
        System.out.println(add("11","1"));
    }
}
