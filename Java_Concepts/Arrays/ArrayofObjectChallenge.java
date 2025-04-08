package Arrays;

public class ArrayofObjectChallenge {
    public ArrayofObjectChallenge(String subID, String name, int maxMarks) {
        this.subID = subID;
        this.name = name;
        this.maxMarks = maxMarks;
    }

    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;

    public String getName() {
        return name;
    }

    public String getSubID() {
        return subID;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public int getMarksObtain() {
        return marksObtain;
    }

    public void setMarksObtain(int mo) {
        marksObtain = mo;
    }

    public void setMarksMarks(int mm) {
        maxMarks = mm;

    }

    boolean isQualified(int m) {
        return m >= maxMarks / 10 * 4;
    }

    public String toString() {
        return "\nSubject ID:" + subID + "\nName :" + name + "\nMarks Obtained:" + marksObtain;
    }

    public static void main(String[] args) {
        ArrayofObjectChallenge[] arrayofObjectChallenge = new ArrayofObjectChallenge[3];
        arrayofObjectChallenge[0] = new ArrayofObjectChallenge("KAS105", "Ayushi", 100);
        arrayofObjectChallenge[1] = new ArrayofObjectChallenge("KAS103", "SHivi", 30);
        arrayofObjectChallenge[2] = new ArrayofObjectChallenge("KAS109", "yushi", 40);
        for (ArrayofObjectChallenge arr : arrayofObjectChallenge) {
            System.out.println(arr);
        }
    }

}
