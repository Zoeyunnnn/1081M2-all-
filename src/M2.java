import java.util.*;
import java.math.BigInteger;
public class M2 {
    public static void main(String[] args) {

//M2Q1最大值與最小值
//        Scanner sc = new Scanner(System.in);
//        float n = sc.nextFloat();
//        float max = n,min = n;
//
//        for (int i=1;i<=9;i++){
//            n = sc.nextFloat();
//            if (max<n){
//                max = n;
//            }else if (min>n){
//                min = n;
//            }
//        }
//        System.out.printf("%.2f\n",max);
//        System.out.printf("%.2f\n",min);

//M2Q2 '*'三角形
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        char c = '*';String sum = "";
//        for (int i=1;i<=n;i++){
//            sum += c;
//            System.out.println(sum);
//        }

//M2Q3 '*'反向三角形
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        char c = '*';String sum = "";
//        for (int i=1;i<=n;i++){
//            sum += c;
//            for (int j=n-i;j>0;j--){
//                System.out.print(" ");
//            }
//            System.out.println(sum);
//        }

//M2Q4 '*'正三角形
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i=1;i<=n;i++){
//            for (int j=n-i;j>0;j--){
//                System.out.print(" ");
//            }for (int k=1;k<=2*i-1;k++){
//                System.out.print('*');
//            }
//            System.out.println();
//        }

//M2Q5 十進制轉二進制
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        String str = "";
//        while (n>0){
//            str = Integer.toString(n%2) + str;
//            n /= 2;
//        }
//        System.out.printf("%08d\n",Integer.valueOf(str));

//M2Q6質數判別
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        boolean flag = true;
//        for (int i=2;i<n;i++){
//            if (n%i==0){
//                System.out.println("No");
//                flag = false;
//                break;
//            }
//        }if (flag) System.out.println("Yes");

//M2Q7  考試測驗
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int listen,read,speak,failN;
//        for (int i=1;i<=n;i++){
//            listen = sc.nextInt();
//            read = sc.nextInt();
//            speak = sc.nextInt();
//
//            failN=0;
//            if (listen<60) failN++;
//            if (read<60) failN++;
//            if (speak<60) failN++;
//
//            if (failN==0) System.out.println("P");
//            else if (failN==1){
//                if ((listen+read+speak)>220) System.out.println("P");
//                else System.out.println("M");
//            }else if (failN==2){
//                if (listen>=80 || read>=80 || speak>=80)System.out.println("M");
//                else System.out.println("F");
//            }else System.out.println("F");
//        }

//M2Q8被3整除之數字總和
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int sum = 0,i;
//        for (i=3;i<=n;i+=3){
//            sum += i;
//        }
//        System.out.println(sum);

//M2Q9 最大公因數跟最小公倍數
//        Scanner sc = new Scanner(System.in);
//        int v1 = sc.nextInt();
//        int v2 = sc.nextInt();
//
//        int v = Math.min(v1,v2);
//        for (int i=v;i>0;i--){
//            if (v1%i==0 && v2%i==0){
//                v = i;
//                break;
//            }
//        }
//        System.out.println(v);
//        System.out.println((v1*v2)/v);

//M2Q10 n*n乘法表
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//
//    int sum=0,i=1,j=1;
//    for (i=1;i<=n;i++){
//        for (j=1;j<n;j++){
//            sum = i*j;
//            System.out.print(sum+"\t");
//        }
//        System.out.println(i*(j));
//    }

//M2Q11 n的所有正因數
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i=1;i<=n;i++) {
//            if (n % i == 0) System.out.println(i);
//        }

//M2Q12實心正方形
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        char c= sc.next().charAt(0);
//        for (int i=0;i<n;i++){
//            for (int j=0;j<n;j++) System.out.print(c);
//            System.out.println();
//        }

//M2Q13 n階乘
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        long sum = 1;       /*用int會爆*/
//        for (int i=1;i<=n;i++){
//            sum *= i;
//        }
//        System.out.println(sum);

//M2Q14 n*(n+1)的總和
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int sum=0;
//        for (int i=1;i<=n;i++) sum += i*(i+1);
//        System.out.println(sum);

//M2Q15 1/(2n-1)*(2n)總和
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        double sum = 0;
//        for (int i=1;i<=n;i++){
//            sum = sum+1d/((2*i-1)*(2*i));
//        }
//        System.out.println(sum);

//M2Q16 2^n總和
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int sum = 0,sun = 1;
//        for (int i=1;i<=n;i++){
//                sun *= 2;
//                sum += sun;
//        }
//        System.out.println(sum);

//M2Q17 數字串和
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int sum=0,k=0;
//        while (n>0){
//            k++;
//            sum += n%10;
//            n /= 10;
//        }
//        System.out.println(k);
//        System.out.println(sum);

//M2Q18 連續整數相加
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        boolean flag = false;
//        for (int i=1;i<=n/2;i++){
//            int sum=0;
//            for (int j=i;j<n;j++){
//                sum += j;
//                if (sum==n){
//                    flag = true;
//                    for (int k=i;k<j;k++){
//                        System.out.print(k+"+");
//                    }
//                    System.out.println(j);
//                }
//            }
//        }if (!flag) System.out.println("No");

//M2Q19 數列
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int i = 1,j = 1;
//        while (i<=n){
//            System.out.print(i+"\t");
//            i += j;
//            j++;
//        }
//        System.out.println(i);
//        i = 1;
//        while (i<=n+1) {
//            for (int k = 1; k <= i; k++) {
//                System.out.print(i + "\t");
//            }
//            i++;
//        }
//        System.out.println();

//M2Q20 質數列表
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int k;
//        for (int i=2;i<n;i++){
//            k=0;
//            for (int j=2;j<i/2;j++){
//                if (i%j==0)k++;
//            }if (k==0)System.out.println(i);
//        }
//M2Q21 連續0的個數(100!大於long的範圍so)
       /*import java.math.BigInteger;*/
//        Scanner sc =  new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int count=0;
//        BigInteger r = new BigInteger("1"); /*BigInteger初始值為1*/
//        /*BigInteger為一類別，建立名為r的物件*/
//        for (int i=n;i>1;i--){
//            r = r.multiply(new BigInteger(Integer.toString(i)));
//            /*multiply:乘法函數*/ /*以新的乘法後r取代原r(單位為BigInteger)*/
//        }while (r.mod(new BigInteger("10")).intValue()==0){
//            /*mod:(取模函數)取得除法中餘數*/
//            count++;
//            r = r.divide(new BigInteger("10"));
//            /*divide:除法函數*/
//        }
//        System.out.println(count);

//M2Q22 直角三角形邊長
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i=3;i<n;i++){
//            for (int j=i+1;j<n;j++){
//                for (int k=j+1;k<n;k++){
//                    if ((i+j+k)<=n){
//                        if ((i*i+j*j)==k*k){
//                            System.out.println(i+"\t"+j+"\t"+k);
//                        }
//                    }
//                }
//            }
//        }

//M2Q23 數字反轉
//        Scanner sc = new Scanner(System.in);
//        Long n = sc.nextLong();
//
//        while (n>0){
//            System.out.print(n%10);
//            n /= 10;
//        }
//        System.out.println();

//M2Q24 1+2+...+m<=n,求m
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int sum=0,i=0;
//        while (sum<=n){
//            i++;
//            sum += i;
//        }
//        System.out.println(i-1);

//M2Q25 數字總和
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int k=0,sum=0;
//        boolean flag = true;
//        for (int i=2;i<=n;i++){
//            k=i;
//            for (;k!=1;){
//            if (k%2==0) k/=2;
//            else if (k%3==0) k/=3;
//            else if (k%5==0) k/=5;
//            else {
//                flag = false;
//                break;
//            }}
//            if (flag)sum += i;
//            flag = true;
//        }
//        System.out.println(sum);

//M2Q26
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int k = n;
//        while (n>=3){
//            k += n/3;
//            n = n/3+n%3;
//        }
//        System.out.println(k);

//Q1 符號圖形
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        char c = sc.next().charAt(0);
//
//        for (int i=1;i<=n;i++){
//            for (int j=n-i;j>0;j--){
//                System.out.print(" ");
//            }for (int k=1;k<=2*i;k++){
//                System.out.print(c);
//            }
//            System.out.println();
//        }

//Q2 數字圖形
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++) System.out.print(j);
//            for (int k=2*(n-i);k>0;k--) System.out.print(" ");
//            for (int t=i;t>0;t--) System.out.print(t);
//            System.out.println();
//        }

//Q3 計算正整數被 4 和 6 整除之數值之總和
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int sum=0;
//        for (int i=12;i<=n;i+=12){
//            sum+=i;
//        }
//        System.out.println(sum);

//Q4 正因數的個數與和
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int sum=0,count=0;
//        for (int i=1;i<=n;i++){
//            if (n%i==0){
//                count++;
//                sum += i;
//            }
//        }
//        System.out.println(count);
//        System.out.println(sum);

//Q5 數字乘積與總和
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int sum=0,sun=1,k=0;
//        while (n>0){
//            k++;
//            sun *= n%10;
//            sum += n%10;
//            n /= 10;
//        }
//        System.out.println(k+"\n"+sun+"\n"+sum);

//Q6 質數的個數與總和
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int sum=0,count=0;
//        for (int i=2;i<=n;i++){
//            int k=0;
//            for (int j=2;j<=i/2;j++){
//                if (i%j==0) k++;
//            }if (k==0){
//                sum+=i;
//                count++;
//            }
//        }
//        System.out.println(count);
//        System.out.println(sum);

//Q7 直角三角形邊長
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i=3;i<n;i++){
//            for (int j=3;j<n;j++){
//                for (int k=3;k<n;k++){
//                    if ((i+j+k)<=n){
//                        if ((i*i)+(j*j)==(k*k) || (j*j)+(k*k)==(i*i)
//                                || (i*i)+(k*k)==(j*j)){
//                            System.out.println(i+"\t"+j+"\t"+k);
//                        }
//                    }
//                }
//            }
//        }

//Q8 第一個非 0 的數
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        long sum=1;
//        for (int i=1;i<=n;i++){
//            sum *= i;
//            while (sum%10==0) sum /= 10;
//            sum %= 100;
//        }
//        System.out.println(sum%10);

//Q9 n*((n+1)+(n+2))總和
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int sum=0;
//        for (int i=1;i<=n;i++){
//            sum += i*(2*i+3);
//        }
//        System.out.println(sum);

// 字串轉換浮點數(未完成)
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        boolean bp = true;
//        for (int i=1;i<=n;i++) {
//            String t = sc.next();
//            for (int j=0;j<t.length();j++){
//                if (t.charAt(j)=='e'){
//                    double a = Double.parseDouble(t.substring(0,j));
//                    int b = Integer.parseInt(t.substring(j+1));
//                    System.out.printf("%.0f\n",a*Math.pow(10,b));
//                    bp = false;
//                    break;
//                }
//            }if (bp)
//        }

//稜形
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int k=1,j=1,i=1;
        for (i=1;i<=n;i++){
            for (j=n-i;j>0;j--) System.out.print(" ");
            for (k=1;k<=2*i-1;k++) System.out.print('*');
            System.out.println();
        }for (i=n-1;i>0;i--){
            for (j=1;j<=n-i;j++) System.out.print(" ");
            for (k=2*i-1;k>0;k--) System.out.print('*');
            System.out.println();
        }
    }
}

