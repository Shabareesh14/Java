// class Employee{
//     String name;
//     int id;
//     long salary;
    
//     Employee(String name,int id, long salary){
//         this.name = name;
//         this.id = id;
//         this.salary = salary;
//     }
    
//     void displayEmployeeDetails(){
//         System.out.println("Name : "+ name);
//         System.out.println("ID : "+ id);
//         System.out.println("Salary : "+ salary);
//     }
// }

// class Manager extends Employee{
//     String department;
//     int teamSize;
    
//     Manager(String name,int id, long salary,String department, int teamSize){
//         super(name,id,salary);
//         this.department = department;
//         this.teamSize = teamSize;
//     }
    
//     void displayEmployeeDetails(){
//         super.displayEmployeeDetails();
//         System.out.println("Department : "+ department);
//         System.out.println("TeamSize : "+ teamSize);
//     }
// }

// class Main{
//     public static void main(String[] args){
//         Manager manage = new Manager("Shabareesh",20341,40000,"Software Developer",10);
//         manage.displayEmployeeDetails();
//     }
// }

// class Shape{
//     String color;
//     int borderThickness;
    
//     Shape(String color,int borderThickness){
//         this.color = color;
//         this.borderThickness = borderThickness;
//     }
    
// void displayDetails(){
//     System.out.println("Color : "+color);
//     System.out.println("BorderThickness : "+borderThickness);
// }
// }

// class Circle extends Shape{
//     int radius;
    
//     Circle(String color,int borderThickness,int radius){
//         super(color,borderThickness);
//         this.radius = radius;
//     }
    
//     void displayDetails(){
//         super.displayDetails();
//         System.out.println("Radius : "+radius);
//     }
// }

// class Main{
//     public static void main(String[] args){
//         Circle circle = new Circle("Red",25,50); 
//         circle.displayDetails();
//     }
// }

class BankAccount{
    long accountNumber;
    String accountHolderName;
    double balance;
    
    BankAccount(long accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    
    void deposite(double amount){
       balance += amount; 
        System.out.println("Deposited : "+ amount);
        System.out.println("Updated Balance : "+ balance);
    }
    
    void widthdraw(double amount){
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Updated Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends BankAccount{
    int interestRate;
    
    SavingAccount(long accountNumber, String accountHolderName, double balance, int interestRate) {
        super(accountNumber, accountHolderName, balance); 
        this.interestRate = interestRate;
    }

    void displayDetails(){
        super.displayDetails();
        System.out.println("Interest Rate : "+ interestRate + "%");
    }
}

class Main{
    public static void main(String[] args){
        SavingAccount acc = new SavingAccount(1232,"Ravi",45300.0,5);
        
        acc.displayDetails();       
        acc.deposite(5000);
        acc.widthdraw(2000);
        acc.widthdraw(40000);
    }
}