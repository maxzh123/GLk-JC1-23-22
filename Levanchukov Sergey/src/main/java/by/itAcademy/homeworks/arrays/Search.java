package by.itAcademy.homeworks.arrays;


/**Поиск первого минимального и последнего */

public class Search {
    private static int firstMinIndex;
    private static int firstMaxIndex;
    private static int lastMinIndex;
    private static int lastMaxIndex;
    private static int min;
    private static int max;

    public static int getIndexMin(int[] array){
        indexAssignment(array);
        return min;
    }

    public static int getIndexMax(int[] array){
        indexAssignment(array);
        return max;
    }

    private static void indexAssignment(int[] array){
        firstMax(array);
        lastMax(array);
        firstMin(array);
        lastMin(array);
        theMostDistantIndices();
    }


    /**Поиск максимального и минимального индекса в массиве*/
    public static void lastMin(int [] arr){
        int min=arr[arr.length-1];
        int lastInMin=arr.length-1;
        for (int i=arr.length-2;i>=0;i--){
            if (arr[i]<min){
                min=arr[i];
                lastInMin=i;
            }
        }
        lastMinIndex=lastInMin;
    }
    public static void firstMin (int [] arr){
        int min=arr[0];
        int firstInMin=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                firstInMin=i;
            }
        }
        firstMinIndex=firstInMin;
    }
    public static void lastMax(int [] arr){
        int max=arr[arr.length-1];
        int lastInMax=arr.length-1;
        for (int i=arr.length-2;i>=0;i--){
            if (arr[i]>max){
                max=arr[i];
                lastInMax=i;
            }
        }
        lastMaxIndex=lastInMax;
    }
    public static void firstMax (int [] arr){
        int max=arr[0];
        int firstInMax=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                firstInMax=i;
            }
        }
        firstMaxIndex=firstInMax;
    }
    /**Определяем наибольшее растояние путем вычета индексов*/
    private static void theMostDistantIndices(){
        int distanceOne = Math.abs(firstMaxIndex - firstMinIndex);
        int distanceTwo = Math.abs(firstMaxIndex - lastMinIndex);
        int distanceThree = Math.abs(lastMaxIndex - firstMinIndex);
        int distanceFour = Math.abs(lastMaxIndex - lastMinIndex);
        if (distanceOne>=distanceTwo && distanceOne>=distanceThree && distanceOne>=distanceFour){
            min = firstMinIndex; max = firstMaxIndex;
        } else if (distanceTwo>=distanceOne && distanceTwo>=distanceThree && distanceTwo>=distanceFour){
            min = lastMinIndex; max = firstMaxIndex;
        } else if (distanceThree>=distanceOne && distanceThree>=distanceTwo && distanceThree>=distanceFour){
            min = firstMinIndex; max = lastMaxIndex;
        } else if (distanceFour>=distanceOne && distanceFour>=distanceTwo && distanceFour>=distanceThree){
            min = lastMinIndex; max = lastMaxIndex;
        }
    }

}
