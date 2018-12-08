package cn.ZSF;

//腾讯面试题：1-10000中数字7出现了多少次
//正确答案是4000次。
//以下为代码验证
public class contain7 {
    //main方法
    public static void main(String[] args) {
        int count = 0;
        //遍历1-10000
        for (int i = 0; i < 10000; i++) {
            //将数字转化为字符串，便于拆分操作
            String j = i+"";
            //将字符串拆分成字符数组并遍历
            char[] chars = j.toCharArray();
            //逻辑部分：如果字符数组中包含7，count自增。
            //这里要注意：题目为‘7’出现多少次，而不是有多少数字包含7。
            for (char aChar : chars) {
                if(aChar == '7'){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
