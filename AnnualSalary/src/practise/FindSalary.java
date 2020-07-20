package practise;

public class FindSalary {

    public static void main(String[] args) {
        short salary = 900;
        float tax = 0.09f;
        float yearTax = (salary * tax) * 12f;
        short yearSalary = (short) (salary * 12);
        System.out.println("The goverment takes :" + yearTax);
        System.out.println("I get : " + (yearSalary - yearTax));
       
    }

}
