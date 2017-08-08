package org.opentutorials.javatutorials.Inheritance.example2;

class Calculator {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
class SubstractionableCalculator extends Calculator {
    public SubstractionableCalculator(int left, int right) {
        this.left = left;
        this.right = right;
      //�߰��� ->�ʱ�ȭ�ϴ� ����
       /*�θ�Ŭ������ �ʱ�ȭ�Ǳ� ���� �ڽ��� �ʱ�ȭ�Ǵ� ���� �����ϱ�����
       // super(left, right);
       * �� �ٲ� �� ����
       	����Ŭ�������� �߰��� �ʱ�ȭ�� super���� �Ʒ��� �����ڸ� ��ġ���Ѿ��Ѵ� */
    }
 
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorConstructorDemo4 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}