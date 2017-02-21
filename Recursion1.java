//Recursion1

public int factorial(int n) {
    if(n <= 1) return n;
    else {
        return n * factorial(n-1);
    }
}

public int bunnyEars(int bunnies) {
    if(bunnies == 0) return 0;
    else {
        return 2 + bunnyEars(bunnies-1);
    }
}

public int fibonacci(int n) {
    if(n == 0) return 0;
    if(n == 1) return 1;
    else {
        return fibonacci(n-2) + fibonacci(n-1);
    }
}

public int bunnyEars2(int bunnies) {
    if(bunnies == 0) return 0;
    if(bunnies % 2 == 0) return 3 + bunnyEars2(bunnies-1);
    else return 2 + bunnyEars2(bunnies-1);
}

public int triangle(int rows) {
    if(rows <= 1) return rows;
    else return rows + triangle(rows-1);
}

public int count8(int n) {
    if(n == 8)
        return 1;
    else if(n == 0)
        return 0;
    else if(n % 10 == 8) {
        if(n % 100 == 88)
            return 2 + count8(n/10);
        else
            return 1 + count8(n/10);
    }
    else return count8(n/10);
}

public String parenBit(String str) {
    if(str.charAt(0) == '(') {
        if(str.charAt(str.length() - 1) == ')') return str;
        else {
            return parenBit(str.substring(0,str.length()-1));
        }
    }
    else {
        return parenBit(str.substring(1));
    }
}

public boolean nestParen(String str) {
    if (str.equals("")) return true;
    else if(str.charAt(0) == '(' && str.charAt(str.length()-1) == ')')
        return nestParen(str.substring(1,str.length()-1));
    else return false;
}

public int strCount(String str, String sub) {
    int strl = str.length();
    int subl = sub.length();

    if(strl == subl) {
        if(str.equals(sub)) return 1;
        else return 0;
    }
    else if(str.substring(0,subl).equals(sub)) {
        return 1 + strCount(str.substring(subl),sub);
    }
    else return strCount(str.substring(1),sub);

}
