
public class LinearFunction implements LinearFunctionMethods{
	private double slope;
	private double yIntercept;
	public LinearFunction(double s, double y){
		slope = s;
		yIntercept = y;
	}
	public double getSlope(){
		return slope;
	}
	public double getYintercept(){
		return yIntercept;
	}
	public double getRoot(){
		return ((0 - yIntercept) / slope);
	}
	public double getYvalue(double x){
		return (slope * x + yIntercept);
	}
	public double getXvalue(double y){
		return ((y - yIntercept) / slope);
	}
}
