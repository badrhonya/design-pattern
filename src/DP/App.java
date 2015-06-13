package DP;

public class App {

	public static void main(String[] args) throws Exception{
		//instanciation statique
		AbstractFactory factory=new FactoryIMPA();
		AbstractPlugin plugin=factory.getInsence();
		plugin.traitement();
	   //instanciation dynamique
	    
		AbstractFactory fact=(AbstractFactory) Class.forName("DP.FactoryIMPB").newInstance();
		AbstractPlugin plugin1=fact.getInsence();
		plugin1.traitement();
		
		}

}
