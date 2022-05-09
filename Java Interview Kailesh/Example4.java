/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.scabhopsl.innerclass;
class Computer
{
    private String HDD;
    private String RAM;
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;
    private Computer(ComputerBuilder cb)
    {
        this.HDD=cb.HDD;
        this.RAM=cb.RAM;
        this.isBluetoothEnabled=cb.isBluetoothEnabled;
        this.isGraphicsCardEnabled=cb.isGraphicsCardEnabled;
        
    }
    public String toString()
    {
        return "HDD:"+HDD+"\nRAM:"+RAM+
                "\ngraphicscardenabled:"+
                this.isGraphicsCardEnabled+"\nbluetoothenabled:"+this.isBluetoothEnabled;
    }
    
    static class ComputerBuilder
    {
        private String HDD;
        private String RAM;
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;
        public ComputerBuilder(String HDD,String RAM)
        {
            this.HDD=HDD;
            this.RAM=RAM;
        }
        public ComputerBuilder setGraphicsCard(boolean present)
        {
            this.isGraphicsCardEnabled=present;
            return this;
            
        }
        
        public ComputerBuilder setBluetooth(boolean present)
        {
            this.isBluetoothEnabled=present;
            return this;
        }
        public Computer build()
        {
            Computer comp=new Computer(this);
            return comp;
        }
    }
    
    
}
public class Example4 {
    public static void main(String[] args) {
        Computer dell=new Computer
                .ComputerBuilder("1TB", "1 GB")
                .setBluetooth(true)
                .setGraphicsCard(false)
                .build();
        System.out.println(dell);
    }
}
