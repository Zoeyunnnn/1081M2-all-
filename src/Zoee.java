import java.util.*;
public class Zoee {
    public static void main(String[] args) {

//M2Q8被3整除之數字總和
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int sum = 0,i;
//        for (i=3;i<=n;i+=3){
//            sum += i;
//        }
//        System.out.println(sum);

//M2Q6質數判別
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int m = n/2;
//        boolean ha = true;
//        for (int i = 2;i<=m;i++){
//            if (n%i==0){
//                ha = false;
//                break;
//            }
//        }if (ha){
//            System.out.println("Yes");
//        }else {
//            System.out.println("No");
//        }

//M2Q14 n*(n+1)總和
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int sum=0,i;
//        for (i=1;i<=n;i++){
//            sum += i*(i+1);
//        }
//        System.out.println(sum);

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

//M2Q25數字總和
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        boolean ha = true;
//        int sum = 0,ct;
//        for (int i=2;i<=n;i++){
//            ct = i;
//            for (;ct!=1;){
//                if (ct%2==0){
//                    ct /= 2;
//                }else if (ct%3==0){
//                    ct /= 3;
//                }else if (ct%5==0){
//                    ct /= 5;
//                }else {
//                    ha = false;
//                    break;
//                }
//            }if (ha)sum+=i;
//            ha = true;
//        }
//        System.out.println(sum);
//數字總和2
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int sum=0;
//        for (int i=2;i<=n;i++){
//            int j = i;
//            while (j%2==0){
//                j/=2;
//            }while (j%3==0){
//                j/=3;
//            }while (j%5==0){
//                j/=5;
//            }if (j==1) {
//                sum+=i;
//            }
//        }
//        System.out.println(sum);

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

//M2Q13 n階乘
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        long sum = 1;       /*用int會爆*/
//        for (int i=1;i<=n;i++){
//            sum *= i;
//        }
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

//M2Q2 '*'三角形
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        char c='*';String sum="";
//        for (int i=1;i<=n;i++){
//            sum += c;
//            System.out.println(sum);
//        }

//M2Q3反向三角形
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        String sum="";char c = '*';
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            sum += c;
//            System.out.println(sum);
//        }

//M2Q4正三角形
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n-i;j++){     /*(int j=n;j>i;j--)*/
//                System.out.print(" ");
//            }for (int t=1;t<=2*i-1;t++){
//                System.out.print('*');
//            } System.out.println();
//        }

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();

//M2Q5十進制轉二進制
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        String str = "";
//        while (n>0){
//            str = Integer.toString(n%2) + str;
//            n /= 2;
//        }
//        System.out.printf("%08d\n",Integer.parseInt(str));

//M2Q9最大公因數最小公倍數1
//        Scanner sc = new Scanner(System.in);
//        int v1 = sc.nextInt();
//        int v2 = sc.nextInt();
//
//        int sum =0;
//        for (int i=v1;i>1;i--){
//            if (v1%i==0 && v2%i==0){
//                sum = i;
//                break;
//            }
//        }System.out.println(sum);
//        System.out.println((v1*v2)/sum);
//2
//        Scanner sc = new Scanner(System.in);
//        int v1 = sc.nextInt();
//        int v2 = sc.nextInt();
//
//        int p = Math.max(v1,v2);
//        int q = Math.min(v1,v2);
//        while (true){
//            if (p%q==0){
//                break;
//            }
//            int tnp = p%q;
//            p = q;
//            q = tnp;
//        }
//        System.out.println(q);
//        System.out.println((v1*v2)/q);
//
//        Scanner sc = new Scanner(System.in);
//        long n = sc.nextLong();
//
//        int sum=0,k=0;
//        while (n>0){
//            k++;
//            sum += n%10;
//            n /= 10;
//        }
//        System.out.println(k+"\n"+sum);

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

//M2Q19 數列
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1,j = 1;
        while (i<n){
            System.out.print(i+"\t");
            i += j;
            j++;
        }
        System.out.println(i);
        i = 1;
        while (i<=n+1) {
            for (int k = 1; k <= i; k++) {
                System.out.print(i + "\t");
            }
            i++;
        }
        System.out.println();
    }
}

