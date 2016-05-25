public class Outer 
{ 
     private String text = "I am private!"; 
   //  Outer outer = new Outer(); 
   //  Outer.Inner inner = outer.new Inner();
     
     
     Outer.Inner obj=new Outer.Inner();
     
     public void show(){
    	 	obj.printText();
     }

    public static class Inner 
    { 
        public void printText() 
      { 
        	Outer out=new Outer();
        System.out.println(out.text);
      } 
    } 
    
    public static void main(String[] args) {
		Outer obj=new Outer();
		obj.show();
	}
} 
