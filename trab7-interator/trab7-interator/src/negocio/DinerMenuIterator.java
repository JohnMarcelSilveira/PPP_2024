package negocio;

public class DinerMenuIterator implements IteratorDoIgor<MenuItem> {

// public class DinerMenuIterator implements Iterator<MenuItem> {

    private DinerMenu dinerMenu;
    private int pos;

    public DinerMenuIterator(DinerMenu dinerMenu){
        this.dinerMenu = dinerMenu;
        this.pos = 0;
    }

    @Override
    public boolean hasNext() {
        return pos < this.dinerMenu.getNumberOfItems();
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = this.dinerMenu.getMenuItems()[pos];
        pos++;
        return menuItem;
    }

    @Override
    public void add(MenuItem menuItem) {
        this.dinerMenu.addItem(menuItem);
    }
    
}
