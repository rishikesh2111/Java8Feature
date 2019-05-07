package com.java.feature.javafeature.collector;

import java.util.Comparator;
import java.util.Objects;
import static java.util.Comparator.*;
public class PhoneNumber implements Comparable<PhoneNumber> {

    private int areaCode;
    private int phoneNo;
    private int lineNo;
    private static final Comparator<PhoneNumber> COMPARATOR =
            comparingInt( PhoneNumber::getPhoneNo).thenComparing(PhoneNumber::getAreaCode)
            .thenComparing(PhoneNumber::getLineNo);

    public PhoneNumber(int areaCode, int phoneNo, int lineNo) {
        this.areaCode = areaCode;
        this.phoneNo = phoneNo;
        this.lineNo = lineNo;
    }
/*    @Override
    public int compareTo(PhoneNumber p) {
       COMPARATOR.compare(this, p);
        return 0;
    }*/
    @Override
    public int compareTo(PhoneNumber p) {
         int result = Integer.compare(getAreaCode(),p.getAreaCode());
         if(result == 0){
             result = Integer.compare(getPhoneNo(), p.getPhoneNo());
             if(result == 0){
                 result = Integer.compare(getLineNo(), p.getLineNo());
             }
         }
        return result;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getLineNo() {
        return lineNo;
    }

    public void setLineNo(int lineNo) {
        this.lineNo = lineNo;
    }
    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if(!(obj instanceof PhoneNumber)){
            return false;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        PhoneNumber phoneNumber = (PhoneNumber)obj;
        return areaCode == phoneNumber.getAreaCode() && phoneNo == phoneNumber.getPhoneNo() && lineNo == phoneNumber.getLineNo();

    }

    @Override
    public int hashCode() {
        return Objects.hash(getAreaCode(), getPhoneNo(), getLineNo());
    }
}
