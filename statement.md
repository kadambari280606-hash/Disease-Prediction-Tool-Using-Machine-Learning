Problem Statement
Accurate and timely diagnosis of diseases is challenging due to overlapping symptoms and limited resources for early screening.
Many people delay seeking medical help because of uncertainty about their condition. The Disease Prediction Tool aims to address
this issue by applying machine learning algorithms to user-input symptoms, providing a preliminary assessment of likely diseases,
and helping users receive medical care sooner.​​

Scope of the Project

The project covers the development of a machine learning-based application that predicts multiple common diseases using structured
symptom data. It focuses on real-time prediction through a simple Java interface, leveraging a decision tree classifier and extensible datasets.
The system is designed to be modular, user-friendly, and easily adaptable to new diseases or expanded symptom lists. Future extensions may include 
new algorithms, integration with hospital databases, or support for additional languages.​​

Target Users

Individuals seeking preliminary guidance on their health based on symptoms.
Healthcare practitioners needing a quick screening tool.
Medical students and educators for demonstration purposes.
Developers and researchers interested in health informatics and ML applications.​​


High-level Features

Accepts patient symptom input via a simple interface.
Encodes and processes input data for disease prediction.
Applies a decision tree ML model (Weka) for classification.
Results are displayed with predicted disease and confidence scores.
Dataset and model are both easily configurable and extensible.

No personal data storage; all predictions are session-based.

Supports modular code organization for future feature addition.
