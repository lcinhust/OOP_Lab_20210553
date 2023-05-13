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
            DigitalVideoDisc dvd = new DigitalVideoDisc(null, null, null, dvdNum, i);
            System.out.println("");
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
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
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

    public float totalCost() {
        float sum = 0;
        for (int i = 0; i < qtyOrdered; ++i) {
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }

    public void print() {
        System.out.println("***********************CART********************************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; ++i) {
            System.out.println(itemsOrdered[i].getId() + ". " + itemsOrdered[i].toString());
        }
        System.out.println("Total cost: " + this.totalCost());
        System.out.println("***********************************************************");
    }

    public void searchById(int id) {
        System.out.println("Finding ID: " + id);
        for (int i = 0; i < qtyOrdered; ++i) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println("Find a dvd:\n" + itemsOrdered[i].toString());
                /// because of unique id
                return;
            }
        }
        System.out.println("Cannot find a matched dvd");
    }

    public void searchByTitle(String title) {
        System.out.println("Finding Title: " + title);
        for (int i = 0; i < qtyOrdered; ++i) {
            if (itemsOrdered[i].isMatch(title)) {
                System.out.println("Find a dvd:\n" + itemsOrdered[i].toString());
                return;
            }
        }
        System.out.println("Cannot find a matched dvd");
    }

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }
}
