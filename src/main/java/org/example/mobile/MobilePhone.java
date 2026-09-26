package org.example.mobile;

import java.util.List;

public class MobilePhone {
    private String myNumber;
    private List<Contact> myContacts;

    public MobilePhone(String myNumber, List<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }

    public List<Contact> getMyContacts() {
        return myContacts;
    }

    public String getMyNumber() {
        return myNumber;
    }

    public boolean addNewContact(Contact contact){
        if(!this.myContacts.contains(contact)){
            this.myContacts.add(contact);
            return true;
        }
        return false;
    }
    public boolean updateContact(Contact oldContact,Contact newContact){
        if(this.myContacts.contains(oldContact)){
            oldContact.setPhoneNumber(newContact.getPhoneNumber());
            oldContact.setName(newContact.getName());
            return true;
        }
        return false;
    }
    public boolean removeContact(Contact contact){
        if(this.myContacts.contains(contact)){
            this.myContacts.remove(contact);
            return true;
        }
        return false;
    }
    public int findContact(Contact contact){
        if(this.myContacts.contains(contact)){
          return this.myContacts.indexOf(contact);

        }
        return -1;
    }
    public Contact queryContact(String contactName){
        for(Contact myContact : myContacts){
            if(myContact.getName().equals(contactName)) {
                return myContact;
            }
        }
       return null;
    }
    public void printContact(){
        for(Contact myContact : myContacts){
            int index = myContacts.indexOf(myContact)+1;
            System.out.println(index + ". " + myContact.getName() + " -> " + myContact.getPhoneNumber() );
        }
    }
}
