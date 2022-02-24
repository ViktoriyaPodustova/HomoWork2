package HW2;

public class Main {
    public static void main(String[] args) {
        String[][] arr1 = new String[3][3];

        try{
            elementConversionAndSum(arr1);
        } catch (MyArraySizeException | MyArrayDataException exception) {
            System.out.println(exception.getMessage());
        }

        String[][] arr2= {{"10","10", "15", "0"}, {"5","0","2","6"}, {"2","0","8","3"}, {"5","4","6","9"}};
        try{
            elementConversionAndSum(arr2);
        }
            catch (MyArraySizeException | MyArrayDataException ex){
                System.out.println(ex.getMessage());
            }
    }
    public static void elementConversionAndSum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
         if (arr.length != 4) {
            throw new MyArraySizeException();
        }
         int sum=0;
        for (int i=0; i< arr.length; i++){
            if (arr[i].length != 4){
                throw new MyArraySizeException();
            }
            for (int j=0; j< arr.length; j++){
        try{
            int element = Integer.parseInt(arr[i][j]);
            sum+=element;
        }catch (NumberFormatException e){
            throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println("Сумма элементов массива: " + sum);
    }

}
