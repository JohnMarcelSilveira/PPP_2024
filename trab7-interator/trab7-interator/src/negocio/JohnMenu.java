package negocio;

import java.util.LinkedList;
import java.util.Queue;

public class JohnMenu {
    private Queue<MenuItem> menuItems;

    public JohnMenu(){
        this.menuItems = new LinkedList<>();
        this.menuItems.add(new MenuItem("Ala minuta", "bifé", 20, false));
        this.menuItems.add(new MenuItem("Bauru de filé", "feito de filé", 50, false));
        this.menuItems.add(new MenuItem("Panqueca de arroz", "feita de arroz", 1.99, true));
        this.menuItems.add(new MenuItem("Panqueca de carne", "feita de carne", 10, false));
        this.menuItems.add(new MenuItem("Panqueca de frango", "feita de frango", 10, false));
        this.menuItems.add(new MenuItem("Panqueca de peixe", "feita de peixe", 10, false));
    }

    public Queue<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(Queue<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void addItem(MenuItem menuItem){
        this.menuItems.add(menuItem);
    }

    public void removeItem(MenuItem menuItem){
        this.menuItems.remove(menuItem);
    }
}
