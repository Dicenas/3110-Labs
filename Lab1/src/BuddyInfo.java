public class BuddyInfo {
    private String name;
    private String address;
    private String phoneNumber;
    public BuddyInfo() {
        this("Henry", "123 Sesame Street", "2484345508");
    }
    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo();
        System.out.println("Hello " + buddy.getName());
    }
}

