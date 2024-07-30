public class ToDoItem {
    private String description;
    private boolean isDone;

    // TODO Now:
    // Add a constructor to initialize the item with the description, and isDone as false, with a single parameter for the description
    // Add getters and setters for each field
    public ToDoItem(String desc){
        this.description = desc;
        this.isDone = false;
    }

    public String GetDescription(){
        return description;
    }

    public boolean GetDone(){
        return isDone;
    }

    public void setDesc(String newDesc){
        this.description = newDesc;
    }

    public void setDone(boolean newDone){
        this.isDone = newDone;
    }
}
