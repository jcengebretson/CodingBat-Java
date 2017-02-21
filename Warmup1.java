//Warmup-1

public boolean sleepIn(boolean weekday, boolean vacation) {
    return (!weekday || vacation);
}

public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    return (aSmile == bSmile);
}

public int sumDouble(int a, int b) {
    int sum = a + b;
    if (a == b)
        sum = sum * 2;
    return sum;
}

public int diff21(int n) {
    if (n <= 21) return 21 - n;
    else return 2 * (n - 21);
}


public boolean parrotTrouble(boolean talking, int hour) {
    if (talking && (hour < 7 || hour > 20)) return true;
    else return false;
}

public boolean makes10(int a, int b) {
    return (a == 10 || b == 10 || a+b == 10);
}


public boolean nearHundred(int n) {
    return (Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10);
}

public boolean posNeg(int a, int b, boolean negative) {
    if (negative) {
        return (a < 0 && b < 0);
    }
    else {
        return ((a < 0 && b > 0) || (a > 0 && b < 0));
    }
}

public String notString(String str) {
    if(str.startsWith("not")) return str;
    else return "not " + str;
}

public String missingChar(String str, int n) {
    String result = "";
    for(int i = 0; i < str.length(); i++) {
        if(i != n) result += str.charAt(i);
    }
    return result;
}

public String frontBack(String str) {
    if(str.length() == 0 || str.length() == 1) return str;

    char first = str.charAt(0);
    char last = str.charAt(str.length() - 1);

    return last + str.substring(1,str.length() - 1) + first;
}

public String front3(String str) {
    int num = (str.length() < 3) ? str.length() : 3;
    String result = str.substring(0,num);
    return result + result + result;
}

public String backAround(String str) {
    char last = str.charAt(str.length() - 1);
    return last + str + last;
}

public boolean or35(int n) {
    return (n % 3 == 0 || n % 5 == 0);
}

public String front22(String str) {
    int num = (str.length() < 2) ? str.length() : 2;
    return str.substring(0,num) + str + str.substring(0,num);
}

public boolean startHi(String str) {
    if(str.length() < 2) return false;
    return (str.substring(0,2).equals("hi"));
}

public boolean icyHot(int temp1, int temp2) {
    return (temp1 < 0 && temp2 > 100 || temp2 < 0 && temp1 > 100);
}

public boolean in1020(int a, int b) {
    return (a >= 10 && a <= 20 || b >= 10 && b <= 20);
}

public boolean hasTeen(int a, int b, int c) {
    return (a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19);
}

public int intMax(int a, int b, int c) {
    return Math.max(a, (Math.max(b,c)));
}

public boolean lastDigit(int a, int b) {
    return (a % 10 == b % 10);
}

public boolean loneTeen(int a, int b) {

    return (a >= 13 && a <= 19) ^ (b >= 13 && b <= 19) ;
}

public String everyNth(String str, int n) {
    String result = "";
    for (int i = 0; i < str.length(); i+=n) {
        result += str.charAt(i);
    }
    return result;
}

public int max1020(int a, int b) {
    int result = 0;
    if(a >= 10 && a <= 20) result = a;
    if(b >= 10 && b <= 20 && b > result) result = b;
    return result;
}

public int close10(int a, int b) {
    if(Math.abs(10-a) < Math.abs(10-b)) return a;
    if(Math.abs(10-a) > Math.abs(10-b)) return b;
    else return 0;
}

public boolean mixStart(String str) {
    return str.length() >= 3 && str.substring(1,3).equals("ix");
}


public String delDel(String str) {
    if (str.length()>=4 && str.substring(1, 4).equals("del")) {
        return str.substring(0, 1) + str.substring(4);
    }
    return str;
}

public boolean stringE(String str) {
    int count = 0;
    for(int i = 0; i < str.length(); i++) {
        if(str.charAt(i) == 'e') count++;
    }

    return (count >= 1 && count <= 3);
}
