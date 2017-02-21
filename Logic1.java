//Logic1

public boolean cigarParty(int cigars, boolean isWeekend) {
    if(isWeekend) {
        return cigars >= 40;
    }
    else {
        return (cigars >= 40 && cigars <= 60);
    }
}

public int dateFashion(int you, int date) {
    int result = 1;

    if(you >= 8 || date >= 8) {
        result = 2;
    }

    if(you <= 2 || date <= 2) {
        result = 0;
    }

    return result;
}

public boolean squirrelPlay(int temp, boolean isSummer) {
    if(isSummer) {
        return (temp >= 60 && temp <= 100);
    }
    else {
        return (temp >= 60 && temp <= 90);
    }
}

public int caughtSpeeding(int speed, boolean isBirthday) {

    if(isBirthday) speed -= 5;
    if(speed <= 60) return 0;
    else if(speed <= 80) return 1;
    else return 2;

}

public boolean specialEleven(int n) {
    return (n % 11 == 0 || n % 11 == 1);
}

public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
    return (!isMorning || isMorning && isMom) && !isAsleep;
}

public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
    if (equalOk) {
        return (a <= b && b <= c);
    } else {
        return (a < b && b < c);
    }
}

public int redTicket(int a, int b, int c) {
    if(a == b && a == c) {
        if(a == 2) return 10;
        else return 5;
    }
    else if(a != b && a != c) {
        return 1;
    }
    else return 0;
}
