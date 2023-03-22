package example.designPtn;

public class Channel {
	private double frequency;
	private ChannelTypeEnum TYPE;
	
	

	@Override
	public String toString() {
		return "Chennal [frequency=" + frequency + ", TYPE=" + TYPE + "]";
	}

	public double getFrequency() {
		return frequency;
	}

	/*public void setFrequency(double frequency) {
		this.frequency = frequency;
	}*/

	public ChannelTypeEnum getTYPE() {
		return TYPE;
	}

	/*public void setTYPE(ChennalTypeEnum tYPE) {
		TYPE = tYPE;
	}*/
	
	public Channel(double freq,ChannelTypeEnum type){
		this.frequency=freq;
		this.TYPE=type;
	}
}
