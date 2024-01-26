
package arraydemow24fri;

/**updated Jan26th
 * This is to show modification
 * @author Ronak
 *this was added 426pm
 */
public class Student {
    private int sID;
    private String sName;

    public Student(int sID, String sName) {
        this.sID = sID;
        this.sName = sName;
    }
    
    
    public int getsID() {
        return sID;
    }

    public void setsID(int sID) {
        this.sID = sID;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    
    
    
}
