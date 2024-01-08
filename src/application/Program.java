package application;

import model.entities.Account;
import model.excpetions.DomainException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    try {
      Account account = createAccount(sc);
      System.out.println();
      System.out.print("Enter amount for withdraw: ");
      double amount = sc.nextDouble();
      account.withdraw(amount);
      System.out.println("New balance: " + account.getBalance());
    } catch (DomainException e) {
      System.out.println(e.getMessage());
    } catch (InputMismatchException e) {
      System.out.println("Invalid value.");
    } catch (Exception e) {
      System.out.println("Unexpected error.");
    }
    sc.close();
  }

  public static Account createAccount(Scanner sc) throws DomainException {
    System.out.println("Enter account data");
    System.out.print("Number: ");
    int number = sc.nextInt();
    System.out.print("Holder: ");
    sc.nextLine();
    String holder = sc.nextLine();
    System.out.print("Initial balance: ");
    double initialBalance = sc.nextDouble();
    if(initialBalance < 0) {
      throw new DomainException("The initial balance cannot be less than zero.");
    }
    System.out.print("Withdraw limit: ");
    double withdrawLimit = sc.nextDouble();
    if(withdrawLimit < 0) {
      throw new DomainException("The withdraw limit cannot be less than zero.");
    }
    return new Account(number, holder, initialBalance, withdrawLimit);
  }
}
