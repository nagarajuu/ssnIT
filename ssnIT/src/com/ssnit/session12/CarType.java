package com.ssnit.session12;

enum CarType{
    Volvo(20),Honda(10),Subaru(30);

    private int price;

    CarType(int pr){
       price = pr;
    }

    public int getPrice(){
        return price;
    }
}
