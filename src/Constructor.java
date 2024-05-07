class Customer {
    private int cid;
    private String cname;
    private long cnumber;

    public Customer(int cid, String cname, long cnumber) {
        this.cid = cid;
        this.cname = cname;
        this.cnumber = cnumber;
    }

    public int getCid() {
        return cid;
    }

    public String getCname() {
        return cname;
    }

    public long getCnumber() {
        return cnumber;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Customer c = new Customer(001, "Seeman", 67890018);

        System.out.println(c.getCid() + " " + c.getCname() + " " + c.getCnumber());
    }
}
