package com.bridgelabz.objectorientedprograms;

import java.util.ArrayList;
import java.util.Scanner;

class Stock {
    String name;
    int numShares;
    double sharePrice;

    public Stock(String name, int numShares, double sharePrice) {
        this.name = name;
        this.numShares = numShares;
        this.sharePrice = sharePrice;
    }

    public double getValue() {
        return numShares * sharePrice;
    }

    public String toString() {
        return name + ": " + numShares + " shares at $" + sharePrice + " per share, total value $" + getValue();
    }
}

class StockPortfolio {
    ArrayList<Stock> stocks;

    public StockPortfolio() {
        stocks = new ArrayList<Stock>();
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public double getTotalValue() {
        double totalValue = 0;
        for (Stock stock : stocks) {
            totalValue += stock.getValue();
        }
        return totalValue;
    }

    public void printReport() {
        System.out.println("Stock Report");
        for (Stock stock : stocks) {
            System.out.println(stock.toString());
        }
        System.out.println("Total portfolio value: $" + getTotalValue());
    }
}

public class StockAccountManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of stocks: ");
        int numStocks = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        StockPortfolio portfolio = new StockPortfolio();

        for (int i = 0; i < numStocks; i++) {
            System.out.print("Enter the name of stock " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter the number of shares of " + name + ": ");
            int numShares = scanner.nextInt();
            System.out.print("Enter the price per share of " + name + ": $");
            double sharePrice = scanner.nextDouble();
            scanner.nextLine(); // consume the newline character

            Stock stock = new Stock(name, numShares, sharePrice);
            portfolio.addStock(stock);
        }

        portfolio.printReport();
    }
}
