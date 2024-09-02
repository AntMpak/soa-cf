package gr.aueb.cf.mobilecontacts.model;

public class UserDetails extends AbstractEntity  implements IdentifialEntity{
    private String firstname;
    private String lastname;

    public UserDetails() {

    }

    public UserDetails(long id, String firstname,String lastname) {
        setId(id);
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public UserDetails(UserDetails userDetails) {
        this.firstname = userDetails.getFirstname();
        this.lastname = userDetails.getLastname();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "firstname=" + firstname +
                ", lastname=" + lastname +
                '}';
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        UserDetails that = (UserDetails) object;
        return java.util.Objects.equals(firstname, that.firstname) && java.util.Objects.equals(lastname, that.lastname);
    }
}
