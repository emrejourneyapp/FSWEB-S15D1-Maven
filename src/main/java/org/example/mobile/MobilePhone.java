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
        // Aynı isimde biri zaten varsa ekleme
        if(findContact(contact.getName()) >= 0){
            return false;
        }
        this.myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact.getName());
        if(foundPosition < 0){
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        return true;
    }

    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact.getName());
        if(foundPosition < 0){
            return false;
        }
        this.myContacts.remove(foundPosition);
        return true;
    }

    public int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    public int findContact(String contactName) {
        for(int i = 0; i < this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String contactName){
        int position = findContact(contactName);
        if(position >= 0){
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContact(){
        for(int i = 0; i < myContacts.size(); i++){
            Contact myContact = myContacts.get(i);
            System.out.println((i + 1) + ". " + myContact.getName() + " -> " + myContact.getPhoneNumber() );
        }
    }
}
