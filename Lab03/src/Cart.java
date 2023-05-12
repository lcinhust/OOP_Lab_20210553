import java.util.Scanner;

public class Cart {
    Scanner scan = new Scanner(System.in);
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full");
            return;
        }
        itemsOrdered[qtyOrdered] = disc;
        qtyOrdered++;
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full now");
        } else {
            System.out.println("The disc has been added");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        if (qtyOrdered + dvdList.length > MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full");
            return;
        }
        for (int i = 0; i < dvdList.length; ++i) {
            itemsOrdered[qtyOrdered] = dvdList[i];
            qtyOrdered++;
        }
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full now");
        } else {
            System.out.println("The DVD list has been added");
        }
    }

    public void addDigitalVideoDisc(int dvdNum) {
        if (qtyOrdered + dvdNum > MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full");
            return;
        }
        for (int i = 0; i < dvdNum; ++i) {
            DigitalVideoDisc dvd = new DigitalVideoDisc(null, null, null, 0, 0);
            System.out.println("Enter dvd's information:");
            System.out.println("Title: ");
            dvd.setTitle(scan.nextLine());
            System.out.println("Category: ");
            dvd.setCategory(scan.nextLine());
            System.out.println("Director: ");
            dvd.setDirector(scan.nextLine());
            System.out.println("Length: ");
            dvd.setLength(scan.nextInt());
            System.out.println("Cost: ");
            dvd.setCost(scan.nextFloat());
            itemsOrdered[qtyOrdered] = dvd;
            qtyOrdered++;
        }
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full now");
        } else {
            System.out.println("The DVD list has been added");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered + 2 > MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full");
            return;
        }
        itemsOrdered[qtyOrdered] = dvd1;
        qtyOrdered++;
        itemsOrdered[qtyOrdered] = dvd2;
        qtyOrdered++;
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full now");
        } else {
            System.out.println("The disc has been added");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int idx = -1;
        for (int i = 0; i < qtyOrdered; ++i) {
            if (itemsOrdered[i] == disc) {
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            System.out.println("Can't find the disk");
        } else {
            qtyOrdered--;
            for (int i = idx; i < qtyOrdered; ++i) {
                itemsOrdered[i] = itemsOrdered[i + 1];
            }
        }
    }

    public void printCart() {
        if (qtyOrdered == 0) {
            System.out.println("No DVD in the order now.");
            return;
        }
        for (int i = 0; i < qtyOrdered; ++i) {
            System.out.println(itemsOrdered[i].getTitle() + ' ' + itemsOrdered[i].getCategory() + ' '
                    + itemsOrdered[i].getDirector() + ' ' + itemsOrdered[i].getLength() + ' '
                    + itemsOrdered[i].getCost());
        }
        return;
    }

    public float totalCost() {
        float sum = 0;
        for (int i = 0; i < qtyOrdered; ++i) {
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }
}
