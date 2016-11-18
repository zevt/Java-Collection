package structure;

/**
 * Created by  Viet Quoc Tran.
 */

// This class is created to demonstrate Java Collection

public class Student {
    private String name;
    private int id;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode() {
        return getId();
    }

    // Remember that your equals function always satisfy hashCode function
    // If 2 objects are equals then they have to return the same hashCode value (Mandatory)
    // However, in general, if 2 objects have the same hashCode value, it does not suffice to say they are equal.
    @Override
    public boolean equals(Object obj) {
        // check if both both objects ( this and obj ) are located on the same address
        if (this == obj) return true;
        // check if obj can be compatibly concerted to Student type
        if (!(obj instanceof Student)) return false;

        int obj_id = ((Student) obj).getId();
        return (getId() == obj_id);
    }

    @Override
    public String toString() {
        return "ID: "+ getId() + "   " + getName();
    }
}
