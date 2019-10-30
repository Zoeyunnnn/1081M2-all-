import java.util.*;
public class Zoe {
    public static void main(String[] args) {

//1加到100的總和
//    int i,sum = 0;
//	for (i=1;i<=100;i++){
//	    sum = sum + i;
//    }
// 	    System.out.println(sum);

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int i,j = 0;
//        for (i=a;i<=b;i++){
//           j = j + i;
//            System.out.println(j);
//        }

//M2Q8正整數被3整除的總和
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int i,sum=0;
//        for (i=3;i<=n;i+=3){    /*也可使用if限制，但較冗長*/
//            sum += i;
//        }
//        System.out.println(sum);

//M2Q1最大值最小值
//    Scanner sc = new Scanner(System.in);
//    float v1 = sc.nextFloat();
//    float max = v1;
//    float min = v1;
//
//    for (int i=1;i<9;i++){
//        v1 = sc.nextFloat();
//        if (max<v1){
//            max = v1;
//        }else if (min>v1){
//            min = v1;
//        }
//    }
//        System.out.printf("%.2f\n",max);
//        System.out.printf("%.2f\n",min);

//M2Q6質數判定
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    int m = n/2;
//    boolean flog = true;
//
//    for (int i=2;i<m;i++){
//        if (n%i == 0){
//            flog = false;
//            break;
//        }
//    }
//    if (flog){
//        System.out.println("Yes");
//    }else {
//        System.out.println("No");
//    }

//M2Q14 n*(n+1)總和
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//
//     int sum = 0;
//     for (int i=0;i<=n;i++){
//         sum += i*(i+1);
//     }
//        System.out.println(sum);

//n*m
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//
//        int sum=0;int i,j;
//        for (i=1;i<=n;i++){
//            for (j=1;j<m;j++){
//             sum = i*j;
//             System.out.print(sum+"\t");
//            }
//            System.out.println(i*(j));
//        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a=0,b=0,c=0;
        while (n!=-999) {
            if (n > 0) {
                a++;
            } else if (n == 0) {
                b++;
            } else {
                c++;
            }
            n = sc.nextInt();
        }
        System.out.println(a+"\n"+b+"\n"+c+"\n");
    }
}
