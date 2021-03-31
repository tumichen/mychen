package enumTest;

public enum  OzWitch {
    WEST("MISS GULCH,aka the wicked Witch of the West"),
    NORTH("Glinda,the Good Witch of the North"),
    EAST("Wicked Witch of the East ,wearer of the Ruby"),
    SOUTH("Good by inference,but missing");
    private String description;
    private OzWitch(String description){
        this.description=description;
    }
    public String getDescription(){
        return description;
    }

    public static void main(String[] args) {
        for (OzWitch oz:OzWitch.values()
                ) {
            System.out.println(oz+":"+oz.getDescription());
        }
    }
}
