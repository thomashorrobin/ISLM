import ecs100.*;

public class MainViewer implements UIButtonListener
{
    public MainViewer()
    {
        UI.initialise();
        UI.addButton("ISLM text", this);
    }
    
    public void buttonPerformed(String s){
        if(s.equals("ISLM text")){
            UI.print(new ISLM().PrintISLM());
        }
    }

    public static void main(String[] args)
    {
        MainViewer mv = new MainViewer();
    }
}
