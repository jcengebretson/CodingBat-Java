//String1

public String helloName(String name) {
    return "Hello " + name + "!";
}

public String makeAbba(String a, String b) {
    return a + b + b + a;
}

public String makeTags(String tag, String word) {
    return "<" + tag + ">" + word + "</" + tag + ">";
}

public String makeOutWord(String out, String word) {
    return out.substring(0,2) + word + out.substring(2,4);
}

public String extraEnd(String str) {
    String last2 = str.substring(str.length() - 2, str.length());
    return last2 + last2 + last2;
}

public String firstTwo(String str) {
    return (str.length() < 2) ? str : str.substring(0,2);
}
