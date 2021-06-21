public class ResSepar {
    private double right;
    private double left;
    private double mid;

    public ResSepar(double r, double l, double m){
        this.right=r;
        this.left=l;
        this.mid=m;
    }

    public void setLeft(double left) {
        this.left = left;
    }

    public void setMid(double mid) {
        this.mid = mid;
    }

    public void setRight(double right) {
        this.right = right;
    }

    public double getLeft() {
        return left;
    }

    public double getMid() {
        return mid;
    }

    public double getRight() {
        return right;
    }
}
