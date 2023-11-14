import java.util.ArrayList;

public class Store {
    private ArrayList<CISItem> cisItems;

    public Store() {
        cisItems = new ArrayList<>();
    }

    public void addBook(Book book) {
        cisItems.add(book);
    }

    public ArrayList<CISItem> getCisItems() {
        return cisItems;
    }

    public void setCisItems(ArrayList<CISItem> cisItems) {
        this.cisItems = cisItems;
    }
    public void addArduino(Arduino a){
        cisItems.add(a);
    }
    public void addMagazine(Magazine m){
            cisItems.add(m);
    }
    public void addPhone(Phone phone) {
        cisItems.add(phone);
    }

    public boolean isEmpty() {
        return (cisItems.isEmpty());
    }

    public void updatePhonesLocation(String l) {
        for (int i = 0; i < cisItems.size(); i++) {
            if (cisItems.get(i) instanceof Phone) {
                cisItems.get(i).setLocation(l);
            }
        }

    }

    public void getAllPhones() {
        ArrayList<Phone> allPhones = new ArrayList<Phone>();
        for (int i = 0; i < cisItems.size(); i++) {
            if (cisItems.get(i) instanceof Phone) {
                allPhones.add((Phone) cisItems.get(i));
            }
        }
    }

    public ArrayList<CISItem> getItems(String itemType) {
        ArrayList<CISItem> getItems = new ArrayList<>();
        for (int i = 0; i < cisItems.size(); i++) {
            if (cisItems.get(i).getClass().equals(itemType)) {
                getItems.add(cisItems.get(i));
            }
        }
        return getItems;
    }

    public void updateItems(String itemType, String property, String value) {
        for (int i = 0; i < cisItems.size(); i++) {
            if (cisItems.get(i).getClass().equals(itemType)) {
                if (cisItems.get(i).getClass().equals(itemType)) {
                    if (property.equals("location")) {
                        cisItems.get(i).setLocation(value);
                    }
                    if (property.equals("name")) {
                        cisItems.get(i).setName(value);
                    }
                    if (property.equals("price")) {
                        cisItems.get(i).setPrice(Integer.parseInt(value));
                    }
                    if (property.equals("description")) {
                        cisItems.get(i).setDescription(value);
                    }
                }
            }

        }
    }
    public void showAllInfo(){
        for (int i=0;i<cisItems.size();i++){
            System.out.println(cisItems.get(i));
        }
    }
    public void addItems(CISItem c){
        cisItems.add(c);
    }
}