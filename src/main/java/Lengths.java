public enum Lengths {
    FT, IN;
    public static double getQuantityInInch(Lengths length, int measurement) {
        double measure = 0;
        if (length == FT) {
            measure =  measurement * 12;
        }
        if (length == IN) {
            measure =  measurement;
        }
        return measure;
    }
}
