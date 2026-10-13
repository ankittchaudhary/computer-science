class Subject{
    private String subId;
    private String name;
    private int maxMarks;
    private int marksObtained;

    public Subject(String subId, String name, int maxMarks){
        this.subId = subId;
        this.name = name;
        this.maxMarks = maxMarks;
    }
    //get
    public String getSubId(){
        return subId;
    }
    public String getName(){
        return name;
    }
    public int getMaxMarks(){
        return maxMarks;
    }
    public int getMarksObtained(){
        return marksObtained;
    }

    //set
    public void setMaxMarks(int mm){
        maxMarks=mm;
    }
    public void setMarksObtained(int m){
        marksObtained=m;
    }
    boolean isQualified(){
        return marksObtained>=maxMarks/10*4; //40%
    }
    public String toString(){
        return "\nSubject ID:"+subId+"\nName :"+name+"\nMarks Obtained: "+marksObtained;
    }
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        //array of objects
        Subject sub[] = new Subject[3]; //3 objects
        sub[0] = new Subject("S001", "Data Structures", 100);
        sub[1] = new Subject("S002", "computer Networks", 100);
        sub[2] = new Subject("S003", "Operating Systems", 100);

        for(Subject s:sub){
            System.out.println(s);
        }
    }
}
