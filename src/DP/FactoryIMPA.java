package DP;

public class FactoryIMPA implements AbstractFactory{

	@Override
	public AbstractPlugin getInsence() {
		
		return new PluginIMPA();
	}

}