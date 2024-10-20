package com.example.calculatorapp;

public class Calculator {
    public static String calculate(String expression){
        SubstringParam calculateSample = new SubstringParam();
        StringBuffer sb = new StringBuffer(expression);
        double ResultDouble;
        int ResultInt;
        while(getSampleSubstring('*', sb.toString()).index!=-1){
             calculateSample=getSampleSubstring('*', sb.toString());
             sb.replace(calculateSample.index,calculateSample.index+calculateSample.sampleExpression.length(),Double.toString(simpleOperation(calculateSample.sampleExpression)));
        }
        while(getSampleSubstring('/', sb.toString()).index!=-1){
            calculateSample=getSampleSubstring('/', sb.toString());
            sb.replace(calculateSample.index,calculateSample.index+calculateSample.sampleExpression.length(),Double.toString(simpleOperation(calculateSample.sampleExpression)));
        }
        while(getSampleSubstring('+', sb.toString()).index!=-1){
            calculateSample=getSampleSubstring('+', sb.toString());
            sb.replace(calculateSample.index,calculateSample.index+calculateSample.sampleExpression.length(),Double.toString(simpleOperation(calculateSample.sampleExpression)));
        }
        while(getSampleSubstring('-', sb.toString()).index!=-1){
            calculateSample=getSampleSubstring('-', sb.toString());
            sb.replace(calculateSample.index,calculateSample.index+calculateSample.sampleExpression.length(),Double.toString(simpleOperation(calculateSample.sampleExpression)));
        }
        if(Double.parseDouble(sb.toString())%1==0) {
            ResultDouble = Double.parseDouble(sb.toString());
            ResultInt = (int) ResultDouble;
            return Integer.toString(ResultInt);
        }
        else
            return sb.toString();
    };



    private static boolean isNumber(char c){
        int cc=(int)c;
        return (cc>=48 && cc<=57);

    }

    public static double simpleOperation(String expression){
        boolean operatorFound = false;
        char operator;
        double result=0;
        double leftOpperand, RightOpperand;
        for(int i=0;i<expression.length();i++){
            if(expression.charAt(i)=='+'||expression.charAt(i)=='-'||expression.charAt(i)=='*'||expression.charAt(i)=='/'){
                operator=expression.charAt(i);
                leftOpperand=Double.parseDouble(expression.substring(0,i));
                RightOpperand=Double.parseDouble(expression.substring(i+1));
                if(operator=='*')
                    result=leftOpperand*RightOpperand;
                if(operator=='/')
                        result = leftOpperand / RightOpperand;
                if(operator=='+')
                    result=leftOpperand+RightOpperand;
                if(operator=='-')
                    result=leftOpperand-RightOpperand;
                operatorFound=true;
                break;
            }
        }
        if(!operatorFound) {throw new ArithmeticException("no operator");}

        return result;
    }

    public static SubstringParam getSampleSubstring(char operator, String expression){
        SubstringParam param = new SubstringParam();
        param.index=-1;
        param.sampleExpression="";
        int endIndex = 0;
        for(int i=0;i<expression.length();i++){
            if(expression.charAt(i)==operator){
                for (int j = i - 1; j >=0; j--) {
                    if (!isNumber(expression.charAt(j)) && expression.charAt(j)!='.')
                        break;
                    param.index = j;
                }
                for(int j = i + 1; j < expression.length(); j++) {
                    if (!isNumber(expression.charAt(j))&& expression.charAt(j)!='.')
                        break;
                    endIndex = j;
                }
                break;
            }
        }
        if(param.index!=-1)
            param.sampleExpression=expression.substring(param.index,endIndex+1);
        return param;
    }
}
