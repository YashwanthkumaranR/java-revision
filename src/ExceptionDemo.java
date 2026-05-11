class ExceptionDemo {

    public static void main(String[] args){
        try{
            int result = 10/0;
            System.out.println("Done");
        }
        catch(ArithmeticException e){
            System.out.println("Cannot be divided by 0"+ e.getMessage());
        }
        finally {
            System.out.println("This block runs anyway");
        }
    }
}



class AgeValidator {
    static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("The age is not met the criteria");
        } else {
            System.out.println("Valid age : " + age);
        }
    }

    public static void main(String[] args) {
        int age = 9;
        try {
            validateAge(age);
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        }
    }
}

class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}

class CustomException{
    static void checkAge(int age) throws InvalidAgeException {
        if(age < 18){
            throw new InvalidAgeException("Invalid Age");
        }
        else{
            System.out.println("Valid Age : "+ age);
        }
    }

    public static void main(String[] args){
        try{
            checkAge(15);
        }
        catch(InvalidAgeException e){
            System.out.println("Error " + e.getMessage());
        }
    }
}