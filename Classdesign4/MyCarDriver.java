import javax.swing.JOptionPane;
public class MyCarDriver
{
    public static void main (String[] args)
    {
        String carname = JOptionPane.showInputDialog("whats your car name?");
        String carbrand = JOptionPane.showInputDialog("whats your car brand?");
        String color = JOptionPane.showInputDialog("what color is your car?");
        double price = Double.parseDouble(JOptionPane.showInputDialog("what price is your car in millions?"));
        MyCar Model001 = new MyCar();
        MyCar Model002 = new MyCar( carname, carbrand, color, price );
        
        System.out.println(Model001);
        System.out.println(Model002);
        JOptionPane.showMessageDialog( null, "" + Model002,
        "Your Car Is Not Cool", JOptionPane.ERROR_MESSAGE );
    }// end main
}// end class