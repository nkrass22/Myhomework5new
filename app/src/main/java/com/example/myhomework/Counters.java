package com.example.myhomework;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;
public class Counters implements Serializable {

    private String operation;
    private String firstNumeralS;
    private String secondNumeralS;
    private String tv;

    public Counters() {
        firstNumeralS = "";
        secondNumeralS = "";
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public String getTv() {
        return tv;
    }

    public String addSign(View v) {
        String operation = ((Button) v).getText().toString();
        setOperation(operation);
        setTv(getFirstNumeralS() + " " + getOperation());
        return getTv();
    }

    public String getFirstNumeralS() {
        return firstNumeralS;
    }

    public void setFirstNumeralS(String firstNumeralS) {
        this.firstNumeralS = firstNumeralS;
    }

    public String getSecondNumeralS() {
        return secondNumeralS;
    }

    public void setSecondNumeralS(String secondNumeralS) {
        this.secondNumeralS = secondNumeralS;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void calcAnswer(View v) {
        double firstNumeral, secondNumeral;
        firstNumeral = Double.parseDouble(getFirstNumeralS());
        secondNumeral = Double.parseDouble(getSecondNumeralS());
        double answer = 0;
        String operation = getOperation();
        switch (operation) {
            case "+":
                answer = firstNumeral + secondNumeral;
                break;
            case "-":
                answer = firstNumeral - secondNumeral;
                break;
            case "/":
                answer = firstNumeral / secondNumeral;
                break;
            case "*":
                answer = firstNumeral * secondNumeral;
                break;
        }
        if ((int) answer < answer) {
            showAnswer(v, String.valueOf(answer));
        } else {
            showAnswer(v, String.valueOf((int) answer));
        }
        clearVariables();
    }

    private void showAnswer(View v, String answer) {
        MainActivity.showToast( v.getContext(),getFirstNumeralS() + " " + getOperation() + " " + getSecondNumeralS() + " = " + answer);
        clearVariables();
    }


    private void clearVariables() {
        setFirstNumeralS("");
        setSecondNumeralS("");
        setOperation(null);
    }

    public String addNumeral(View v) {
        String numeralS = ((Button) v).getText().toString();
        if (getOperation() == null) {
            setFirstNumeralS(getFirstNumeralS() + numeralS);
            setTv(getFirstNumeralS());
        } else {
            setSecondNumeralS(getSecondNumeralS() + numeralS);
            setTv(getFirstNumeralS() + " " + getOperation() + " " + getSecondNumeralS());
        }
        return getTv();
    }
}
//
//public class Counters implements Parcelable {    - по методичке
//    private int counter1;
//    private int counter2;
//    private int counter3;
//    private int counter4;
//    private int counter5;
//    private int counter6;
//    private int counter7;
//    private int counter8;
//    private int counter9;
//
//    public Counters(){
//        counter1 = 1;
//        counter2 = 2;
//        counter3 = 3;
//        counter4 = 4;
//        counter5 = 5;
//        counter6 = 6;
//        counter7 = 7;
//        counter8 = 8;
//        counter9 = 9;
//    }
//
//    protected Counters(Parcel in) {
//        counter1 = in.readInt();
//        counter2 = in.readInt();
//        counter3 = in.readInt();
//        counter4 = in.readInt();
//        counter5 = in.readInt();
//        counter6 = in.readInt();
//        counter7 = in.readInt();
//        counter8 = in.readInt();
//        counter9 = in.readInt();
//    }
//
//    public static final Creator<Counters> CREATOR = new Creator<Counters>() {
//        @Override
//        public Counters createFromParcel(Parcel in) {
//            return new Counters(in);
//        }
//
//        @Override
//        public Counters[] newArray(int size) {
//            return new Counters[size];
//        }
//    };
//
//    public int getCounter1() {
//        return counter1;
//    }
//
//    public int getCounter2() {
//        return counter2;
//    }
//
//    public int getCounter3() {
//        return counter3;
//    }
//
//    public int getCounter4() {
//        return counter4;
//    }
//
//    public int getCounter5() {
//        return counter5;
//    }
//
//    public int getCounter6() {
//        return counter6;
//    }
//
//    public int getCounter7() {
//        return counter7;
//    }
//
//    public int getCounter8() {
//        return counter8;
//    }
//
//    public int getCounter9(){ return counter9;}
//
//    public void incrementCounter1(){ counter1++; }
//
//    public void incrementCounter2(){ counter2++; }
//    public void incrementCounter3(){ counter3++; }
//    public void incrementCounter4(){ counter4++;}
//    public void incrementCounter5(){ counter5++; }
//    public void incrementCounter6(){ counter6++; }
//    public void incrementCounter7(){ counter7++; }
//    public void incrementCounter8(){ counter8++;}
//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeInt(counter1);
//        dest.writeInt(counter2);
//        dest.writeInt(counter3);
//        dest.writeInt(counter4);
//        dest.writeInt(counter5);
//        dest.writeInt(counter6);
//        dest.writeInt(counter7);
//        dest.writeInt(counter8);
//        dest.writeInt(counter9);
//    }
//}

                                                                        // - Моё
//public class Counters implements Serializable {
//    private int counter_1;
//    public Counters(){
//        counter_1 = 0;
//    }
//
//    public int getCounter_1(){
//        return counter_1;
//    }
//    public void increaseCounter1(){
//        counter_1++;
//    }
//    private int counter_2;
//
//    public int getCounter_2(){
//        return counter_2;
//    }
//
// public void increaseCounter2(){
//        counter_2++;
//    }
                                                                                    //}- Моё
