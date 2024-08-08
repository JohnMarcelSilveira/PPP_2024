package negocio;

public class JohnMenuInterator implements IteratorDoIgor<MenuItem>{
    private JohnMenu johnMenu;

    public JohnMenuInterator(JohnMenu johnMenu){
        this.johnMenu = johnMenu;
    }

    @Override
    public boolean hasNext() {
        return !this.johnMenu.getMenuItems().isEmpty();
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = this.johnMenu.getMenuItems().poll();
        return menuItem;
    }

    @Override
    public void add(MenuItem menuItem) {
        this.johnMenu.addItem(menuItem);
    }
    
}
