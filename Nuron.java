/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Back;

/**
 *
 * @author Sachin
 */
public class Nuron {

    //weights
    private double w1;
    private double w2;
    private double w3;
    private double w4;

    //inputs
    private int x1;
    private int x2;
    private int x3;
    private int x4;
    private double output;
    private double error;

    public Nuron(double w1, double w2, double w3, double w4) {
        this.w1 = w1;
        this.w2 = w2;
        this.w3 = w3;
        this.w4 = w4;
    }

    public void setInput(int x1, int x2, int x3, int x4) {
        this.x1 = x1;
        this.x2 = x3;
        this.x3 = x3;
        this.x4 = x4;

    }

    public double getOutput() {
        double z;
        z = x1 * w1 + x2 * w2 + x3 * w3 + x4 * w4;
        output = 1 / (1 + Math.exp(-z ));
        return output;
    }

    public void setWeight(int tr) {
        double o = getOutput();
        double dw1 = (tr - o) * (1 - o) * o * x1;
        double dw2 = (tr - o) * (1 - o) * o * x2;
        double dw3 = (tr - o) * (1 - o) * o * x3;
        double dw4 = (tr - o) * (1 - o) * o * x4;

        w1 = w1 + dw1;
        w2 = w2 + dw2;
        w3 = w3 + dw3;
        w4 = w4 + dw4;
    }

    public double error(int tr) {
        double o = getOutput();
        error = 0.5 * (tr - o) * (tr - o);
        return error;
    }

}
