package Task068Replit;

/**
 * Created by Ilian on 7/25/2017.
 */
public class Person {
    private String firstname;
    private String lastname;
    private int birthmonth;
    private int birthday;
    private int birthyear;
    private String egn;

    public Person(String firstname,
                  String lastname,
                  int birthmonth,
                  int birthday,
                  int birthyear,
                  String egn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
        this.birthyear = birthyear;
        this.egn = egn;
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

    public int getBirthmonth() {
        return birthmonth;
    }

    public void setBirthmonth(int birthmonth) {
        this.birthmonth = birthmonth;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    public String getEgn() {
        return egn;
    }

    public void setEgn(String egn) {
        this.egn = egn;
    }

    public static String getBirthday(int birthmonth, int birthday, int birthyear ){
        String birthDate = String.valueOf(birthmonth) + "/" + String.valueOf(birthday) + "/" + String.valueOf(birthyear);

        return birthDate;

    }
    public static Boolean verifyEGN(String egn){
        boolean isEgnOk = true;

        if (egn.length() == 10){

        }else
            isEgnOk = false;

        return isEgnOk;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthmonth=" + birthmonth +
                ", birthday=" + birthday +
                ", birthyear=" + birthyear +
                ", egn='" + egn + '\'' +
                '}';
    }
}
