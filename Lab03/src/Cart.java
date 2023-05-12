public class Cart {
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

    // public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
    //     if (qtyOrdered + dvdList.length > MAX_NUMBERS_ORDERED) {
    //         System.out.println("The cart is full");
    //         return;
    //     }
    //     for (int i = 0; i < dvdList.length; ++i) {
    //         itemsOrdered[qtyOrdered] = dvdList[i];
    //         qtyOrdered++;
    //     }
    //     if (qtyOrdered == MAX_NUMBERS_ORDERED) {
    //         System.out.println("The cart is full now");
    //     } else {
    //         System.out.println("The DVD list has been added");
    //     }
    // }

    // public void addDigitalVideoDisc(int dvdNum) {
    //     if (qtyOrdered + dvdNum > MAX_NUMBERS_ORDERED) {
    //         System.out.println("The cart is full");
    //         return;
    //     }
    //     for (int i = 0; i < dvdNum; ++i) {
    //         DigitalVideoDisc dvd = new DigitalVideoDisc(null, null, null, dvdNum, i);
    //         System.out.println("");
    //         itemsOrdered[qtyOrdered] = dvd;
    //         qtyOrdered++;
    //     }
    //     if (qtyOrdered == MAX_NUMBERS_ORDERED) {
    //         System.out.println("The cart is full now");
    //     } else {
    //         System.out.println("The DVD list has been added");
    //     }
    // }

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
