# UPPERCASE Detector
This is a small library for evaluating if first letter of input Strings is in uppercase.

## Getting started

1. Go to the main directory
2. Run the following command


    mvn clean package
    
3. Run compiled jar file with words as parameters using following command


    java -jar target/uppercase-detector.jar <WORDS>
    
Example:
    
    java -jar target/uppercase-detector.jar Apple Orange Grape
    
    
You should get the following output in case all words are in upper case
    

    Yes! All input parameters are in upper case.

Otherwise you get:

    No! Not all input parameters are in upper case.

