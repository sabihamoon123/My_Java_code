public class sum {
    int x, n;
    double sum;
    sum(int xx, int nn) {
    x = xx;
    n = nn;
    sum = 0.0;
    }
    double findfact(int a) {
    return (a < 2) ? 1 : a * findfact(a - 1);
    }
    double findpower(int a, int b) {
    return (b == 0) ? 1 : a * findpower(a, b - 1);
    }
    void calculate() {
    for (int i = 2; i <= n; i += 2)
    sum += findpower(x, i) / findfact(i - 1);
    }
    void display() {
    System.out.println("sum=" + sum);
    }
    public static void main(String[] args) {
    sum obj = new sum(5, 2);
    obj.calculate();
    obj.display();
    }
    }