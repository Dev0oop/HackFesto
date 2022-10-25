/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stallion
 */
public class Toolboot {
import javax.swing.JOptionPane;
import java.util.*;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Timestamp;
public class Tollboot {

    private String location;
    List<Receipt> list;

    public Tollboot()
    {
        
    }
   
    public Tollboot(String Location) {
        this.location = Location;
        this.list = new ArrayList<>();
        Receipt recobj = new Receipt();
        try {
           FileReader fileobj=new FileReader("receipt.txt");
        BufferedReader buffobj=new BufferedReader(fileobj); 
        String reading="-1";
        while(reading!=null)
        {
            recobj=new Receipt();
            reading=buffobj.readLine();
            String arr[]=reading.split("/");
            String name=arr[0];
            String model=arr[1];
            int make=Integer.parseInt(arr[2]);
            String carnumber=arr[3];
            int seatcap=Integer.parseInt(arr[4]);
            int engCap=Integer.parseInt(arr[6]);
            boolean flag=Boolean.parseBoolean(arr[5]);
            Timestamp time = Timestamp.valueOf(arr[7]);
            double toll=Double.parseDouble(arr[8]);
            recobj.obj=new Car(model, make, carnumber, engCap, seatcap, flag, name);
            recobj.setTimeStamp(time);
            recobj.setTollpaid(toll);
            obj.list.add(recobj);     
        }
        fileobj.close();
        buffobj.close();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"File Is Not Opened");
        }
    }

    
    public String getLocation() {
        return location;
    }

   
    public void outputall() {
        String output = "";
        boolean flag = false;
        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Add Some Receipt First");
        } else {
            for (int i = 0; i < list.size(); i++) {
                output = output+"Rceceipt " + (i+1) + ":\n";
                output = output + "Name of Driver: " + list.get(i).obj.getdriverName() + "\n";
                output = output + "Car Details:" + "\n";
                output = output + "Car Model :" + list.get(i).obj.getmodel() + "    " + "Car Year :" + list.get(i).obj.getmake() + "\n";
                output = output + "Car Number :" + list.get(i).obj.getcarNumber() + "    " + "Seating Capacity :" + list.get(i).obj.getseatingCapacity() + "\n";
                output = output + "is Car Govt  :" + list.get(i).obj.getisGovtVehicle() + "\n";
                output = output + "Engines Capacity :" + list.get(i).obj.getengineCapacity() + "\n";
                output = output + "Toll Details:" + "\n";
                output = output + "The Time at which Toll Is Paid :" + list.get(i).getTimeStamp() + "\n";
                if (list.get(i).obj.getisGovtVehicle()) {
                    output = output + "The Car belongs to govt so there is no Toll For this Car"+ "\n\n";
                      
                } else {
                    output = output + "Total Toll Paid :" + list.get(i).getTollpaid() + "\n\n";
                }
            }
            JOptionPane.showMessageDialog(null,output);
        }

    }
}

}
