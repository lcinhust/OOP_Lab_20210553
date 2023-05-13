public class Store {
    private DigitalVideoDisc[] itemsInStore;

    public Store() {
        itemsInStore = new DigitalVideoDisc[0];
    }

    public void addDVD(DigitalVideoDisc dvd) {
        DigitalVideoDisc[] newItemsInStore = new DigitalVideoDisc[itemsInStore.length + 1];
        for (int i = 0; i < itemsInStore.length; i++) {
            newItemsInStore[i] = itemsInStore[i];
        }
        newItemsInStore[itemsInStore.length] = dvd;
        itemsInStore = newItemsInStore;
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        if (itemsInStore.length==0){
            System.out.println("The store is currently emptied.");
        }
        DigitalVideoDisc[] newItemsInStore = new DigitalVideoDisc[itemsInStore.length - 1];
        int j = 0;
        for (int i = 0; i < itemsInStore.length; i++) {
            if (!itemsInStore[i].equals(dvd)) {
                newItemsInStore[j] = itemsInStore[i];
                j++;
            }
        }
        itemsInStore = newItemsInStore;
    }

    public void print() {
        System.out.println("***********************CART********************************");
        System.out.println("DVD in store:");
        for (int i = 0; i < itemsInStore.length; ++i) {
            System.out.println(itemsInStore[i].getId() + ". " + itemsInStore[i].toString());
        }
        System.out.println("***********************************************************");
    }
}