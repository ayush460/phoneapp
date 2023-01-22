package com.company;

import com.company.Phone;

public class LandLine implements Phone {
    private String myphoneno;
    private boolean isRinging;
    private boolean ispoweron;

    public LandLine(String myphoneno) {
        this.myphoneno = myphoneno;
        isRinging=false;
        ispoweron=true;
    }

    public String getMyphoneno() {
        return myphoneno;
    }

    public void setMyphoneno(String myphoneno) {
        this.myphoneno = myphoneno;
    }

    public boolean isRinging() {
        return isRinging;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isIspoweron() {
        return ispoweron;
    }

    public void setIspoweron(boolean ispoweron) {
        this.ispoweron = ispoweron;
    }

    @Override
    public void powerOn() {
       this.ispoweron=true;
    }

    @Override
    public void callnumber(String Phonenumber) {
        if(ispoweron==true){
            System.out.println("You are dialing the no:"+Phonenumber);

        }
        else{
            System.out.println("your Landline is off");
        }
return;
    }

    @Override
    public void recievecall(String poneno) {
        if(ispoweron==true && myphoneno.equals(poneno)){
            this.isRinging=true;
            System.out.println("hey,"+myphoneno+"you are recieving a call");

        }
        else{
            System.out.println("poweroff");
        }

    }

    @Override
    public boolean answercall() {
        if(isRinging==true){
            System.out.println("call answered");
            this.isRinging=false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isringing() {
        return isRinging;
    }
}
