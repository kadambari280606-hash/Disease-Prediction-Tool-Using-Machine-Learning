import weka.classifiers.trees.J48;
import weka.core.Instances;
import weka.core.Instance;
import weka.core.converters.ConverterUtils.DataSource;
import java.util.Scanner;

public class DiseasePrediction {

    private static J48 tree;
    private static Instances data;

    public static void main(String[] args) throws Exception {
        // Load data (ARFF format recommended for Weka)
        DataSource source = new DataSource("disease_data.arff");
        data = source.getDataSet();
        if (data.classIndex() == -1)
            data.setClassIndex(data.numAttributes() - 1);

        // Build classifier
        tree = new J48();
        tree.buildClassifier(data);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter comma-separated values for symptoms (e.g., 1,0,1...): ");
        String[] inputValues = scanner.nextLine().split(",");

        // Create a new instance for prediction
        Instance predInstance = data.instance(0).copy();
        for (int i = 0; i < inputValues.length; i++) {
            predInstance.setValue(i, Double.parseDouble(inputValues[i]));
        }
        predInstance.setDataset(data);

        double result = tree.classifyInstance(predInstance);
        String predictedDisease = data.classAttribute().value((int) result);
        System.out.println("Predicted Disease: " + predictedDisease);
    }
}
