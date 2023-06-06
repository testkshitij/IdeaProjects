package data_structure.stack;

public class P22Employee {
    private int eid;
    private String ename;
    private double esal;

    P22Employee(int eid,String ename,double esal)
    {
        this.eid=eid;
        this.ename=ename;
        this.esal=esal;
    }
    public String toString()
    {
        return "["+eid+" "+ename+" "+esal+"]";
    }

    @Override
    public int hashCode()
    {
        return eid;
    }

    @Override
    public boolean equals(Object obj)
    {
        P22Employee e=(P22Employee) obj;
        return this.esal==e.esal;
    }
}
