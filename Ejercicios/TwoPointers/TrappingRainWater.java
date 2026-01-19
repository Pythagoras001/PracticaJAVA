package Ejercicios.TwoPointers;

public class TrappingRainWater {

    public static void main(String[] args) {
        System.out.println(trappingWater(new int[]{4,2,0,3,2,5}));
    }

    public static Integer trappingWater(int[] height) {
        // Creamos los punteros
        int iz = 0;
        int der = height.length-1;

        int maxIz = height[0];
        int maxDer = height[height.length - 1];

        int totalAgua = 0;

        //Creamos el two Pointers
        while (iz+1 < der) {
            while (iz < der ) {
                    if (maxDer <= height[der - 1]) {
                        maxDer = height[der - 1];
                        der--;
                    }
                    if (maxIz <= height[iz + 1]){ 
                        maxIz = height[iz + 1];
                        iz++;
                    }
                    if (maxDer > height[der - 1] && maxIz > height[iz + 1]) break;
            }
        
            if (maxIz >= maxDer){
                totalAgua += maxDer - height[der-1];
                der --;
    
            }else{
                totalAgua += maxIz - height[iz + 1];
                iz ++;
            }
        }
        return totalAgua;
    }
}
