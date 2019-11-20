import java.util.Scanner;

public class Try {
    public static void main(String[] args) {


//Q1
//        Scanner sc = new Scanner(System.in);
//        float v1 = sc.nextFloat();
//
//        float maxV = v1,minV = v1;
//        for (int i=1;i<10;i++){
//            v1 = sc.nextFloat();
//            if (maxV<v1){
//                maxV = v1;
//            }else if (minV>v1){
//                minV = v1;
//            }
//        }
//        System.out.printf("max = %.2f\n",maxV);
//        System.out.printf("min = %.2f\n",minV);

//Q2
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        char ch = '*';String sum = "";
//        for (int i=1;i<=n;i++){
//            sum += ch;
//            System.out.println(sum);
//        }

//Q3
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        char ch = '*';String sum = "";
//        for (int i=1;i<=n;i++){
//            for (int j=n-i;j>0;j--){
//                System.out.print(" ");
//            }
//            sum += ch;
//            System.out.println(sum);
//        }

//Q4
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i=1;i<=n;i++){
//            for (int j=n-i;j>0;j--) {
//                System.out.print(" ");
//            }
//            for (int k=1;k<=2*i-1;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//Q5
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        String str = "";
//        while (n>0){
//            str = Integer.toString(n%2)+str;
//            n /= 2;
//        }
//        System.out.printf("%08d\n",Integer.valueOf(str));

//Q6
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int m = n/2;
//        boolean bp = true;
//        for (int i=2;i<=m;i++){
//            if (n%i==0) {
//                bp = false;
//                break;
//            }
//        }
//        if (bp)System.out.println("Yes");
//        else System.out.println("No");

//Q7
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int listen,read,speak,NailN;
//        for (int i=1;i<=n;i++){
//            listen = sc.nextInt();
//            read = sc.nextInt();
//            speak = sc.nextInt();
//
//            NailN=0;
//            if (listen<60)NailN++;
//            if (read<60)NailN++;
//            if (speak<60)NailN++;
//
//            if (NailN==0){
//                System.out.println("P");
//            }else if (NailN==1){
//                if ((listen+read+speak)>=220) System.out.println("P");
//                else System.out.println("M");
//            }else if (NailN==2){
//                if (listen>=80 || read>=80 || speak>=80) System.out.println("M");
//                else System.out.println("F");
//            }else {
//                System.out.println("F");
//            }
//        }

//Q8
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int sum=0;
//        for (int i=3;i<=n;i++){
//            if (i%3==0){
//                sum += i;
//            }
//        }
//        System.out.println(sum);

//Q9
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

//Q10
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int sum=0,i=1,j=1;
//        for (i=1;i<=n;i++){
//            for (j=1;j<n;j++){
//                sum = i*j;
//                System.out.print(sum+"\t");
//            }
//            System.out.println(i*(j));
//        }

//Q11
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i=1;i<=n;i++){
//            if (n%i==0) System.out.println(i);
//        }

//Q12
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        char c = sc.next().charAt(0);
//
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n;j++) System.out.print(c);
//            System.out.println();
//        }

//Q13
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        long sum =1;
//        for (int i=1;i<=n;i++){
//            sum *= i;
//        }
//        System.out.println(sum);

//Q14
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int sum = 0;
//        for (int i=1;i<=n;i++){
//          sum += i*(i+1);
//        }
//        System.out.println(sum);

//Q15
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        double sum=0;
//        for (int i=1;i<=n;i++){
//            sum += 1d/((2*i-1)*2*i);
//        }
//        System.out.println(sum);

//Q16
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int sum = 0,v = 1;
//        for (int i=1;i<=n;i++){
//            v *= 2;
//            sum += v;
//        }
//        System.out.println(sum);

//Q17
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int sum = 0,k=0;
//        while (n>0){
//            k++;
//            sum += (n%10);
//            n/=10;
//        }
//        System.out.println(k);
//        System.out.println(sum);

//Q18
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        boolean flag = false;
//        int sum;
//        for (int i=1;i<=n/2;i++){
//            sum = 0;
//            for (int j=i;j<=n;j++){
//                sum += j;
//                if (sum == n){
//                    flag = true;
//                    for (int k=i;k<j;k++){
//                        System.out.print(k+"+");
//                    }
//                    System.out.println(j);
//                    break;
//                }
//            }
//        }if (flag==false)System.out.println("No");

//Q19
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int i=1,j=1;
//        while (i<n){
//            System.out.print(i+"\t");
//            i += j;
//            j++;
//        }
//        System.out.println(i);
//        i = 1;
//        while (i<=n+1){
//            for (int k=1;k<=i;k++){
//                System.out.print(i+"\t");
//            }
//            i++;
//        }
//        System.out.println();

//Q20
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i=2;i<n;i++){
//            int k;
//            for (k=2;k<=i/2;k++){
//                if (i%k==0) break;
//            }
//            if (k>i/2) System.out.println(i);
//        }

//Q21

//Q22
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i=3;i<n;i++){
//            for (int j=i+1;j<n;j++){
//                for (int k=j+1;k<n;k++){
//                    if ((i+j+k)<=n){
//                        if ((i*i)+(j*j)==(k*k)){
//                            System.out.println(i+"\t"+j+"\t"+k);
//                        }
//                    }
//                }
//            }
//        }

//Q23
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        String str ="";
//        while (n>0){
//            str += n%10;
//            n /= 10;
//        }
//        System.out.println(str);

//Q24
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int sum = 0;int i=0;
//        while (sum<=n){
//            i++;
//            sum += i;
//        }
//        System.out.println(i-1);

//Q25
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        boolean flag = true;
//        int k=0,sum=0;
//        for (int i=2;i<=n;i++){
//            k = i;
//            for (;k!=1;){
//                if (k%2==0) k/=2;
//                else if (k%3==0) k/=3;
//                else if (k%5==0) k/=5;
//                else {
//                    flag = false;
//                    break;
//                }
//            }if (flag)sum+=i;
//            flag = true;
//        }
//        System.out.println(sum);

//Q26
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int count=n;
//        while (n>=3){
//            count += n/3;
//            n = n/3+n%3;
//        }
//        System.out.println(count);
    }
}
