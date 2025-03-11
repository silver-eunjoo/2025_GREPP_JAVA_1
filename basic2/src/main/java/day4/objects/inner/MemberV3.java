package day4.objects.inner;

import java.util.Objects;

public class MemberV3 {
    private int memberId;
    private String name;
    private String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MemberV3 memberV2 = (MemberV3) o;
        return Objects.equals(email, memberV2.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId, name, email);
    }

    public MemberV3(int memberId, String name, String email) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
