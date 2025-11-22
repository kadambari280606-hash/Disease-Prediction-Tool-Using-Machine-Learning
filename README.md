# Disease-Prediction-Tool-Using-Machine-Learning

Disease Prediction Tool Using Machine Learning
Overview of the Project
This project is a user-friendly Java application that predicts the most likely disease based on entered symptoms, utilizing a machine learning classifier. The tool demonstrates how artificial intelligence can facilitate faster, early-stage screening in healthcare, helping guide users towards timely medical attention.​

Features
Allows users to input symptoms via terminal or GUI.
Encodes symptoms and applies an ML classifier (Decision Tree via Weka).
Returns the most probable disease with confidence scores.
Easily extensible dataset and disease classes.
Modular code (separate input, processing, and prediction modules).
Fast prediction results (under 2 seconds per query).
No user data retained—session-based privacy for all predictions.​

Technologies/Tools Used

Java 8+
Weka (open-source ML library for Java)
ARFF data files (for machine learning datasets)
Optional: Swing/JavaFX (for GUI enhancement)
Git (for version control).​

Steps to Install & Run the Project

Clone the GitHub repository:
git clone [your-repo-url]
Download the Weka library (weka.jar) and add it to your project's lib/ folder.

Open the project in your preferred IDE (Eclipse/IntelliJ).
Place your dataset file (disease_data.arff) in the project root or specified location.
Run DiseasePrediction.java.
Enter symptoms as prompted (e.g., 1,0,1,0 for fever, cough, fatigue, rash).

Instructions for Testing

Use the included disease_data.arff sample dataset for quick testing.
Input symptoms as specified, then verify that the predicted disease matches expected sample data.
For unit testing, add more test cases in separate methods to process sample inputs and validate results.

Optional: Use Weka’s built-in test harness for automated evaluation of accuracy, precision, and recall on the dataset.
