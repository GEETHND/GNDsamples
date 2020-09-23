/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fasttrackticketbooking;

import java.util.Scanner;

/**
 *
 * @author yang
 */
public class Membership {

    private Scanner kb = new Scanner(System.in);
    private int number = 0;

    private int option;
    private double aamount = 0.0;
    private double samount = 0.0;
    private double purchasePrice;
    private double total;

    private double DISCOUNT = 0.2;

    public void getMembership() {

        System.out.println();
        String choice = "y";
        System.out.print("Do you want to purchase a membership:Y/N ");

        choice = kb.next();
        if (choice.equalsIgnoreCase("y")) {

            System.out.println();
            System.out.print("Do you want student/senior membership(ages 0-17 or 65+) or the adult membership?: S/A ");
            String member = kb.next();
            System.out.println("how many  membership do you like to purchase:");
            int number = kb.nextInt();
            setNumber(number);
            if (member.equalsIgnoreCase("S")) {
                setSamount(18.00);
            }
            if (member.equalsIgnoreCase("A")) {
                setAamount(20.00);
            }
            //setStudent(kb.nextInt());
            System.out.println("Purchase price $" + getPurchasePrice());

  //  purchasePrice = getAdult() * getAamount() + getStudent() * getSamount();// if condition
        }
    }

    /**
     * @return the option
     */
    public int getOption() {
        return option;
    }

    /**
     * @return the aamount
     */
    public double getAamount() {
        return aamount;
    }

    /**
     * @return the samount
     */
    public double getSamount() {
        return samount;
    }

    /**
     * @return the purchasePrice
     */
    public double getPurchasePrice() {
        return getNumber() * getAamount() + getNumber() * getSamount();
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @return the DISCOUNT
     */
    public double getDISCOUNT() {
        return DISCOUNT;
    }

    /**
     * @param kb the kb to set
     */
    public void setKb(Scanner kb) {
        this.kb = kb;
    }

    /**
     * @param option the option to set
     */
    public void setOption(int option) {
        this.option = option;
    }

    /**
     * @param aamount the aamount to set
     */
    public void setAamount(double aamount) {
        this.aamount = aamount;
    }

    /**
     * @param samount the samount to set
     */
    public void setSamount(double samount) {
        this.samount = samount;
    }

    /**
     * @param purchasePrice the purchasePrice to set
     */
    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @param DISCOUNT the DISCOUNT to set
     */
    public void setDISCOUNT(double DISCOUNT) {
        this.DISCOUNT = DISCOUNT;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }
}
