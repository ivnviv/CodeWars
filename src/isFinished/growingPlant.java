package isFinished;

/*
Each day a plant is growing by upSpeed meters.
Each night that plant's height decreases by downSpeed meters due to the lack of sun heat. Initially, plant is 0 meters tall.
We plant the seed at the beginning of a day. We want to know when the height of the plant will reach a certain level.

Example
For upSpeed = 100, downSpeed = 10 and desiredHeight = 910, the output should be 10.
 */
public class growingPlant {
    public static int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
        int initialHeight = 0;
        int counter = 0;
        while (initialHeight<desiredHeight){
            initialHeight = initialHeight + upSpeed;
            if (initialHeight>=desiredHeight){
                counter++;
            }else{
                initialHeight = initialHeight-downSpeed;
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(growingPlant(10,9,4));
    }
}
