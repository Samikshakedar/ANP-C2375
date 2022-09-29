enum TrafficSignal
{
	RED("stop",60),GREEN("go",120),ORANGE("slow down",5);
	String instruction;
	int seconds;
	 TrafficSignal(String instruction,int seconds) 
	 {
		 this.instruction=instruction;
		 this.seconds=seconds;
	 }
	 String printInstruction() 
	 {
		 return instruction;
	 }
	 int printSecond() 
	 {
		 return seconds;
	 }
}	 
public class TrafficSignalGame
{
public static void main(String[] args)
 {
	int a=1;
	TrafficSignal signalcolor=TrafficSignal.GREEN;
	//System.out.println(signalColor.printInstruction()+""+signalColor.printSeconds());
	
	TrafficSignal signal[]=TrafficSignal.values();
	for(int i=0;i<signal.length;i++)
		System.out.println(signal[i]+" "+signal[i].printInstruction()+" "+signal[i].printSecond());
     
	for(TrafficSignal sig:TrafficSignal.values())
		System.out.println(sig+" "+sig.printInstruction()+" "+sig.printSecond());

 }
}
