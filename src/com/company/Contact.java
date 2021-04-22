package com.company;

public class Contact   {
    private String fullName;
    private String phone;
    private String group;
    private String gender;
    private String address;
    private String mail;
    private String dateBirth;
    private String note;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Contact(String fullName, String phoneName, String group, String gender, String address, String mail, String dateBirth, String note) {
        this.fullName = fullName;
        this.phone = phoneName;
        this.group = group;
        this.gender = gender;
        this.address = address;
        this.mail = mail;
        this.dateBirth = dateBirth;
        this.note = note;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public Contact() {
    }

    @Override
    public String toString() {
        return "Contact{" +
                "fullName='" + fullName + '\'' +
                ", phoneName='" + phone + '\'' +
                ", group='" + group + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", mail='" + mail + '\'' +
                ", dateBirth='" + dateBirth + '\'' +
                ", note='" + note + '\'' +
                '}'+ "\n";
    }
}
