//Array1

public boolean firstLast6(int[] nums) {
    return (nums[0] == 6 || nums[nums.length - 1] == 6);
}

public boolean sameFirstLast(int[] nums) {
    return (nums.length >= 1 && nums[0] == nums[nums.length - 1]);
}

public int[] makePi() {
    int[] pi = {3,1,4};
    return pi;
}

public boolean commonEnd(int[] a, int[] b) {
    return (a[0] == b[0] || a[a.length-1] == b[b.length-1]);
}

public int sum3(int[] nums) {
    return nums[0] + nums[1] + nums[2];
}

public boolean double23(int[] nums) {
    if (nums.length == 2  && nums[0] == nums[1])
        return (nums[0] == 2 || nums[0] == 3);

    return false;
}
