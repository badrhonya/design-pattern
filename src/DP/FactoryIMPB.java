package DP;

public class FactoryIMPB implements AbstractFactory{

	public AbstractPlugin getInsence() {
		return new PluginIMPB();
	}

}