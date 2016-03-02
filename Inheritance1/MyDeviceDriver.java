import java.util.ArrayList;
public class MyDeviceDriver
{
    public static void main(String[] args)
    {
        MyPhone phone1 = new MyPhone();
        MyPhone phone2 = new MyPhone(12, "Pink", "Sony");
        MyComputer com1 = new MyComputer();
        MyComputer com2 = new MyComputer(16, "Red", 10);
        MyTV Tv1 = new MyTV();
        MyTV Tv2 = new MyTV(32, "White", 50);
        ArrayList<MyDevice> devices = new ArrayList<MyDevice>();
        devices.add(phone1);
        devices.add(phone2);
        devices.add(com1);
        devices.add(com2);
        devices.add(Tv1);
        devices.add(Tv2);
        for(MyDevice device: devices)
        {
            System.out.println(device + "\n");
        }
    }
}