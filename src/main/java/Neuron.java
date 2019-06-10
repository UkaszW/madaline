import lombok.Data;

import java.util.List;

@Data
public class Neuron {

    private Integer numberOfInputs;
    private List<Double> weights;
    String name;

    public Neuron(List<Double> weights, String name) {
        this.numberOfInputs = weights.size();
        this.weights = weights;
        this.name = name;
    }

    Double calculateOutput(List<Double> inputs) {
        if (inputs.size() != getWeights().size()) {
            throw new IllegalArgumentException("The number of inputs and weights does not match!");
        }

        double output = 0.;

        for (int i = 0; i < getNumberOfInputs(); i++) {
            output += inputs.get(i) * getWeights().get(i);
        }

        return output;
    }
}
