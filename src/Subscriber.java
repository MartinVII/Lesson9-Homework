public class Subscriber {

    public Subscriber(String foreName, String surName, SubscriberAddress adress, String emailAdress, int age){
        this.foreName = foreName;
        this.surName = surName;
        this.subscriberAddress = adress;
        this.emailAdress = emailAdress;
        this.age = age;
    }

    public Subscriber(String foreName, String surName, SubscriberAddress adress, String emailAdress){
        this.foreName = foreName;
        this.surName = surName;
        this.subscriberAddress = adress;
        this.emailAdress = emailAdress;
    }

    String foreName;
    String surName;
    SubscriberAddress subscriberAddress;
    String emailAdress;
    int age;

    public String isUnderage() {

        boolean isUnderAge;
        String result;

        if(this.age == 0) {
            result = "Subscriber's age is under 18 - Unknown";
        }
        else {
            isUnderAge = this.age < 18;
            result = "Subscriber's age is under 18 - " + isUnderAge;
        }

       return result;
    }

}
